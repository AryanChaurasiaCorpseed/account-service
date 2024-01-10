package com.account.dashboard.service;

import java.util.List;

import com.account.dashboard.domain.ManageSales;
import com.account.dashboard.dto.CreateAccountData;
import com.account.dashboard.dto.UpdateAccountData;

public interface AccountService {


	ManageSales getAccountData(Long accountId);

	List<ManageSales> getAllAccountData();
	
	ManageSales DeleteAccountData(Long manageSalesId);

	ManageSales createAccountData(CreateAccountData createAccountData);

	ManageSales updateAccountData(UpdateAccountData updateAccountData);

}
