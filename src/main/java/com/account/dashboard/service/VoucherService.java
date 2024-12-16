package com.account.dashboard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.account.dashboard.domain.account.Ledger;
import com.account.dashboard.domain.account.Voucher;
import com.account.dashboard.dto.CreateVoucherDto;

@Service
public interface VoucherService {

	Boolean createVoucher(CreateVoucherDto createVoucherDto);

	List<Voucher> getAllVoucher();

}
