package com.account.dashboard.controller.ledger;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.account.dashboard.domain.account.Ledger;
import com.account.dashboard.domain.account.Voucher;
import com.account.dashboard.dto.CreateVoucherDto;
import com.account.dashboard.dto.LedgerDto;
import com.account.dashboard.service.VoucherService;
import com.account.dashboard.util.UrlsMapping;


@RestController
public class VoucherController {
	
	@Autowired
	VoucherService voucherService;
    
	
	@PostMapping(UrlsMapping.CREATE_VOUCHER)
	public Boolean createVoucher(@RequestBody CreateVoucherDto createVoucherDto){
		System.out.println("ghghgg name .."+createVoucherDto.getCompanyName());

		Boolean res=voucherService.createVoucher(createVoucherDto);	
		return res;
	}
	
	@GetMapping(UrlsMapping.GET_ALL_VOUCHER)
	public List<Voucher> getAllVoucher(){
		List<Voucher> res=voucherService.getAllVoucher();	
		return res;
		
	}
	
	@GetMapping(UrlsMapping.GET_VOUCHER_AMOUNT)
	public Map<String,Object> getVoucherAmount(){
		Map<String,Object> res=voucherService.getVoucherAmount();	
		return res;
	}
	
	
	@GetMapping(UrlsMapping.GET_ALL_VOUCHER_BY_LEDGER_ID)
	public Map<String,Object> getAllVoucherByLedgerId(@RequestParam Long ledgerId){
		Map<String,Object> res=voucherService.getAllVoucherByLedgerId(ledgerId);	
		return res;
	}
}
