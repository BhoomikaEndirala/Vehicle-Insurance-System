package com.vehicleinsurancesystem.main.policyRepolayer;



import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicleinsurancesystem.main.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

