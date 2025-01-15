package com.account.dashboard.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.dashboard.domain.TdsDetail;
import com.account.dashboard.dto.CreateTdsDto;
import com.account.dashboard.repository.TdsDetailRepository;
import com.account.dashboard.service.TdsService;

@Service
public class TdsServiceImpl implements TdsService{
	
	@Autowired
	TdsDetailRepository tdsDetailRepository;

	@Override
	public TdsDetail createTds(CreateTdsDto createTdsDto) {
		TdsDetail tdsDetail = new TdsDetail();
		tdsDetail.setOrganization(createTdsDto.getOrganization());
		tdsDetail.setPaymentRegisterId(createTdsDto.getPaymentRegisterId());
		tdsDetail.setProjectId(createTdsDto.getProjectId());
		tdsDetail.setTdsAmount(createTdsDto.getTdsAmount());
		tdsDetailRepository.save(tdsDetail);
		return tdsDetail;
	}

}
