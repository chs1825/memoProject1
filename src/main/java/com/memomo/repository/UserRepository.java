package com.memomo.repository;

import com.memomo.entity.User;

import java.util.List;

public interface UserRepository {

    User findById(String id);

    User findByName(String name);

    List<User> findAll();

    void save(User user);

    void deleteById(String id);

    void update(User user);


}
