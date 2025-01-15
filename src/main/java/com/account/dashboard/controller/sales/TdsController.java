package com.account.dashboard.controller.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.account.dashboard.domain.BankStatement;
import com.account.dashboard.domain.TdsDetail;
import com.account.dashboard.dto.CreateBankStatementDto;
import com.account.dashboard.dto.CreateTdsDto;
import com.account.dashboard.service.BankStatementService;
import com.account.dashboard.service.TdsService;
import com.account.dashboard.util.UrlsMapping;
@RestController
public class TdsController {
    @Autowired
    TdsService tdsService;

	@PostMapping(UrlsMapping.CREATE_TDS)
	public TdsDetail createTds(@RequestBody CreateTdsDto createTdsDto){
		TdsDetail res=tdsService.createTds(createTdsDto);	
		return res;
		
	}
}
