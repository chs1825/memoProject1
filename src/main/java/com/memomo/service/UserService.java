package com.memomo.service;

import com.memomo.entity.User;
import com.memomo.repository.UserRepository;
import com.memomo.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository uR;

    public User getUserByName(String name){

        return uR.findByName(name);

    }

    public User getUserById(String id){
        return uR.findById(id);
    }

    public List<User> getUser(){
        return uR.findAll();
    }

    public void saveUser(User user){
        uR.save(user);
    }


    public void deleteUser(String id){
        uR.deleteById(id);
    }

    public void updateUser(User user){
        uR.update(user);
    }



}

