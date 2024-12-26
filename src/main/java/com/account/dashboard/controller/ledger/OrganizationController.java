package com.account.dashboard.controller.ledger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.account.dashboard.dto.CreateLedgerTypeDto;
import com.account.dashboard.util.UrlsMapping;
import com.account.dashboard.service.OrganizationService;
@RestController
public class OrganizationController {
    
	@Autowired
	OrganizationService organizationService;
	
	@PostMapping(UrlsMapping.CREATE_ORGANIIZATION)
	public Boolean createOrganization(@RequestBody CreateLedgerTypeDto createLedgerTypeDto){
		Boolean res=organizationService.createOrganization(createLedgerTypeDto);	
		return null;
	}
}
