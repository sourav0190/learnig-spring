package com.sourav.springsecurity.identity.controller;

import com.sourav.springsecurity.identity.entity.UserEntity;
import com.sourav.springsecurity.identity.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {

    @Autowired
    private SignupRepository signupRepository;

    @PostMapping("/signup")
    public String signup(@RequestBody UserEntity userEntity) {
        signupRepository.save(userEntity);
        return "signup successfully";
    }
}
