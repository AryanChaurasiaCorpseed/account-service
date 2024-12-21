package com.account.dashboard.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.dashboard.domain.account.LedgerType;
import com.account.dashboard.dto.CreateStatutoryDetails;
import com.account.dashboard.repository.LedgerTypeRepository;
import com.account.dashboard.service.StatutoryService;

@Service
public class StatutoryServiceImpl implements StatutoryService {
	
	@Autowired
	LedgerTypeRepository ledgerTypeRepository;

	@Override
	public Boolean createLedgerType(CreateStatutoryDetails createStatutoryDetails) {
		LedgerType ledgerType = ledgerTypeRepository.findById(createStatutoryDetails.getId()).get();
		
		return null;
	}

}
