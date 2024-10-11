package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;


@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    

    /*POST*/
    public void insertUser(User user){
        userRepository.save(user);
    }

    /*GET*/
    public List<User> findAll(){
        return userRepository.findAll();
    }



    public User findByNome(String nome){
        return userRepository.findByNome(nome);
    }

    
}

