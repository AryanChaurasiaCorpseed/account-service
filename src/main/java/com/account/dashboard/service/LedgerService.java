package com.account.dashboard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.account.dashboard.domain.account.Ledger;
import com.account.dashboard.dto.LedgerDto;
@Service
public interface LedgerService {

	Boolean createLedger(LedgerDto ledgerDto);

	List<Ledger> getAllLedger();

}
