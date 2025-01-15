package com.account.dashboard.service;

import org.springframework.stereotype.Service;

import com.account.dashboard.domain.TdsDetail;
import com.account.dashboard.dto.CreateTdsDto;

@Service
public interface TdsService {

	TdsDetail createTds(CreateTdsDto createTdsDto);

}
