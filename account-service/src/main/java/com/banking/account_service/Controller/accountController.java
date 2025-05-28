package com.banking.account_service.Controller;

import com.banking.account_service.Service.accountServiceImp;
import com.banking.account_service.model.account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/account")
public class accountController {
    @Autowired
    private accountServiceImp accountServiceImp;


    @PostMapping
    public account createAccount(@RequestBody account account) {
        return accountServiceImp.createAccount(account);
    }

    @GetMapping("/customer/{customerId}")
    public List<account> getAccountsByCustomerId(@PathVariable Long customerId) {
        return accountServiceImp.getAccountsByCustomerId(customerId);
    }

    @GetMapping("/{id}")
    public account getAccountById(@PathVariable Long id) {
        return accountServiceImp.getAccountById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable Long id) {
        accountServiceImp.deleteAccount(id);
    }

}
