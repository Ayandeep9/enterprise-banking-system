package com.banking.customer_service.Repository;

import com.banking.customer_service.model.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface customerRepo extends JpaRepository<customer, Long> {
}
