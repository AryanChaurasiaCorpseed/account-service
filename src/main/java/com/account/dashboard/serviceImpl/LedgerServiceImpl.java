package com.account.dashboard.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.dashboard.domain.Organization;
import com.account.dashboard.domain.account.Ledger;
import com.account.dashboard.domain.account.LedgerType;
import com.account.dashboard.dto.LedgerDto;
import com.account.dashboard.dto.UpdateLedgerDto;
import com.account.dashboard.repository.LedgerRepository;
import com.account.dashboard.repository.LedgerTypeRepository;
import com.account.dashboard.repository.OrganizationRepository;
import com.account.dashboard.service.LedgerService;
@Service
public class LedgerServiceImpl implements LedgerService{

	@Autowired
	LedgerRepository ledgerRepository;

	@Autowired
	LedgerTypeRepository ledgerTypeRepository;
	
	@Autowired
	OrganizationRepository organizationRepository;

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

		if(ledgerDto.isHsnSacPresent()) {
			l.setHsnSacDetails(ledgerDto.getHsnSacDetails());
			l.setHsnSacPrsent(ledgerDto.isHsnSacPresent());
			l.setHsnSacName(ledgerDto.getHsnSac());
			l.setHsnDescription(ledgerDto.getHsnDescription());
		}
		if(ledgerDto.isGstRateDetailPresent()) {
			l.setGstRateDetailPresent(ledgerDto.isGstRateDetailPresent());
			l.setGstRateDetails(ledgerDto.getGstRateDetails());
			Organization org = organizationRepository.findByName("corpseed");
			if(org!=null) {
				String state = org.getState();
				if(state.equalsIgnoreCase(ledgerDto.getState())) {
					String gstRateDetails=ledgerDto.getGstRateDetails();
					double gst = Double.parseDouble(gstRateDetails);
					double cgst=gst/2;
					double sgst=gst-cgst;
//					ledgerDto.get
				l.setCgst(cgst+"");
				l.setSgst(sgst+"");
                l.setCgstSgstPresent(true);

				l.setGstRateDetails(gstRateDetails);
				}else {
					String gstRateDetails=ledgerDto.getGstRateDetails();
                    l.setIgstPresent(true);
					l.setGstRateDetails(gstRateDetails);
					l.setIgst(gstRateDetails);


				}
			}else {
				String gstRateDetails=ledgerDto.getGstRateDetails();
				l.setGstRateDetails(gstRateDetails);
				l.setIgst(gstRateDetails);
			}
			l.setTaxabilityType(ledgerDto.getTaxabilityType());
			l.setGstRates(ledgerDto.getGstRates());
		}
		//

		if(ledgerDto.isBankAccountPresent()){
			l.setBankAccountPrsent(ledgerDto.isBankAccountPresent());
//			l.setAccountHolderName(ledgerDto.getAccountHolderName());
			l.setAccount(ledgerDto.getAccountNo());
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


		if(updateLedgerDto.isHsnSacPresent()) {
			l.setHsnSacPrsent(updateLedgerDto.isHsnSacPresent());

			l.setHsnSacDetails(updateLedgerDto.getHsnSacDetails());
			l.setHsnSacName(updateLedgerDto.getHsnSac());
			l.setHsnDescription(updateLedgerDto.getHsnDescription());
		}
		if(updateLedgerDto.isGstRateDetailPresent()) {
			l.setGstRateDetailPresent(updateLedgerDto.isGstRateDetailPresent());
			l.setGstRateDetails(updateLedgerDto.getGstRateDetails());
			l.setTaxabilityType(updateLedgerDto.getTaxabilityType());
			l.setGstRates(updateLedgerDto.getGstRates());
		}
		//

		if(updateLedgerDto.isBankAccountPresent()){
			l.setBankAccountPrsent(updateLedgerDto.isBankAccountPresent());
//			l.setAccountHolderName(updateLedgerDto.getAccountHolderName());
			l.setAccount(updateLedgerDto.getAccountNo());
			l.setIfscCode(updateLedgerDto.getIfscCode());
			l.setSwiftCode(updateLedgerDto.getSwiftCode());
			l.setBankName(updateLedgerDto.getBankName());
			l.setBranch(updateLedgerDto.getBranch());
		}
		ledgerRepository.save(l);
		flag=true;
		return flag;
	}

	@Override
	public Ledger getLedgerById(Long id) {
		Ledger ledger = ledgerRepository.findById(id).get();
		return ledger;
	}

	@Override
	public List<Ledger> globalSearchLedger(String name) {
		List<Ledger> ledger=ledgerRepository.findByNameLike(name);
		return ledger;
	}

	@Override
	public List<Ledger> getAllLedgerByGroupId(Long id) {
		 List<Ledger> ledger = ledgerRepository.findAllByLedgerTypeId(id);
		return ledger;
	}



}
