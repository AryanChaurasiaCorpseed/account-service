package com.account.dashboard.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.account.dashboard.domain.ManageSales;
import com.account.dashboard.domain.User;
import com.account.dashboard.dto.CreateAccountData;
import com.account.dashboard.dto.UpdateAccountData;
import com.account.dashboard.repository.AccountRepository;
import com.account.dashboard.repository.UserRepository;
import com.account.dashboard.service.AccountService;

public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepository accountRepository;
	@Autowired
	UserRepository userRepository;
	
	@Override
	public ManageSales getAccountData(Long accountId) {
		Optional<ManageSales> account = accountRepository.findById(accountId);
		return account.get();
	}

	@Override
	public List<ManageSales> getAllAccountData() {
		List<ManageSales> accountList=accountRepository.findAll();
		return accountList;
	}

	@Override
	public ManageSales DeleteAccountData(Long manageSalesId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ManageSales createAccountData(CreateAccountData createAccountData) {
		ManageSales manageSales = new ManageSales();
		manageSales.setClientId(manageSales.getClientId());
		User createdBy = userRepository.findById(createAccountData.getCreatedById()).get();
		manageSales.setCreatedBy(createdBy);
		manageSales.setEstimateNo(createAccountData.getEstimateNo());
//		manageSales.setGovermentCode(createAccountData.getg);
		manageSales.setGovermentfees(createAccountData.getGovFees());
//		manageSales.setGovermentGst(createAccountData.getG);
//		manageSales.setManageSalesAmount(createAccountData);
//		manageSales.setOtherCode(createAccountData.get);
		manageSales.setOtherFees(createAccountData.getOthertherFees());
//		manageSales.setOtherGst(null);
//		manageSales.setPaidAmount(0);
//		manageSales.setProfesionalGst(null);
//		manageSales.setProfessionalCode(null);
		manageSales.setProfessionalFees(createAccountData.getProfessionalFees());
		manageSales.setProjectId(createAccountData.getProjectId());
		manageSales.setServiceCharge(createAccountData.getServiceCharge());
//		manageSales.setServiceCode(null);
//		manageSales.setServiceGst(null);
		manageSales.setTotalAmount(createAccountData.getTotalAmount());
//		manageSales.setTotalFees(0);
		User updatedBy = userRepository.findById(createAccountData.getCreatedById()).get();
		manageSales.setUpdatedBy(updatedBy);
		return manageSales;
	}

	@Override
	public ManageSales updateAccountData(UpdateAccountData updateAccountData) {
		// TODO Auto-generated method stub
		return null;
	}

}
