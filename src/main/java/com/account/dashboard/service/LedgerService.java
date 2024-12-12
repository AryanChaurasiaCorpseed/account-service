package com.account.dashboard.service;

import java.util.List;

import com.account.dashboard.domain.account.Ledger;
import com.account.dashboard.dto.LedgerDto;

public interface LedgerService {

	Boolean createLedger(LedgerDto ledgerDto);

	List<Ledger> getAllLedger();

}
