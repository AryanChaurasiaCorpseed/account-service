package com.account.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.account.dashboard.domain.InvoiceData;

@Repository
public interface InvoiceDataRepository extends JpaRepository<InvoiceData, Long> {

}
