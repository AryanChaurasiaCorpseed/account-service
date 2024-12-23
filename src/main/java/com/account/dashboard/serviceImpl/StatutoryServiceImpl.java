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
		Boolean flag=false;
		LedgerType ledgerType = ledgerTypeRepository.findById(createStatutoryDetails.getId()).get();
		ledgerType.setHsnSac(createStatutoryDetails.isHsnSac());
		ledgerType.setHsnSacDetails(createStatutoryDetails.getHsnSacDetails());
		ledgerType.setHsnDescription(createStatutoryDetails.getHsnDescription());
		ledgerType.setHsnSacData(createStatutoryDetails.getHsnSacData());
		ledgerType.setClassification(createStatutoryDetails.getClassification());

		ledgerType.setGstRate(createStatutoryDetails.isGstRate());
		ledgerType.setGstRateDetails(createStatutoryDetails.getGstRateDetails());
		ledgerType.setTaxabilityType(createStatutoryDetails.getTaxabilityType());
		ledgerType.setGstRatesData(createStatutoryDetails.getGstRatesData());

		ledgerType.setBankAccount(createStatutoryDetails.isBankAccount());
		ledgerType.setAccountHolderName(createStatutoryDetails.getAccountHolderName());
		ledgerType.setAccountNo(createStatutoryDetails.getAccountNo());
		ledgerType.setIfscCode(createStatutoryDetails.getIfscCode());
		ledgerType.setSwiftCode(createStatutoryDetails.getSwiftCode());
		ledgerType.setBankName(createStatutoryDetails.getBankName());
		ledgerType.setBranch(createStatutoryDetails.getBranch());

		ledgerTypeRepository.save(ledgerType);
		flag=true;
		return flag;
	}

	@Override
	public Boolean updateStatutoryDetails(CreateStatutoryDetails createStatutoryDetails) {
		Boolean flag=false;
		LedgerType ledgerType = ledgerTypeRepository.findById(createStatutoryDetails.getId()).get();
		ledgerType.setHsnSac(createStatutoryDetails.isHsnSac());
		ledgerType.setHsnSacDetails(createStatutoryDetails.getHsnSacDetails());
		ledgerType.setHsnDescription(createStatutoryDetails.getHsnDescription());
		ledgerType.setHsnSacData(createStatutoryDetails.getHsnSacData());
		ledgerType.setClassification(createStatutoryDetails.getClassification());

		ledgerType.setGstRate(createStatutoryDetails.isGstRate());
		ledgerType.setGstRateDetails(createStatutoryDetails.getGstRateDetails());
		ledgerType.setTaxabilityType(createStatutoryDetails.getTaxabilityType());
		ledgerType.setGstRatesData(createStatutoryDetails.getGstRatesData());

		ledgerType.setBankAccount(createStatutoryDetails.isBankAccount());
		ledgerType.setAccountHolderName(createStatutoryDetails.getAccountHolderName());
		ledgerType.setAccountNo(createStatutoryDetails.getAccountNo());
		ledgerType.setIfscCode(createStatutoryDetails.getIfscCode());
		ledgerType.setSwiftCode(createStatutoryDetails.getSwiftCode());
		ledgerType.setBankName(createStatutoryDetails.getBankName());
		ledgerType.setBranch(createStatutoryDetails.getBranch());

		ledgerTypeRepository.save(ledgerType);
		flag=true;
		return flag;
	}

	@Override
	public LedgerType getStatutoryDetailsById(Long id) {
		LedgerType ledgerType = ledgerTypeRepository.findById(id).get();
		return ledgerType;
	}

}
