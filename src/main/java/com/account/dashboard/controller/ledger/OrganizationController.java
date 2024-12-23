package com.account.dashboard.controller.ledger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.account.dashboard.dto.CreateLedgerTypeDto;
import com.account.dashboard.util.UrlsMapping;

@RestController
public class OrganizationController {

	
	@PostMapping(UrlsMapping.CREATE_ORGANIIZATION)
	public Boolean createOrganization(@RequestBody CreateLedgerTypeDto createLedgerTypeDto){
//		Boolean res=ledgerService.createLedgerType(createLedgerTypeDto);	
		return null;
	}
}
