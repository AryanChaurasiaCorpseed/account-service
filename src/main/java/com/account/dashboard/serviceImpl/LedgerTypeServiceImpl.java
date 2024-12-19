package com.account.dashboard.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.dashboard.domain.account.LedgerType;
import com.account.dashboard.repository.LedgerTypeRepository;
import com.account.dashboard.service.LedgerTypeService;

@Service
public class LedgerTypeServiceImpl implements LedgerTypeService{

	@Autowired
	LedgerTypeRepository ledgerTypeRepository;
	
//	@Override
//	public Boolean createLedgerType(String name) {
//		Boolean flag=false;
//		LedgerType ledgerType = new LedgerType();
//		ledgerType.setName(name);
//		ledgerType.set
//		ledgerTypeRepository.save(ledgerType);
//		flag=true;
//		return flag;
//	}

	@Override
	public Boolean createLedgerType(String name, boolean subLeadger, boolean isDebitCredit,boolean usedForCalculation) {
		Boolean flag=false;
		LedgerType ledgerType = new LedgerType();
		ledgerType.setName(name);
		ledgerType.setDebitCredit(isDebitCredit);
		ledgerType.setSubLeadger(subLeadger);
		ledgerType.setUsedForCalculation(usedForCalculation);
		ledgerTypeRepository.save(ledgerType);
		flag=true;
		return flag;
	}
	
	
	@Override
	public Boolean updateLedgerType(Long id, String name, boolean subLeadger, boolean isDebitCredit,boolean usedForCalculation) {
		Boolean flag=false;
		LedgerType ledgerType = ledgerTypeRepository.findById(id).get();
		ledgerType.setName(name);
		ledgerType.setDebitCredit(isDebitCredit);
		ledgerType.setSubLeadger(subLeadger);
		ledgerType.setUsedForCalculation(usedForCalculation);
		ledgerTypeRepository.save(ledgerType);
		flag=true;
		return flag;
	}

	@Override
	public List<LedgerType> getAllLedgerType() {
		List<LedgerType>leadgerTypeList=ledgerTypeRepository.findAll();
		return leadgerTypeList;
	}


	@Override
	public Boolean deleteLedgerType(Long id) {
		Boolean flag=false;
		Optional<LedgerType> ledgerType = ledgerTypeRepository.findById(id);
		if(ledgerType!=null) {
			LedgerType lType = ledgerType.get();
			lType.setDeleted(false);
			ledgerTypeRepository.save(lType);
			flag=true;
		}
		return flag;
	}

	
	

}
