package com.account.dashboard.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
         Optional<Ledger> ledger = ledgerRepository.findById(createVoucherDto.getLedgerId());
        if(ledger!=null && ledger.isPresent()&&ledger.get()!=null) {
            v.setLedger(ledger.get());
        }        
        v.setPaymentType(createVoucherDto.getPaymentType());
        
         Optional<VoucherType> voucherType = voucherTypeRepo.findById(createVoucherDto.getVoucherTypeId());
        if(voucherType!=null &&voucherType.isPresent() && voucherType.get()!=null) {
            v.setVoucherType(voucherType.get());
        }
        voucherRepository.save(v);
        flag=true;
		return flag;
	}

	@Override
	public List<Voucher> getAllVoucher() {
		List<Voucher>voucher=voucherRepository.findAll();
		return voucher;
	}
	
	
	public List<Map<String,Object>> getAllVoucherV1() {
		List<Voucher>voucher=voucherRepository.findAll();
		List<Map<String,Object>>result = new ArrayList<>();
		for(Voucher v:voucher) {
			Map<String,Object>map = new HashMap<>();
				map.put("id", v.getId());
				map.put("companyName", v.getCompanyName());
				map.put("creaditAmount", v.getCreditAmount());
				map.put("debitAmount", v.getDebitAmount());
				map.put("paymentType", v.getPaymentType());
				map.put("createDate", v.getCreateDate());
				map.put("ledger", v.getLedger());
				map.put("ledgerType", v.getLedgerType());
				map.put("voucherType", v.getVoucherType());
				map.put("cerateDate", v.getCreateDate());
			   result.add(map);

		}
		return result;
	}

	@Override
	public Map<String, Object> getVoucherAmount() {
		List<Voucher>voucher=voucherRepository.findAll();
		Map<String,Object>map = new HashMap<>();
        long totalCredit=0;
        long totalDebit=0;
        long totalAmount=0;
        for(Voucher v:voucher) {
        	if(v.isCreditDebit()) {
        		long debitAmount =Long.valueOf(v.getDebitAmount()!=null?v.getDebitAmount():"0");
        		long creditAmount =Long.valueOf(v.getCreditAmount()!=null?v.getCreditAmount():"0");
        		totalCredit=totalCredit+creditAmount;
        		totalDebit=totalDebit+debitAmount;

        		totalAmount=totalAmount+debitAmount-creditAmount;
        	}else {
        		long debitAmount =Long.valueOf(v.getDebitAmount()!=null?v.getDebitAmount():"0");
        		totalDebit=totalDebit+debitAmount;
        		totalAmount=totalAmount+debitAmount;
        		
        	}
        }
        map.put("totalCredit", totalCredit);
        map.put("totalDebit", totalDebit);
        map.put("totalAmount", totalAmount);

		return map;
	}

	@Override
	public List<Map<String, Object>> getAllVoucherByLedgerId(Long ledgerId) {
		
		List<Voucher> voucherList = voucherRepository.findAllByLedgerId(ledgerId);
		List<Map<String, Object>>res= new ArrayList<>();
		 long totalCredit=0;
	        long totalDebit=0;
	        long totalAmount=0;
		for(Voucher v:voucherList) {
			Map<String,Object>map = new HashMap<>();
			map.put("id", v.getId());
			map.put("companyName", v.getCompanyName());
			map.put("paymentType", v.getPaymentType());
			map.put("createDate", v.getCreateDate());
			map.put("ledger", v.getLedger());
			map.put("ledgerType", v.getLedgerType());
			map.put("voucherType", v.getVoucherType());
			map.put("creditAmount", v.getCreditAmount());
			map.put("debitAmount", v.getDebitAmount());
			res.add(map);
			
			
		}
		
		return res;
	}

}
