package com.memomo.service;

import com.memomo.entity.User;
import com.memomo.repository.UserRepository;
import com.memomo.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository uR;

    public User getUserByName(String name){
        return uR.findByName(name);
    }

}
