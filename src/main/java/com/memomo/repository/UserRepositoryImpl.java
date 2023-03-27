package com.memomo.repository;

import com.memomo.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext //entityManger의 라이프 사이클 관리해준다.
    private EntityManager entityManager;


    @Override
    public User findById(String id) {

        return entityManager.find(User.class,id);
    }

    @Override
    public User findByName(String name) {
        String jpql = "SELECT u FROM User u WHERE u.name = :name";
        return entityManager.createQuery(jpql, User.class)
                .setParameter("name", name)
                .getSingleResult();
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public void update(User user) {

    }
}
