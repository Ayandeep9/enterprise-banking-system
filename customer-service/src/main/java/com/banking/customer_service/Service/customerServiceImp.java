package com.banking.customer_service.Service;

import com.banking.customer_service.Repository.customerRepo;
import com.banking.customer_service.model.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class customerServiceImp implements customerService{

    @Autowired
    private customerRepo customerRepo;

    @Override
    public customer createCustomer(customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public customer getCustomerById(Long id) {
        return customerRepo.findById(id).orElse(null);
    }

    @Override
    public List<customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepo.deleteById(id);
    }
}
