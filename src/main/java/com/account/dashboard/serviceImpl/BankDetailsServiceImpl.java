package com.account.dashboard.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.dashboard.domain.BankDetails;
import com.account.dashboard.dto.CreateBankDetailsDto;
import com.account.dashboard.dto.UpdateBankDetailsDto;
import com.account.dashboard.repository.BankDetailsRepository;
import com.account.dashboard.service.BankDetailsService;

@Service
public class BankDetailsServiceImpl implements BankDetailsService {

	
	@Autowired
	BankDetailsRepository bankDetailsRepository;
	@Override
	public Boolean createBankDetails(CreateBankDetailsDto createBankDetailsDto) {
		    Boolean flag=false;
			BankDetails bd= new BankDetails();
			bd.setBankName(createBankDetailsDto.getBankName());
			bd.setBranch(createBankDetailsDto.getBranch());
			bd.setBranchName(createBankDetailsDto.getBranch());
			bd.setIfscCode(createBankDetailsDto.getIfscCode());
			bankDetailsRepository.save(bd);
			flag=true;
		return flag;
	}
	@Override
	public List<BankDetails> getAllBankDetails() {
		List<BankDetails> bankDetailsList = bankDetailsRepository.findAll();
		return bankDetailsList;
	}
	@Override
	public BankDetails updateBankDetails(UpdateBankDetailsDto updateBankDetailsDto) {
		BankDetails bankDetails = bankDetailsRepository.findById(updateBankDetailsDto.getId()).get();
		bankDetails.setBankName(null);
		bankDetails.setBranch(null);
		bankDetails.setBranchName(null);
		bankDetails.setIfscCode(null);
		bankDetailsRepository.save(bankDetails);
		return bankDetails;
	}

}
