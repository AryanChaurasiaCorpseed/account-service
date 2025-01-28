package com.account.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.account.dashboard.domain.PaymentRegister;
@Repository
public interface PaymentRegisterRepository  extends JpaRepository<PaymentRegister, Long> {

	@Query(value = "SELECT * FROM payment_register v WHERE v.estimate_id =:id", nativeQuery = true)
	List<PaymentRegister> findAllByEstimateId(long id);
	
	@Query(value = "SELECT * FROM payment_register v WHERE v.estimate_id =:id and v.status =:status", nativeQuery = true)
	List<PaymentRegister> findAllByEstimateId(long id,String status);
	
	@Query(value = "SELECT * FROM payment_register v WHERE v.status =:status", nativeQuery = true)
	List<PaymentRegister> findAllByEstimateId(String status);

}
