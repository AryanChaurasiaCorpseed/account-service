package com.account.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.dashboard.domain.PaymentRegister;

public interface PaymentRegisterRepository  extends JpaRepository<PaymentRegister, Long> {

}
