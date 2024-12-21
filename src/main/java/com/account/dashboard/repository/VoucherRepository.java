package com.account.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.account.dashboard.domain.account.Voucher;
@Repository
public interface VoucherRepository extends JpaRepository<Voucher, Long> {

	@Query(value = "SELECT * FROM voucher v WHERE v.ledger_id =:ledgerId", nativeQuery = true)
	List<Voucher> findAllByLedgerId(Long ledgerId);

	@Query(value = "SELECT * FROM voucher v WHERE v.create_date BETWEEN :d1 AND :d2", nativeQuery = true)
	List<Voucher> findByIdInBetween(String d1, String d2);

}
