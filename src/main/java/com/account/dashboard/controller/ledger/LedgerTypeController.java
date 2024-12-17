package com.account.dashboard.controller.ledger;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.account.dashboard.domain.account.LedgerType;
import com.account.dashboard.service.LedgerTypeService;
import com.account.dashboard.util.*;

@RestController
public class LedgerTypeController {
	
	@Autowired
	LedgerTypeService ledgerService;
//isSubLeadger;
//	
//	boolean isDebitCredit;
//	
//	boolean isUsedForCalculation;
	@PostMapping(UrlsMapping.CREATE_LEDGER_TYPE)
	public Boolean createLedgerType(@RequestParam String name,@RequestParam boolean subLeadger,@RequestParam boolean isDebitCredit,@RequestParam boolean usedForCalculation){
		Boolean res=ledgerService.createLedgerType(name,subLeadger,isDebitCredit,usedForCalculation);	
		return res;
	}
	
	@PutMapping(UrlsMapping.UPDATE_LEDGER_TYPE)
	public Boolean updateLedgerType(@RequestParam Long id , @RequestParam String name,@RequestParam boolean subLeadger,@RequestParam boolean isDebitCredit,@RequestParam boolean usedForCalculation){
		Boolean res=ledgerService.updateLedgerType(id,name,subLeadger,isDebitCredit,usedForCalculation);	
		return res;
	}
	
	@PutMapping(UrlsMapping.GET_ALL_LEDGER_TYPE)
	public List<LedgerType> getAllLedgerType(){
		List<LedgerType> res=ledgerService.getAllLedgerType();	
		return res;
	}
}
