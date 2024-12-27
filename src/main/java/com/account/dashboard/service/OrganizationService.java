package com.account.dashboard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.account.dashboard.domain.Organization;
import com.account.dashboard.dto.CreateLedgerTypeDto;
import com.account.dashboard.dto.OrganizationDto;

@Service
public interface OrganizationService {

	Boolean createOrganization(OrganizationDto organizationDto) throws Exception;

	Organization getOrganizationById(Long id);

	List<Organization> getAllOrganization();

	Organization getAllOrganizationByName(String name);

}
