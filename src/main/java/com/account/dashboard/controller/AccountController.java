package com.account.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.dashboard.util.UrlsMapping;

@RestController
public class AccountController {
	
	@GetMapping(UrlsMapping.TEST)
	public String test()
	{
//		return securityFeignClient.test();	
		System.out.println("Test . . . .");
		return "Test";		 

	}
}
