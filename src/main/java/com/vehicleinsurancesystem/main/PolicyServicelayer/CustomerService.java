package com.vehicleinsurancesystem.main.PolicyServicelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.vehicleinsurancesystem.main.Customer;
import com.vehicleinsurancesystem.main.policyRepolayer.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository cr;
    public String registerCustomer(Customer customer) {

        // check if email already exists
        boolean emailExists = cr.existsByEmail(customer.getEmail());

        if (emailExists) {
            return "This email is already used. Please try another.";
        }

        // set status to Pending
        customer.setStatus("Pending");

        // save the customer in DB
        cr.save(customer);

        return "Customer registered successfully.";
    }
}
