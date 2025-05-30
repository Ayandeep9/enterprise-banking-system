package com.banking.account_service.Service;

import com.banking.account_service.DTO.CustomerDTO;
import com.banking.account_service.FeignClient.accountClient;
import com.banking.account_service.Repository.accountRepo;
import com.banking.account_service.model.account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class accountServiceImp implements accountService{

    @Autowired
    private accountRepo accountRepo;

    @Autowired
    private accountClient accountClient;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${customer.service.url}")
    private String customerServiceUrl;

    public CustomerDTO getCustomerDetails(Long customerId) {
        return accountClient.getAccountsByCustomerId(customerId);
    }

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
