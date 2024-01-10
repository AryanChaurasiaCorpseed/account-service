package com.account.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.account.dashboard.domain.ManageSales;
import com.account.dashboard.dto.CreateAccountData;
import com.account.dashboard.dto.UpdateAccountData;
import com.account.dashboard.service.AccountService;
import com.account.dashboard.util.UrlsMapping;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@GetMapping(UrlsMapping.TEST)
	public String test()
	{
		System.out.println("Test . . . .");
		return "Test";		 

	}
	@PostMapping(UrlsMapping.CREATE_ACCOUNT_DATA)
	public ManageSales createAccountData(CreateAccountData createAccountData)
	{
		ManageSales account=accountService.createAccountData(createAccountData);
		return account;		 

	}	
	@GetMapping(UrlsMapping.GET_ACCOUNT_DATA)
	public ManageSales getAccountData(@RequestParam Long accountId)
	{
		ManageSales account=accountService.getAccountData(accountId);
		return account;		 

	}
	@GetMapping(UrlsMapping.GET_ALL_ACCOUNT_DATA)
	public List<ManageSales> getAllAccountData()
	{
		List<ManageSales> account=accountService.getAllAccountData();
		return account;		 
	}
	@PutMapping(UrlsMapping.UPDATE_ACCOUNT_DATA)
	public ManageSales updateAccountData(UpdateAccountData updateAccountData)
	{
		ManageSales account=accountService.updateAccountData(updateAccountData);
		return account;		 

	}	
	@DeleteMapping(UrlsMapping.UPDATE_ACCOUNT_DATA)
	public ManageSales DeleteAccountData(Long manageSalesId)
	{
		ManageSales account=accountService.DeleteAccountData(manageSalesId);
		return account;		 

	}	
}
