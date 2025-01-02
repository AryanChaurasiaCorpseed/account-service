package com.account.dashboard.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name="LEAD-SERVICE", url="http://localhost:9001")
public interface LeadFeignClient {

	@GetMapping("/master/business-activity/test")
	public String test();
}
