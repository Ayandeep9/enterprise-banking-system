package com.banking.account_service.Service;


import com.banking.account_service.model.account;

import java.util.List;

public interface accountService {
    account createAccount(account account);
    List<account> getAccountsByCustomerId(Long customerId);
    account getAccountById(Long accountId);
    void deleteAccount(Long accountId);
}
