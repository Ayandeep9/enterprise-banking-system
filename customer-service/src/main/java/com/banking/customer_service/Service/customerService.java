package com.banking.customer_service.Service;

import com.banking.customer_service.model.customer;

import java.util.List;

public interface customerService {
    customer createCustomer(customer customer);
    customer getCustomerById(Long id);
    List<customer> getAllCustomers();
    void deleteCustomer(Long id);
}
