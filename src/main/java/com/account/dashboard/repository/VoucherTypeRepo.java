package com.account.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.dashboard.domain.account.VoucherType;

public interface VoucherTypeRepo extends JpaRepository<VoucherType, Long> {

}
