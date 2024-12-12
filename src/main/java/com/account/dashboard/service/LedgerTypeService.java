package com.account.dashboard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.account.dashboard.domain.account.LedgerType;

@Service
public interface LedgerTypeService {

	Boolean createLedgerType(String name);

	Boolean updateLedgerType(Long id, String name);

	List<LedgerType> getAllLedgerType();

}