package com.account.dashboard.util;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
public interface UrlsMapping {
	public final static String PREFIX = "leadService/api/v1";
	
	
	//======================= Lead Service =============
	
	public static final String TEST=PREFIX+ "/lead/test";
}
