package com.account.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.account.dashboard.domain.account.Ledger;

@Repository
public interface LedgerRepository extends JpaRepository<Ledger, Long> {

}
