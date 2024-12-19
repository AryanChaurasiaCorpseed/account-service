package com.account.dashboard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.account.dashboard.domain.account.LedgerType;

@Service
public interface LedgerTypeService {

	Boolean createLedgerType(String name, boolean subLeadger, boolean isDebitCredit, boolean usedForCalculation);

	Boolean updateLedgerType(Long id, String name, boolean subLeadger, boolean isDebitCredit, boolean usedForCalculation);

	List<LedgerType> getAllLedgerType();


	Boolean deleteLedgerType(Long id);

}
