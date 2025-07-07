package com.vehicleinsurancesystem.main.policycontrollayer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleinsurancesystem.main.Policies;
import com.vehicleinsurancesystem.main.ExceptionHandling.NoPolicyFoundException;
import com.vehicleinsurancesystem.main.PolicyServicelayer.PolicyService;

@RestController
public class PolicyController {
	@Autowired
	private PolicyService ps;
	
	@PostMapping("/policycreation")
	public Policies createPolicy(@RequestBody Policies policy) {
	    return ps.createPolicy(policy);
	}
	
	@GetMapping("/policies")
	public Page<Policies> getAllPolicies(Pageable pageable) {
	    // Fetch all policies (without pagination) to check if the database is empty
	    boolean hasPolicies = ps.hasPolicies();

	    if (!hasPolicies) {
	        throw new NoPolicyFoundException(); // Throws exception if no policies exist
	    }
	    return ps.getAll(pageable);
	}
	
	@GetMapping("/policies/{policyId}")
	public Policies getPolicyById(@PathVariable String policyId) {
	    Optional<Policies> policyOpt = ps.getById(policyId);
	    if (policyOpt.isPresent()) {
	        return policyOpt.get();
	    } 
	    else {
	    	throw new NoPolicyFoundException(policyId);  
	    }
	}
}
