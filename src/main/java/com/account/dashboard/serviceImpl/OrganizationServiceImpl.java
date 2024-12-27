package com.account.dashboard.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.dashboard.domain.Organization;
import com.account.dashboard.dto.CreateLedgerTypeDto;
import com.account.dashboard.dto.OrganizationDto;
import com.account.dashboard.repository.OrganizationRepository;
import com.account.dashboard.service.OrganizationService;


@Service
public class OrganizationServiceImpl implements OrganizationService{

	@Autowired
	OrganizationRepository  organizationRepository;

	@Override
	public Boolean createOrganization(OrganizationDto organizationDto) throws Exception {
		Boolean flag=false;
		Organization organization=organizationRepository.findByName(organizationDto.getName());
		if(organization==null) {
			organization = new Organization();
			organization.setName(organizationDto.getName());
			organization.setJoiningDate(new Date());
			organization.setPin(organizationDto.getPin());
			organization.setAddress(organizationDto.getAddress());
			organization.setState(organizationDto.getState());
			organization.setCountry(organizationDto.getCountry());
			organization.setPin(organizationDto.getPin());
			organization.setDeleted(false);
			organizationRepository.save(organization);
		}else {
			throw new Exception("Already Exit");
		}
		flag=true;
		return flag;
	}

	@Override
	public Organization getOrganizationById(Long id) {
		Organization organization = organizationRepository.findById(id).get();
		return organization;
	}

	@Override
	public List<Organization> getAllOrganization() {
		List<Organization> organizationList = organizationRepository.findAll();
		return organizationList;
	}

	@Override
	public Organization getAllOrganizationByName(String name) {
		Organization organization = organizationRepository.findByName(name);
		return organization;
	}

}
