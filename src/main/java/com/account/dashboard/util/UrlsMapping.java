package com.account.dashboard.util;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
public interface UrlsMapping {
	public final static String PREFIX = "accountService/api/v1";
	
	
	//======================= USER API=============
	
	public static final String TEST=PREFIX+ "/account/test";	
	public static final String GET_ALL_USER=PREFIX+ "/users/getAllUser";
	public static final String IS_USER_EXIST_OR_NOT=PREFIX+ "/users/isUserExistOrNot";
	public static final String CREATE_USER=PREFIX+ "/users/createUser";
	public static final String CREATE_USER_BY_LEAD=PREFIX+ "/users/createUserByLead";

	public static final String GET_USER=PREFIX+ "/users/getUser";
	public static final String UPDATE_USER=PREFIX+ "/users/updateUser";
	public static final String DELETE_USER=PREFIX+ "/users/deleteUser";
	public static final String CREATE_USER_BY_EMAIL=PREFIX+ "/users/createUserByEmail";
	
	//======================== ROLE =================================
	public static final String CREATE_ROLE=PREFIX+ "/roles/createRole";
	public static final String GET_ALL_ROLE=PREFIX+ "/roles/getAllRole";
	public static final String CREATE_ALL_ROLE_BY_LEAD=PREFIX+ "/roles/createAllRoleByLead";

	//=============================  Account  =================================
	public static final String CREATE_ACCOUNT_DATA=PREFIX+ "/account/createAccountData";
	public static final String GET_ACCOUNT_DATA=PREFIX+ "/account/getAccountData";	
	public static final String GET_ALL_ACCOUNT_DATA=PREFIX+ "/account/getAllAccountData";	
	public static final String UPDATE_ACCOUNT_DATA=PREFIX+ "/account/updateAccountData";	
	public static final String DELETE_ACCOUNT_DATA=PREFIX+ "/account/deleteAccountData";
	
	///===============================  Ledger	Type  =================================
	public static final String CREATE_LEDGER_TYPE=PREFIX+ "/ledgerType/createLedgerType";
	public static final String UPDATE_LEDGER_TYPE=PREFIX+ "/ledgerType/updateLedgerType";
	public static final String GET_ALL_LEDGER_TYPE=PREFIX+ "/ledgerType/getAllLedgerType";
	public static final String DELETE_LEDGER_TYPE=PREFIX+ "/ledgerType/deleteLedgerType";

	
	//================================ Ledger ==========================================
	
	public static final String CREATE_LEDGER=PREFIX+ "/ledger/createLedger";
	public static final String UPDATE_LEDGER=PREFIX+ "/ledger/updateLedger";
	public static final String GET_ALL_LEDGER=PREFIX+ "/ledger/getAllLedger";

	//================================ Voucher Type ==========================================

	
	public static final String CREATE_VOUCHER_TYPE=PREFIX+ "/voucherType/createVoucherType";
	public static final String UPDATE_VOUCHER_TYPE=PREFIX+ "/voucherType/updateVoucherType";
	public static final String GET_ALL_VOUCHER_TYPE=PREFIX+ "/voucherType/getAllVoucherType";
	
	//=============================== Voucher  ===========================================
	public static final String CREATE_VOUCHER=PREFIX+ "/voucher/createVoucher";
	public static final String UPDATE_VOUCHER=PREFIX+ "/voucher/updateVoucher";
	public static final String GET_ALL_VOUCHER=PREFIX+ "/voucher/getAllVoucher";
	public static final String GET_VOUCHER_AMOUNT=PREFIX+ "/voucher/getVoucherAmount";
	public static final String GET_ALL_VOUCHER_BY_LEDGER_ID=PREFIX+ "/voucher/getAllVoucherByLedgerId";

	
	//=============================== Bank Details ========================================
	public static final String CREATE_BANK_DETAILS=PREFIX+ "/ledgerType/createBankDetails";
	public static final String UPDATE_BANK_DETAILS=PREFIX+ "/ledgerType/updateBankDetails";
	public static final String GET_ALL_BANK_DETAILS=PREFIX+ "/ledgerType/getAllBankDetails";

	


	

}
