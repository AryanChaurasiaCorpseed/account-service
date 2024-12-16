package com.account.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.account.dashboard.domain.account.Voucher;
@Repository
public interface VoucherRepository extends JpaRepository<Voucher, Long> {

}
