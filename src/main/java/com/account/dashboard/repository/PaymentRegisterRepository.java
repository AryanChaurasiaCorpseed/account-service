package com.account.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.account.dashboard.domain.PaymentRegister;
@Repository
public interface PaymentRegisterRepository  extends JpaRepository<PaymentRegister, Long> {

}
