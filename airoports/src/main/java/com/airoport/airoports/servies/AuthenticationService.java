package com.airoport.airoports.servies;

import com.airoport.airoports.models.Role;
import com.airoport.airoports.models.User;
import com.airoport.airoports.repositories.RoleRepository;
import com.airoport.airoports.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerUser(String username, String password){
        String encodePassword = passwordEncoder.encode(password);
        Role userRole = roleRepository.findByTitle("USER").get();

        Set<Role> authories = new HashSet<>();

        authories.add(userRole);

        return userRepository.save(new User(username, encodePassword, authories));
    }
}
