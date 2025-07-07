package com.vehicleinsurancesystem.main;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "claims")
public class ClaimRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long policyId;
    private Long userId;

    private String name;
    private String vehicleType;
    private String vehicleNo;

    private String aadhar;
    private String pan;

    private String reasonToClaim;
    private LocalDate incidentDate;

    @Column(length = 1000)
    private String description;

    private String status = "pending"; // default when created

    // Getters and Setters
}
