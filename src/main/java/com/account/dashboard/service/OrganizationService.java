package com.account.dashboard.service;

import org.springframework.stereotype.Service;

import com.account.dashboard.dto.CreateLedgerTypeDto;

@Service
public interface OrganizationService {

	Boolean createOrganization(CreateLedgerTypeDto createLedgerTypeDto);

}
