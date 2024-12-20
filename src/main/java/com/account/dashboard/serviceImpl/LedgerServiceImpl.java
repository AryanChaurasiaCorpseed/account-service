package com.account.dashboard.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.dashboard.domain.account.Ledger;
import com.account.dashboard.domain.account.LedgerType;
import com.account.dashboard.dto.LedgerDto;
import com.account.dashboard.dto.UpdateLedgerDto;
import com.account.dashboard.repository.LedgerRepository;
import com.account.dashboard.repository.LedgerTypeRepository;
import com.account.dashboard.service.LedgerService;
@Service
public class LedgerServiceImpl implements LedgerService{

	@Autowired
	LedgerRepository ledgerRepository;

	@Autowired
	LedgerTypeRepository ledgerTypeRepository;

	@Override
	public Boolean createLedger(LedgerDto ledgerDto) {
		Boolean flag=false;
		Ledger l = new Ledger();
		l.setName(ledgerDto.getName());
		l.setEmail(ledgerDto.getEmail());
		l.setAddress(ledgerDto.getAddress());
		l.setState(ledgerDto.getState());
		l.setCountry(ledgerDto.getCountry());
		l.setPin(ledgerDto.getPin());

		System.out.println(ledgerDto.getLedgerTypeId()+".......id");
		Optional<LedgerType> ledgerType = ledgerTypeRepository.findById(ledgerDto.getLedgerTypeId());
		if(ledgerType!=null&&ledgerType.isPresent() && ledgerType.get()!=null) {
			l.setLedgerType(ledgerType.get());
		}


		if(ledgerDto.isHsnSac()) {
			l.setHsnSacDetails(ledgerDto.getHsnSacDetails());
			l.setHsnSac(ledgerDto.getHsnSac());
			l.setHsnDescription(ledgerDto.getHsnDescription());
		}
		if(ledgerDto.isGstRateDetails()) {
			l.setGstRateDetails(ledgerDto.isGstRateDetails());
			l.setGstRateDetails(ledgerDto.getGstRateDetails());
			l.setTaxabilityType(ledgerDto.getTaxabilityType());
			l.setGstRates(ledgerDto.getGstRates());
		}
		//

		if(ledgerDto.isBankAccount()){
			l.setBankAccount(ledgerDto.isBankAccount());
			l.setAccountHolderName(ledgerDto.getAccountHolderName());
			l.setAccountNo(ledgerDto.getAccountNo());
			l.setIfscCode(ledgerDto.getIfscCode());
			l.setSwiftCode(ledgerDto.getSwiftCode());
			l.setBankName(ledgerDto.getBankName());
			l.setBranch(ledgerDto.getBranch());
		}
		ledgerRepository.save(l);
		flag=true;
		return flag;

	}

	@Override
	public List<Ledger> getAllLedger() {
		List<Ledger> ledgerList = ledgerRepository.findAll();
		return ledgerList;
	}

	@Override
	public Boolean updateLadger(UpdateLedgerDto updateLedgerDto) {
		Boolean flag=false;
		Ledger l = ledgerRepository.findById(updateLedgerDto.getId()).get();
		l.setName(updateLedgerDto.getName());
		l.setEmail(updateLedgerDto.getEmail());
		l.setAddress(updateLedgerDto.getAddress());
		l.setState(updateLedgerDto.getState());
		l.setCountry(updateLedgerDto.getCountry());
		l.setPin(updateLedgerDto.getPin());

		System.out.println(updateLedgerDto.getLedgerTypeId()+".......id");
		Optional<LedgerType> ledgerType = ledgerTypeRepository.findById(updateLedgerDto.getLedgerTypeId());
		if(ledgerType!=null&&ledgerType.isPresent() && ledgerType.get()!=null) {
			l.setLedgerType(ledgerType.get());
		}


		if(updateLedgerDto.isHsnSac()) {
			l.setHsnSacDetails(updateLedgerDto.getHsnSacDetails());
			l.setHsnSac(updateLedgerDto.getHsnSac());
			l.setHsnDescription(updateLedgerDto.getHsnDescription());
		}
		if(updateLedgerDto.isGstRateDetails()) {
			l.setGstRateDetails(updateLedgerDto.isGstRateDetails());
			l.setGstRateDetails(updateLedgerDto.getGstRateDetails());
			l.setTaxabilityType(updateLedgerDto.getTaxabilityType());
			l.setGstRates(updateLedgerDto.getGstRates());
		}
		//

		if(updateLedgerDto.isBankAccount()){
			l.setBankAccount(updateLedgerDto.isBankAccount());
			l.setAccountHolderName(updateLedgerDto.getAccountHolderName());
			l.setAccountNo(updateLedgerDto.getAccountNo());
			l.setIfscCode(updateLedgerDto.getIfscCode());
			l.setSwiftCode(updateLedgerDto.getSwiftCode());
			l.setBankName(updateLedgerDto.getBankName());
			l.setBranch(updateLedgerDto.getBranch());
		}
		ledgerRepository.save(l);
		flag=true;
		return flag;
	}



}
