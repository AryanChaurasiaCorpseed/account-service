package com.account.dashboard.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.account.dashboard.config.LeadFeignClient;
import com.account.dashboard.domain.Organization;
import com.account.dashboard.domain.PaymentRegister;
import com.account.dashboard.domain.account.Ledger;
import com.account.dashboard.domain.account.LedgerType;
import com.account.dashboard.domain.account.Voucher;
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
	public Ledger createLedgerDto(Map<String, Object> feignLeadClient) {


		Boolean flag=false;
		Ledger l = new Ledger();
		l.setName(feignLeadClient.get("name").toString());
		l.setEmail(feignLeadClient.get("name").toString());
		l.setAddress(feignLeadClient.get("address").toString());
		l.setState(feignLeadClient.get("State").toString());
		l.setCountry(feignLeadClient.get("country").toString());
		l.setPin(feignLeadClient.get("pin").toString());

		//		Optional<LedgerType> ledgerType = ledgerTypeRepository.findById(ledgerDto.getLedgerTypeId());
		//		if(ledgerType!=null&&ledgerType.isPresent() && ledgerType.get()!=null) {
		//			l.setLedgerType(ledgerType.get());
		//		}

		//		if(ledgerDto.isHsnSacPresent()) {
		//			l.setHsnSacDetails(ledgerDto.getHsnSacDetails());
		//			l.setHsnSacPrsent(ledgerDto.isHsnSacPresent());
		//			l.setHsnSac(ledgerDto.getHsnSac());
		//			l.setHsnDescription(ledgerDto.getHsnDescription());
		//		}

		//ledger gst part
		//		if(ledgerDto.isGstRateDetailPresent()) {
		//			l.setGstRateDetailPresent(ledgerDto.isGstRateDetailPresent());
		//			l.setGstRateDetails(ledgerDto.getGstRateDetails());
		//			Organization org = organizationRepository.findByName("corpseed");
		//			if(org!=null) {
		//				String state = org.getState();
		//				if(state.equalsIgnoreCase(ledgerDto.getState())) {
		//					String gstRateDetails=ledgerDto.getGstRateDetails();
		//					double gst = Double.parseDouble(gstRateDetails);
		//					double cgst=gst/2;
		//					double sgst=gst-cgst;
		////					ledgerDto.get
		//				l.setCgst(cgst+"");
		//				l.setSgst(sgst+"");
		//                l.setCgstSgstPresent(true);
		//
		//				l.setGstRateDetails(gstRateDetails);
		//				}else {
		//					String gstRateDetails=ledgerDto.getGstRateDetails();
		//                    l.setIgstPresent(true);
		//					l.setGstRateDetails(gstRateDetails);
		//					l.setIgst(gstRateDetails);
		//
		//
		//				}
		//			}else {
		//				String gstRateDetails=ledgerDto.getGstRateDetails();
		//				l.setGstRateDetails(gstRateDetails);
		//				l.setIgst(gstRateDetails);
		//			}
		//			l.setTaxabilityType(ledgerDto.getTaxabilityType());
		//			l.setGstRates(ledgerDto.getGstRates());
		//		}
		//

		//		if(ledgerDto.isBankAccountPresent()){
		//			l.setBankAccountPrsent(ledgerDto.isBankAccountPresent());
		//			l.setAccountHolderName(ledgerDto.getAccountHolderName());
		//			l.setAccountNo(ledgerDto.getAccountNo());
		//			l.setIfscCode(ledgerDto.getIfscCode());
		//			l.setSwiftCode(ledgerDto.getSwiftCode());
		//			l.setBankName(ledgerDto.getBankName());
		//			l.setBranch(ledgerDto.getBranch());
		//		}
		//		ledgerRepository.save(l);
		return null;


	}

	@Override
	public Boolean paymentApproveAndDisapproved(UpdatePaymentDto updatePaymentDto) {
		//hit project and company creation
		//create create group
		//create ledger
		//create voucher
		LedgerType group = ledgerTypeRepository.findByName(updatePaymentDto.getPaymentType());
		if(group!=null) {
			if(updatePaymentDto.getPaymentType().equals("SALES")) {

			}else {

			}

		}else {
			if(updatePaymentDto.getPaymentType().equals("SALES")) {


				LedgerType g = new LedgerType();
				g.setName(updatePaymentDto.getPaymentType());
				Ledger l = new Ledger();
				l.setName(updatePaymentDto.getCompanyName());
				Map<String, Object> feignLeadClient = LeadFeignClient.getEstimateById(updatePaymentDto.getEstimateId());


				Voucher v =new Voucher();
				long govermentfees =Long.valueOf(updatePaymentDto.getGovermentfees()!=null?updatePaymentDto.getGovermentfees():"0");
				long govermentGst =Long.valueOf(updatePaymentDto.getGovermentGst()!=null?updatePaymentDto.getGovermentGst():"0");
				long professionalFees =Long.valueOf(updatePaymentDto.getProfessionalFees()!=null?updatePaymentDto.getProfessionalFees():"0");
				long professionalGst =Long.valueOf(updatePaymentDto.getProfesionalGst()!=null?updatePaymentDto.getProfesionalGst():"0");
				long serviceCharge =Long.valueOf(updatePaymentDto.getServiceCharge()!=null?updatePaymentDto.getServiceCharge():"0");
				long getServiceGst =Long.valueOf(updatePaymentDto.getServiceGst()!=null?updatePaymentDto.getServiceGst():"0");
				long otherFees =Long.valueOf(updatePaymentDto.getOtherFees()!=null?updatePaymentDto.getOtherFees():"0");
				long otherGst =Long.valueOf(updatePaymentDto.getOtherGst()!=null?updatePaymentDto.getOtherGst():"0");
				long totalDebit=govermentfees+professionalFees+serviceCharge+otherFees;
				long totaDebitGst = govermentGst+professionalGst+getServiceGst+otherGst;
				v.setDebitAmount(totalDebit+"");
				v.setIgstPresent(true);//cgst+sgst concept
				v.setIgst(totaDebitGst+"");

				v.setLedger(l);
				
				
				//project api hit 

			}else {

			}

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
