package com.banking.account_service.Repository;

import com.banking.account_service.model.account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface accountRepo extends JpaRepository<account, Long> {
    List<account> findByCustomerId(Long customerId);
}
