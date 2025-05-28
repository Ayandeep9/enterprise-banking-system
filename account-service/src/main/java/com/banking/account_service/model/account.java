package com.banking.account_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String accountNumber;

    private String accountType; // SAVINGS, CURRENT, etc.

    private BigDecimal balance;

    private String status; // ACTIVE, CLOSED, etc.

    private LocalDateTime createdAt;

    private Long customerId; // FK (cross-microservice link)
}
