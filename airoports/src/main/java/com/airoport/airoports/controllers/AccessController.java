package com.airoport.airoports.controllers;

import com.airoport.airoports.models.User;
import com.airoport.airoports.repositories.UserRepository;
import io.swagger.v3.oas.annotations.tags.Tag;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Tag(name="Access", description="Взаимодействует с пользователем")
@RestController
@RequestMapping("/api")
public class AccessController {

    @Autowired
    private UserRepository userRepository;

    /**
     * Метод регистрации пользователя
     * @param user
     * @return
     */
    @PutMapping("/register")
    public Long registerUser(@RequestBody User user) {
        userRepository.save(user);
        return user.getUserId();
    }

    /**
     * Метод поиска пользователя по id
     * @param id
     * @return
     */

    @GetMapping("/findusers")
    public Optional<User> getEmployeeById(@RequestParam Long id){
        return userRepository.findById(id);
    }

//    @PostMapping(produces = APPLICATION_JSON_VALUE)
}
