package com.banki.repository;

import com.banki.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepositroy extends JpaRepository<BankAccount, Long>{
}