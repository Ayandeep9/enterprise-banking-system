package com.banking.account_service.Service;

import com.banking.account_service.Repository.accountRepo;
import com.banking.account_service.model.account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class accountServiceImp implements accountService{

    @Autowired
    private accountRepo accountRepo;

    @Override
    public account createAccount(account account) {
        account.setCreatedAt(LocalDateTime.now());
        return accountRepo.save(account);
    }

    @Override
    public List<account> getAccountsByCustomerId(Long customerId) {
        return accountRepo.findByCustomerId(customerId);
    }

    @Override
    public account getAccountById(Long accountId) {
        return accountRepo.findById(accountId).orElse(null);
    }

    @Override
    public void deleteAccount(Long accountId) {
        accountRepo.deleteById(accountId);
    }
}
