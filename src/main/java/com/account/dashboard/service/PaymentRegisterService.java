package com.account.dashboard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.account.dashboard.domain.PaymentRegister;
import com.account.dashboard.dto.CreateAmountDto;
import com.account.dashboard.dto.UpdatePaymentDto;

@Service
public interface PaymentRegisterService {

	PaymentRegister createPaymentRegister(CreateAmountDto createAmountDto);

	List<PaymentRegister> getAllPaymentRegister();

	Boolean updatePaymentRegister(UpdatePaymentDto updatePaymentDto);

	Boolean paymentApproveAndDisapproved(UpdatePaymentDto updatePaymentDto);

	PaymentRegister getPaymentRegisterById(long id);

	Boolean paymentApproveAndDisapprovedV3(Long paymentRegisterId, Long estimateId);

	List<PaymentRegister> getPaymentRegisterByEstimateId(long id);

}
