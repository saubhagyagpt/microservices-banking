package com.banking.repo;

import com.banking.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepo extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long customerId);
    void deleteByCustomerId(Long customerId);
}
