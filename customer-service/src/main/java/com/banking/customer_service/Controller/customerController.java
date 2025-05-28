package com.banking.customer_service.Controller;

import com.banking.customer_service.Service.customerService;
import com.banking.customer_service.model.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/customer")
public class customerController {
    @Autowired
    private customerService customerService;

    @PostMapping
    public customer createCustomer(@RequestBody customer customer) {
        return customerService.createCustomer(customer);
    }

    @GetMapping("/{id}")
    public customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping
    public List<customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
}
