package com.airoport.airoports.controllers;

import com.airoport.airoports.dto.RegisterDTO;
import com.airoport.airoports.models.User;
import com.airoport.airoports.servies.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/register")
    public User registerUser(@RequestBody RegisterDTO registerDTO){
        return authenticationService.registerUser(registerDTO.getUsername(), registerDTO.getPassword());
    }
}
