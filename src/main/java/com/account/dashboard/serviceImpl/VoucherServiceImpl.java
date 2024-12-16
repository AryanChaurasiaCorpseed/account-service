package com.account.dashboard.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.dashboard.domain.account.Ledger;
import com.account.dashboard.domain.account.Voucher;
import com.account.dashboard.domain.account.VoucherType;
import com.account.dashboard.dto.CreateVoucherDto;
import com.account.dashboard.repository.LedgerRepository;
import com.account.dashboard.repository.LedgerTypeRepository;
import com.account.dashboard.repository.VoucherRepository;
import com.account.dashboard.repository.VoucherTypeRepo;
import com.account.dashboard.service.VoucherService;

@Service
public class VoucherServiceImpl implements VoucherService{
	
	@Autowired
	LedgerRepository ledgerRepository;
	
	@Autowired
	LedgerTypeRepository ledgerTypeRepository;
	
	@Autowired 
	VoucherTypeRepo voucherTypeRepo;

	@Autowired
	VoucherRepository voucherRepository;
	
	@Override
	public Boolean createVoucher(CreateVoucherDto createVoucherDto) {
		Boolean flag=false;
       Voucher v = new Voucher();
        v.setCompanyName(createVoucherDto.getCompanyName());
        if(createVoucherDto.getCreditAmount()!=null ) {
        	v.setCreditDebit(true);
        	v.setCreditAmount(createVoucherDto.getCreditAmount());
        }
        if(createVoucherDto.getDebitAmount()!=null ) {
        	v.setCreditDebit(true);
        	v.setDebitAmount(createVoucherDto.getDebitAmount());
        }
        v.setCreateDate(new Date());
        Ledger ledger = ledgerRepository.findById(createVoucherDto.getLedgerId()).get();
        v.setLedger(ledger);
        
        v.setPaymentType(createVoucherDto.getPaymentType());
        
        VoucherType voucherType = voucherTypeRepo.findById(createVoucherDto.getVoucherTypeId()).get();
        v.setVoucherType(voucherType);
        voucherRepository.save(v);
        flag=true;
		return flag;
	}

	@Override
	public List<Voucher> getAllVoucher() {
		List<Voucher>voucher=voucherRepository.findAll();
		return voucher;
	}

}
