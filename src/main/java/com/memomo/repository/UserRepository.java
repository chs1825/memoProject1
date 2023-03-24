package com.memomo.repository;

import com.memomo.entity.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import java.util.List;
import java.util.Optional;

@Repository
@ComponentScan
public interface UserRepository extends JpaRepository<User,String> {

    List<User> findAll();
    Optional<User> findById(String id);



}
