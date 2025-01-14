package com.account.dashboard.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.account.dashboard.config.LeadFeignClient;
import com.account.dashboard.domain.InvoiceData;
import com.account.dashboard.domain.Organization;
import com.account.dashboard.domain.PaymentRegister;
import com.account.dashboard.domain.User;
import com.account.dashboard.domain.account.Ledger;
import com.account.dashboard.domain.account.LedgerType;
import com.account.dashboard.domain.account.Voucher;
import com.account.dashboard.dto.CreateAccountData;
import com.account.dashboard.dto.CreateAmountDto;
import com.account.dashboard.dto.UpdatePaymentDto;
import com.account.dashboard.repository.InvoiceDataRepository;
import com.account.dashboard.repository.LedgerRepository;
import com.account.dashboard.repository.LedgerTypeRepository;
import com.account.dashboard.repository.OrganizationRepository;
import com.account.dashboard.repository.PaymentRegisterRepository;
import com.account.dashboard.repository.UserRepository;
import com.account.dashboard.repository.VoucherRepository;
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

	@Autowired
	OrganizationRepository organizationRepository;


	@Autowired
	InvoiceDataRepository invoiceDataRepository;


	@Autowired
	VoucherRepository voucherRepository;

	@Autowired
	UserRepository userRepository;


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
//		paymentRegister.setUploadReceipt(createAmountDto.getUploadReceipt());
		paymentRegister.setTotalAmount(createAmountDto.getTotalAmount());
		paymentRegister.setRemark(createAmountDto.getRemark());
		paymentRegister.setPaymentDate(createAmountDto.getPaymentDate());
		paymentRegister.setEstimateNo(createAmountDto.getEstimateNo());
//		paymentRegister.setDoc(createAmountDto.getDoc());
		paymentRegister.setCompanyName(createAmountDto.getCompanyName());

		paymentRegister.setDocPersent(createAmountDto.getDocPersent());
		paymentRegister.setFilingPersent(createAmountDto.getFilingPersent());
		paymentRegister.setLiasoningPersent(createAmountDto.getLiasoningPersent());
		paymentRegister.setCertificatePersent(createAmountDto.getCertificatePersent());
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
//		paymentRegister.setUploadReceipt(updatePaymentDto.getUploadReceipt());
		paymentRegister.setTotalAmount(updatePaymentDto.getTotalAmount());
		paymentRegister.setRemark(updatePaymentDto.getRemark());
		paymentRegister.setPaymentDate(updatePaymentDto.getPaymentDate());
		paymentRegister.setEstimateNo(updatePaymentDto.getEstimateNo());
//		paymentRegister.setDoc(updatePaymentDto.getDoc());
		paymentRegister.setCompanyName(updatePaymentDto.getCompanyName());
		paymentRegisterRepository.save(paymentRegister);
		flag=true;
		return flag;
	}
	public Ledger createLedgerData(Map<String, Object> feignLeadClient,UpdatePaymentDto updatePaymentDto) {


		Boolean flag=false;
		Ledger l = new Ledger();
		l.setName(feignLeadClient.get("name").toString());
		l.setEmail(feignLeadClient.get("name").toString());
		l.setAddress(feignLeadClient.get("address").toString());
		l.setState(feignLeadClient.get("State").toString());
		l.setCountry(feignLeadClient.get("country").toString());
		l.setPin(feignLeadClient.get("pin").toString());

		//
		//				if(ledgerDto.isHsnSacPresent()) {
		//					l.setHsnSacDetails(ledgerDto.getHsnSacDetails());
		//					l.setHsnSacPrsent(ledgerDto.isHsnSacPresent());
		//					l.setHsnSac(ledgerDto.getHsnSac());
		//					l.setHsnDescription(ledgerDto.getHsnDescription());
		//				}

		//		ledger gst part
		if(l.isGstRateDetailPresent()) {
			l.setGstRateDetailPresent(l.isGstRateDetailPresent());
			l.setGstRateDetails(l.getGstRateDetails());
			Organization org = organizationRepository.findByName("corpseed");
			if(org!=null) {
				String state = org.getState();
				String eState=feignLeadClient.get("state").toString();
				if(state.equalsIgnoreCase(eState)) {
					String gstRateDetails=updatePaymentDto.getProfesionalGst();//gst percent from company
					double gst = Double.parseDouble(gstRateDetails);
					double cgst=gst/2;
					double sgst=gst-cgst;
					l.setCgst(cgst+"");
					l.setSgst(sgst+"");
					l.setCgstSgstPresent(true);

					l.setGstRateDetails(gstRateDetails);
				}else {
					String gstRateDetails=updatePaymentDto.getProfesionalGst();//gst percent from company
					l.setIgstPresent(true);
					l.setGstRateDetails(gstRateDetails);
					l.setIgst(gstRateDetails);


				}
			}else {
				String gstRateDetails=updatePaymentDto.getProfesionalGst();//gst percent from company
				l.setGstRateDetails(gstRateDetails);
				l.setIgst(gstRateDetails);
			}
			//					l.setTaxabilityType(ledgerDto.getTaxabilityType());
			l.setGstRates(updatePaymentDto.getProfesionalGst());
		}


		//		if(ledgerDto.isBankAccountPresent()){
		//			l.setBankAccountPrsent(ledgerDto.isBankAccountPresent());
		//			l.setAccountHolderName(ledgerDto.getAccountHolderName());
		//			l.setAccountNo(ledgerDto.getAccountNo());
		//			l.setIfscCode(ledgerDto.getIfscCode());
		//			l.setSwiftCode(ledgerDto.getSwiftCode());
		//			l.setBankName(ledgerDto.getBankName());
		//			l.setBranch(ledgerDto.getBranch());
		//		}
		ledgerRepository.save(l);
		return null;


	}

	@Override
	public Boolean paymentApproveAndDisapproved(UpdatePaymentDto updatePaymentDto) {
		//hit project and company creation
		//create create group
		//create ledger
		//create voucher
		Map<String, Object> feignLeadClient = LeadFeignClient.getEstimateById(updatePaymentDto.getEstimateId());

		LedgerType group = ledgerTypeRepository.findByName(updatePaymentDto.getPaymentType());
		if(group!=null) {
			if(updatePaymentDto.getPaymentType().equals("SALES")) {
				Ledger ledger = ledgerRepository.findByName(updatePaymentDto.getCompanyName());
				if(ledger!=null) {
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
					v.setLedger(ledger);
					v.setEstimateId(updatePaymentDto.getEstimateId());
					voucherRepository.save(v);
				}else {
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

					v.setLedger(ledger);
					v.setEstimateId(updatePaymentDto.getEstimateId());

					voucherRepository.save(v);
				}

			}else {

			}

		}else {
			if(updatePaymentDto.getPaymentType().equals("SALES")) {


				LedgerType g = new LedgerType();
				g.setName(updatePaymentDto.getPaymentType());

				//				Map<String, Object> feignLeadClient = LeadFeignClient.getEstimateById(updatePaymentDto.getEstimateId());
				Ledger l=createLedgerData(feignLeadClient,updatePaymentDto);

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
				voucherRepository.save(v);

				//also project api hit 

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

	public Boolean paymentApproveAndDisapprovedV2(UpdatePaymentDto updatePaymentDto) {
		Boolean flag=false;
		Map<String, Object> feignLeadClient = LeadFeignClient.getEstimateById(updatePaymentDto.getEstimateId());

		List<Voucher> voucherList=voucherRepository.findByEstimateId(updatePaymentDto.getEstimateId());
		if(voucherList!=null) {  // Already created

			Ledger ledger = ledgerRepository.findByName(updatePaymentDto.getCompanyName());

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
			v.setLedger(ledger);
			v.setEstimateId(updatePaymentDto.getEstimateId());
			voucherRepository.save(v);
			flag=true;
		}else {
			LedgerType group = ledgerTypeRepository.findByName(updatePaymentDto.getPaymentType());

			if(group!=null) {
				Ledger ledger = ledgerRepository.findByName(updatePaymentDto.getCompanyName());
				if(ledger!=null) {

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
					v.setLedger(ledger);
					v.setEstimateId(updatePaymentDto.getEstimateId());
					voucherRepository.save(v);
					flag=true;
				}else {
					Ledger l=createLedgerData(feignLeadClient,updatePaymentDto);

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
					v.setLedger(ledger);
					v.setEstimateId(updatePaymentDto.getEstimateId());
					voucherRepository.save(v);
					flag=true;
				}	
			}			
		}
		return false;

	}

	public Boolean createInvoice(Long estimateId) {
		Map<String, Object> feignLeadClient = LeadFeignClient.getEstimateById(estimateId);

		InvoiceData invoiceData=new InvoiceData();
		invoiceData.setCreateDate(new Date());

		//		 invoiceData.setProduct(product);
		invoiceData.setAddress(null);

		invoiceData.setPrimaryContactId(estimateId);

		invoiceData.setProductName(feignLeadClient.get("productName").toString());


		String assignee = feignLeadClient.get("assigneeId").toString();
		Long assigneeId=Long.parseLong(assignee);

		if(assigneeId!=null) {
			User user = userRepository.findById(assigneeId).get();
			invoiceData.setAssignee(user);
		}
		// company
		//		 if(createservicedetails.isConsultant()) {
		//			 ConsultantByCompany consultantByCompany =new ConsultantByCompany();
		//			 consultantByCompany.setName(createservicedetails.getOriginalCompanyName());
		//			 consultantByCompany.setOriginalContact(createservicedetails.getOriginalContact());
		//			 consultantByCompany.setOriginalEmail(createservicedetails.getOriginalEmail());
		//			 consultantByCompany.setAddress(createservicedetails.getOriginalAddress());
		//			 consultantByCompanyRepository.save(consultantByCompany);
		//			 serviceDetails.setConsultantByCompany(consultantByCompany);
		//
		//		 }

		//		 invoiceData.setIsPresent(createservicedetails.getIsPresent());
		//		 invoiceData.setCompanyName(createservicedetails.getCompanyName());
		//		 invoiceData.setCompanyId(createservicedetails.getCompanyId());
		//		 invoiceData.setUnit(createservicedetails.isUnit());
		//		 invoiceData.setUnitName(createservicedetails.getUnitName());
		//		 invoiceData.setUnitId(createservicedetails.getUnitId());
		//		 invoiceData.setPanNo(createservicedetails.getPanNo());


		String lead = feignLeadClient.get("leadId").toString();
		Long leadId=Long.parseLong(lead);
		invoiceData.setLeadId(leadId);

		invoiceData.setGstNo(feignLeadClient.get("gstNo").toString());

		invoiceData.setGstType(feignLeadClient.get("gstType").toString());
		invoiceData.setGstDocuments(feignLeadClient.get("gstNo").toString());//misssing 

		invoiceData.setCompanyAge(feignLeadClient.get("companyAge").toString());
		invoiceData.setGovermentfees(feignLeadClient.get("govermentFees").toString());
		invoiceData.setGovermentCode(feignLeadClient.get("govermentCode").toString());
		invoiceData.setGovermentGst(feignLeadClient.get("govermentGst").toString());

		invoiceData.setProfessionalFees(feignLeadClient.get("professionalFees").toString());
		invoiceData.setProfessionalCode(feignLeadClient.get("profesionalCode").toString());
		invoiceData.setProfesionalGst(feignLeadClient.get("profesionalGst").toString());

		invoiceData.setServiceCharge(feignLeadClient.get("serviceCharge").toString());
		invoiceData.setServiceCode(feignLeadClient.get("serviceCode").toString());
		invoiceData.setServiceGst(feignLeadClient.get("serviceGst").toString());

		invoiceData.setOtherFees(feignLeadClient.get("otherFees").toString());
		invoiceData.setOtherCode(feignLeadClient.get("otherCode").toString());
		invoiceData.setOtherGst(feignLeadClient.get("otherGst").toString());

		invoiceData.setAddress(feignLeadClient.get("address").toString());
		invoiceData.setCity(feignLeadClient.get("city").toString());
		invoiceData.setPrimaryPinCode(feignLeadClient.get("primaryPinCode").toString());
		invoiceData.setState(feignLeadClient.get("state").toString());
		invoiceData.setCountry(feignLeadClient.get("country").toString());

		invoiceData.setSecondaryAddress(feignLeadClient.get("secondaryAddress").toString());
		invoiceData.setSecondaryCity(feignLeadClient.get("secondaryCity").toString()); 
		invoiceData.setSecondaryPinCode(feignLeadClient.get("secondaryPinCode").toString());
		invoiceData.setSecondaryState(feignLeadClient.get("secondaryState").toString());
		invoiceData.setSecondaryCountry(feignLeadClient.get("secondaryCountry").toString());

		invoiceData.setInvoiceNote(feignLeadClient.get("invoiceNote").toString());
		invoiceData.setOrderNumber(feignLeadClient.get("orderNumber").toString());
		invoiceData.setPurchaseDate(feignLeadClient.get("purchaseDate").toString());//CURRENT DATE 
		invoiceData.setEstimateData((Date)feignLeadClient.get("estimateDate"));
		invoiceData.setRemarksForOption(feignLeadClient.get("address").toString());
		invoiceData.setCc((List<String>)feignLeadClient.get("ccMail"));
		if(feignLeadClient.get("primaryContactId")!=null) {

			invoiceData.setPrimaryContactId((long)feignLeadClient.get("primaryContactId"));
			invoiceData.setPrimaryContactTitle(feignLeadClient.get("primaryContactTitle").toString());
			invoiceData.setPrimaryContactName(feignLeadClient.get("primaryContactName").toString());
			invoiceData.setPrimaryContactemails(feignLeadClient.get("primaryContactEmails").toString());
			invoiceData.setPrimaryContactNo(feignLeadClient.get("primaryContactContactNo").toString());
		}
		if(feignLeadClient.get("secondaryContactId")!=null) {
			invoiceData.setSecondaryContactId((long)feignLeadClient.get("secondaryContactId"));
			invoiceData.setSecondaryContactTitle(feignLeadClient.get("secondaryContactTitle").toString());
			invoiceData.setSecondaryContactName(feignLeadClient.get("secondaryContactName").toString());
			invoiceData.setSecondaryContactemails(feignLeadClient.get("secondaryContactEmails").toString());
			invoiceData.setSecondaryContactNo(feignLeadClient.get("secondaryContactContactNo").toString());
		}
		
		
		invoiceDataRepository.save(invoiceData);

		return true;
	}





}
