package com.vehicleinsurancesystem.main.PolicyServicelayer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleinsurancesystem.main.User;
import com.vehicleinsurancesystem.main.policyRepolayer.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String loginOrRegister(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return "Login successful";
        } else if (user == null) {
            User newUser = new User();
            newUser.setEmail(email);
            newUser.setPassword(password);
            userRepository.save(newUser);
            return "Registration successful";
        }
        return "Invalid credentials";
    }
}
