package com.vehicleinsurancesystem.main.PolicyServicelayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vehicleinsurancesystem.main.Policies;
import com.vehicleinsurancesystem.main.policyRepolayer.PolicyRepository;

@Service
public class PolicyService {
	@Autowired
	private PolicyRepository pr;
	
	public boolean hasPolicies() {
        return pr.count() > 0; // Returns true if the total count is greater than 0
    }

    // Fetch paginated policies
    public Page<Policies> getAll(Pageable pageable) {
        return pr.findAll(pageable);
    }
    
    public Policies createPolicy(Policies policy) {
    	String type = policy.getVehicleType();
    	String year = policy.getYear();
    	String month = policy.getMonth();
    	String prefix = type + " - " + year + " - " + month + " - ";
    	List<Policies> existingPolicies = pr.findByVehicleTypeAndYearAndMonth(type, year, month);
    	int newnum = existingPolicies.size()+1;
    	String numberformatted = String.format("%04d",newnum);
    	String generatedPolicyid = prefix + numberformatted;
    	policy.setPolicyId(generatedPolicyid);
    	return pr.save(policy);
    }
    
    public Optional<Policies> getById(String policyId){
    	return pr.findById(policyId);
    }

}
