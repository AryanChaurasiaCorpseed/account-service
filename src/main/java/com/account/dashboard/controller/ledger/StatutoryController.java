package com.account.dashboard.controller.ledger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.account.dashboard.dto.CreateLedgerTypeDto;
import com.account.dashboard.dto.CreateStatutoryDetails;
import com.account.dashboard.service.StatutoryService;
import com.account.dashboard.util.UrlsMapping;

@RestController
public class StatutoryController {
	
	@Autowired
	StatutoryService statutoryService;

	@PostMapping(UrlsMapping.ADD_STATUTORY_DETAILS)
	public Boolean addStatutoryDetails(@RequestBody CreateStatutoryDetails createStatutoryDetails){
		Boolean res=statutoryService.createLedgerType(createStatutoryDetails);	
		return res;
	}
}
