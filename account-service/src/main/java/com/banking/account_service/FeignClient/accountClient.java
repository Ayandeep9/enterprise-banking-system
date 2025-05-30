package com.banking.account_service.FeignClient;

import com.banking.account_service.DTO.CustomerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "customer-service", path = "/v1/api/customers")
public interface accountClient {
    @GetMapping("/{customerId}")
    CustomerDTO getAccountsByCustomerId(@PathVariable("customerId") Long customerId);
}
