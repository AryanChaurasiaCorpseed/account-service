package com.account.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.account.dashboard.domain.account.Ledger;

@Repository
public interface LedgerRepository extends JpaRepository<Ledger, Long> {

	@Query(value = "SELECT id FROM ledger l WHERE l.id =:id", nativeQuery = true)
	List<Long> findByLedgerTypeId(Long id);

	@Query(value = "SELECT * FROM ledger l WHERE name=:companyName", nativeQuery = true)
	Ledger findByName(String companyName);

}
