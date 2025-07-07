package com.vehicleinsurancesystem.main.PolicyServicelayer;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleinsurancesystem.main.ClaimRequest;
import com.vehicleinsurancesystem.main.policyRepolayer.ClaimRepository;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    public ClaimRequest submitClaim(ClaimRequest claim) {
        return claimRepository.save(claim);
    }
}

