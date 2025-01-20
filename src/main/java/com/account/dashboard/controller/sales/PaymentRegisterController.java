package com.account.dashboard.controller.sales;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.account.dashboard.domain.InvoiceData;
import com.account.dashboard.domain.PaymentRegister;
import com.account.dashboard.domain.account.Voucher;
import com.account.dashboard.dto.CreateAccountData;
import com.account.dashboard.dto.CreateAmountDto;
import com.account.dashboard.dto.UpdatePaymentDto;
import com.account.dashboard.service.PaymentRegisterService;
import com.account.dashboard.util.UrlsMapping;


@RestController
public class PaymentRegisterController {
	
	@Autowired
	PaymentRegisterService paymentRegisterService;

	@PostMapping(UrlsMapping.CREATE_PAYMENT_REGISTER)
	public PaymentRegister createPaymentRegister(@RequestBody CreateAmountDto createAmountDto){
		PaymentRegister res=paymentRegisterService.createPaymentRegister(createAmountDto);	
		return res;
		
	}
	
	@GetMapping(UrlsMapping.GET_ALL_PAYMENT_REGISTER)
	public List<PaymentRegister> getAllPaymentRegister(){
		List<PaymentRegister> res=paymentRegisterService.getAllPaymentRegister();	
		return res;
		
	}
	
	@PutMapping(UrlsMapping.UPDATE_PAYMENT_REGISTER)
	public Boolean updatePaymentRegister(@RequestBody UpdatePaymentDto updatePaymentDto){
		Boolean res=paymentRegisterService.updatePaymentRegister(updatePaymentDto);	
		return res;
		
	}
	
	
	@GetMapping(UrlsMapping.PAYMENT_APPROVE)
	public Boolean paymentApproveAndDisapproved(@RequestBody UpdatePaymentDto updatePaymentDto){
		Boolean res=paymentRegisterService.paymentApproveAndDisapproved(updatePaymentDto);	
		return res;
		
	}
	
	@GetMapping(UrlsMapping.GET_PAYMENT_REGISTER_BY_ID)
	public PaymentRegister getPaymentRegisterById(@RequestParam long id){
		PaymentRegister res=paymentRegisterService.getPaymentRegisterById(id);	
		return res;
		
	}
	
//	@PutMapping(UrlsMapping.UPDATE_PAYMENT_REGISTER)
//	public Boolean paymentAppro(@RequestBody UpdatePaymentDto updatePaymentDto){
//		Boolean res=paymentRegisterService.updatePaymentRegister(updatePaymentDto);	
//		return res;
//		
//	}
//	
	@PutMapping(UrlsMapping.PAYMENT_APPROVE_V2)
	public Boolean paymentApproveAndDisapprovedv2(@RequestParam Long paymentRegisterId ,@RequestParam Long estimateId){
		Boolean res=paymentRegisterService.paymentApproveAndDisapprovedV3(paymentRegisterId,estimateId);	
		return res;
		
	}
	
	
	@GetMapping(UrlsMapping.GET_PAYMENT_REGISTER_BY_ESTIMATE_ID)
	public List<PaymentRegister> getPaymentRegisterByEstimateId(@RequestParam long id){
		List<PaymentRegister> res=paymentRegisterService.getPaymentRegisterByEstimateId(id);	
		return res;
		
	}
	
	@PutMapping(UrlsMapping.CREATE_INVOICE)
	public Boolean createInvoice(@RequestParam Long id){
		Boolean res=paymentRegisterService.createInvoice(id);	
		return res;
		
	}
	
	
	@PutMapping(UrlsMapping.GET_INVOICE)
	public InvoiceData getInvoice(@RequestParam Long id){
		InvoiceData res=paymentRegisterService.getInvoice(id);	
		return res;
		
	}
}
