package com.account.dashboard.controller.sales;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.account.dashboard.domain.PaymentRegister;
import com.account.dashboard.domain.account.Voucher;
import com.account.dashboard.service.PaymentRegisterService;
import com.account.dashboard.util.UrlsMapping;

@Controller
public class PaymentRegisterController {
	
	@Autowired
	PaymentRegisterService paymentRegisterService;

	@GetMapping(UrlsMapping.CREATE_PAYMENT_REGISTER)
	public List<PaymentRegister> createPaymentRegister(){
		List<PaymentRegister> res=paymentRegisterService.createPaymentRegister();	
		return res;
		
	}
}
