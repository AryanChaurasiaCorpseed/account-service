package com.account.dashboard.config;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Service
@FeignClient(name="LEAD-SERVICE", url="http://localhost:9001")
public interface LeadFeignClient {
	public final static String PREFIX = "/leadService/api/v1";

	@GetMapping("/master/business-activity/test")
	public String test();
	
	@PostMapping("/leadService/api/v1/leadEstimate/getEstimateById")
	public Map<String, Object> getEstimateById(@RequestBody Long estimateId);
}
