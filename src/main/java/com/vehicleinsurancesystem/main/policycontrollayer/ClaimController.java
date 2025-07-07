package com.vehicleinsurancesystem.main.policycontrollayer;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vehicleinsurancesystem.main.ClaimRequest;
import com.vehicleinsurancesystem.main.PolicyServicelayer.ClaimService;

@RestController
@RequestMapping("/claims")
@CrossOrigin(origins = "*")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @PostMapping("/submit")
    public String submitClaim(@RequestBody ClaimRequest claim) {
        claimService.submitClaim(claim);
        return "Claim submitted successfully!";
    }
}

