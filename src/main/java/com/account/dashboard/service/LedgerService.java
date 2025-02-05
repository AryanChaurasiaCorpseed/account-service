package com.account.dashboard.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.account.dashboard.domain.account.Ledger;
import com.account.dashboard.dto.LedgerDto;
import com.account.dashboard.dto.UpdateLedgerDto;
@Service
public interface LedgerService {

	Boolean createLedger(LedgerDto ledgerDto);

	List<Ledger> getAllLedger();

	Boolean updateLadger(UpdateLedgerDto updateLedgerDto);

	Ledger getLedgerById(Long id);

	List<Ledger> globalSearchLedger(String name);

	List<Ledger> getAllLedgerByGroupId(Long id);

	Map<String, Object> getAllAmountByGroupId(Long id);


}
