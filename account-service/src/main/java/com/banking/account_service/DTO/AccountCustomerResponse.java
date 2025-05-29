package com.banking.account_service.DTO;

import com.banking.account_service.model.account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountCustomerResponse {
    private account account;
    private CustomerDTO customer;
}
