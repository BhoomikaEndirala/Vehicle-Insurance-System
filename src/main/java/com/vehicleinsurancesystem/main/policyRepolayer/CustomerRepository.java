package com.vehicleinsurancesystem.main.policyRepolayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicleinsurancesystem.main.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	boolean existsByEmail(String email);	
}

