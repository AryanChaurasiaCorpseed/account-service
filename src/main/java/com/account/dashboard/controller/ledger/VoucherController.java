package com.account.dashboard.controller.ledger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.account.dashboard.domain.account.Ledger;
import com.account.dashboard.domain.account.Voucher;
import com.account.dashboard.dto.CreateVoucherDto;
import com.account.dashboard.dto.LedgerDto;
import com.account.dashboard.service.VoucherService;
import com.account.dashboard.util.UrlsMapping;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Controller
public class VoucherController {
	
	@Autowired
	VoucherService voucherService;
    
	
	@PostMapping(UrlsMapping.CREATE_LEDGER)
	public Boolean createVoucher(@RequestBody CreateVoucherDto createVoucherDto){
		Boolean res=voucherService.createVoucher(createVoucherDto);	
		return res;
	}
	
	@GetMapping(UrlsMapping.GET_ALL_LEDGER)
	public List<Voucher> getAllVoucher(){
		List<Voucher> res=voucherService.getAllVoucher();	
		return res;
	}
}
