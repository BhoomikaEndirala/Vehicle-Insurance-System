package com.vehicleinsurancesystem.main.policycontrollayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleinsurancesystem.main.Customer;
import com.vehicleinsurancesystem.main.PolicyServicelayer.CustomerService;

import jakarta.validation.Valid;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService cs;
	
	@PostMapping("/customerregister")
	public String registerCustomer(@Valid @RequestBody Customer customer, BindingResult result) {
	    if (result.hasErrors()) {
	        return result.getFieldError().getDefaultMessage();
	    }
	    return cs.registerCustomer(customer);
	}

}
