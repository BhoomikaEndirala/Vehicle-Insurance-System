


package com.vehicleinsurancesystem.main.policycontrollayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vehicleinsurancesystem.main.Policies;
import com.vehicleinsurancesystem.main.User;
import com.vehicleinsurancesystem.main.PolicyServicelayer.AdminService;
import com.vehicleinsurancesystem.main.policyRepolayer.PolicyRepository;
import com.vehicleinsurancesystem.main.policyRepolayer.UserRepository;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PolicyRepository policyRepository;


    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        return adminService.validateLogin(email, password) ? "Login successful" : "Invalid email or password";
   }
//    @GetMapping("/all-users")
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    @GetMapping("/all-policies")
//    public List<Policies> getAllPolicies() {
//        return policyRepository.findAll();
//    }

    @GetMapping("/pending-policies")
    public List<Policies> getPendingPolicies() {
        return policyRepository.findByStatus("PENDING");
    }

    @GetMapping("/approved-policies")
    public List<Policies> getApprovedPolicies() {
        return policyRepository.findByStatus("APPROVED");
    }

//    @PostMapping("/add-user")
//    public String addUser(@RequestBody User user) {
//        userRepository.save(user);
//        return "User added successfully";
//    }

//    
}
