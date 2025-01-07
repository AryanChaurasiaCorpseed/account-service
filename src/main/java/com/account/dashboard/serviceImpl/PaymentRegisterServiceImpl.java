package com.account.dashboard.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.account.dashboard.config.LeadFeignClient;
import com.account.dashboard.domain.PaymentRegister;
import com.account.dashboard.domain.account.Ledger;
import com.account.dashboard.dto.CreateAccountData;
import com.account.dashboard.dto.CreateAmountDto;
import com.account.dashboard.dto.UpdatePaymentDto;
import com.account.dashboard.repository.LedgerRepository;
import com.account.dashboard.repository.LedgerTypeRepository;
import com.account.dashboard.repository.PaymentRegisterRepository;
import com.account.dashboard.service.PaymentRegisterService;

@Service
public class PaymentRegisterServiceImpl implements  PaymentRegisterService{
	

	@Autowired
	PaymentRegisterRepository paymentRegisterRepository;
	
	
	@Autowired
	LedgerTypeRepository ledgerTypeRepository;
	
	@Autowired
	LedgerRepository ledgerRepository;
	
	@Autowired
	LeadFeignClient LeadFeignClient;


	@Override
	public PaymentRegister createPaymentRegister(CreateAmountDto createAmountDto) {
	
		PaymentRegister paymentRegister= new PaymentRegister();
		paymentRegister.setEstimateId(createAmountDto.getEstimateId());
		paymentRegister.setBillingQuantity(createAmountDto.getBillingQuantity());
		paymentRegister.setPaymentType(createAmountDto.getPaymentType());
		paymentRegister.setCreatedById(createAmountDto.getCreatedById());
		paymentRegister.setTransactionId(createAmountDto.getTransactionId());
		paymentRegister.setServiceName(createAmountDto.getServiceName());
		paymentRegister.setGovermentfees(createAmountDto.getGovermentfees());
		paymentRegister.setGovermentGst(createAmountDto.getGovermentGst());
		paymentRegister.setProfessionalFees(createAmountDto.getProfessionalFees());
		paymentRegister.setProfesionalGst(createAmountDto.getProfesionalGst());
		paymentRegister.setServiceCharge(createAmountDto.getServiceCharge());		

		paymentRegister.setOtherFees(createAmountDto.getOtherFees());
		paymentRegister.setOtherGst(createAmountDto.getOtherGst());
		paymentRegister.setUploadReceipt(createAmountDto.getUploadReceipt());
		paymentRegister.setTotalAmount(createAmountDto.getTotalAmount());
		paymentRegister.setRemark(createAmountDto.getRemark());
		paymentRegister.setPaymentDate(createAmountDto.getPaymentDate());
		paymentRegister.setEstimateNo(createAmountDto.getEstimateNo());
		paymentRegister.setDoc(createAmountDto.getDoc());
		paymentRegister.setCompanyName(createAmountDto.getCompanyName());
         paymentRegisterRepository.save(paymentRegister);
		return paymentRegister;
	}


	@Override
	public List<PaymentRegister> getAllPaymentRegister() {
		List<PaymentRegister> paymentRegisterList = paymentRegisterRepository.findAll();
		return paymentRegisterList;
	}


	@Override
	public Boolean updatePaymentRegister(UpdatePaymentDto updatePaymentDto) {
		Boolean flag=false;
		PaymentRegister paymentRegister = paymentRegisterRepository.findById(updatePaymentDto.getId()).get();
		paymentRegister.setEstimateId(updatePaymentDto.getEstimateId());
		paymentRegister.setBillingQuantity(updatePaymentDto.getBillingQuantity());
		paymentRegister.setPaymentType(updatePaymentDto.getPaymentType());
		paymentRegister.setCreatedById(updatePaymentDto.getCreatedById());
		paymentRegister.setTransactionId(updatePaymentDto.getTransactionId());
		paymentRegister.setServiceName(updatePaymentDto.getServiceName());
		paymentRegister.setGovermentfees(updatePaymentDto.getGovermentfees());
		paymentRegister.setGovermentGst(updatePaymentDto.getGovermentGst());
		paymentRegister.setProfessionalFees(updatePaymentDto.getProfessionalFees());
		paymentRegister.setProfesionalGst(updatePaymentDto.getProfesionalGst());
		paymentRegister.setServiceCharge(updatePaymentDto.getServiceCharge());		

		paymentRegister.setOtherFees(updatePaymentDto.getOtherFees());
		paymentRegister.setOtherGst(updatePaymentDto.getOtherGst());
		paymentRegister.setUploadReceipt(updatePaymentDto.getUploadReceipt());
		paymentRegister.setTotalAmount(updatePaymentDto.getTotalAmount());
		paymentRegister.setRemark(updatePaymentDto.getRemark());
		paymentRegister.setPaymentDate(updatePaymentDto.getPaymentDate());
		paymentRegister.setEstimateNo(updatePaymentDto.getEstimateNo());
		paymentRegister.setDoc(updatePaymentDto.getDoc());
		paymentRegister.setCompanyName(updatePaymentDto.getCompanyName());
         paymentRegisterRepository.save(paymentRegister);
         flag=true;
		return flag;
	}


	@Override
	public Boolean paymentApproveAndDisapproved(UpdatePaymentDto updatePaymentDto) {
		if(updatePaymentDto.getPaymentType().equals("SALES")) {
			//hit project and company creation
			//create create group
			//create ledger
			//create voucher
			LedgerType group = ledgerTypeRepository.findByName(updatePaymentDto.getPaymentType());
			if() {
				
			}

		}else {
			
		}
		Ledger ledger=ledgerRepository.findByName(updatePaymentDto.getCompanyName());
		ledger.setName(updatePaymentDto.getCompanyName());
		
		return null;
	}


	@Override
	public PaymentRegister getPaymentRegisterById(long id) {
		PaymentRegister paymentRegister = paymentRegisterRepository.findById(id).get();
		Map<String, Object> estimate = LeadFeignClient.getEstimateById(paymentRegister.getEstimateId());
        System.out.println("estimate ..  . ."+estimate);
		return paymentRegister;
	}

}
