package com.vehicleinsurancesystem.main.policycontrollayer;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vehicleinsurancesystem.main.PolicyServicelayer.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String loginOrRegister(@RequestParam String email, @RequestParam String password) {
        return userService.loginOrRegister(email, password);
    }
}

