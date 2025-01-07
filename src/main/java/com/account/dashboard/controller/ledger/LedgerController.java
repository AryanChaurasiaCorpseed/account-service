package com.account.dashboard.controller.ledger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.account.dashboard.domain.account.Ledger;
import com.account.dashboard.dto.LedgerDto;
import com.account.dashboard.dto.UpdateLedgerDto;
import com.account.dashboard.service.LedgerService;
import com.account.dashboard.util.UrlsMapping;


@RestController
public class LedgerController {

	
	@Autowired
	LedgerService ledgerService;

	
	@PostMapping(UrlsMapping.CREATE_LEDGER)
	public Boolean createLedger(@RequestBody LedgerDto ledgerDto){
		Boolean res=ledgerService.createLedger(ledgerDto);	
		return res;
	}
	
	@GetMapping(UrlsMapping.GET_ALL_LEDGER)
	public List<Ledger> getAllLedger(){
		List<Ledger> res=ledgerService.getAllLedger();	
		return res;
	}
	
	@PutMapping(UrlsMapping.UPDATE_LEDGER)
	public Boolean updateLadger(UpdateLedgerDto updateLedgerDto){
		Boolean res=ledgerService.updateLadger(updateLedgerDto );	
		return res;
	}
	
	@GetMapping(UrlsMapping.GET_LEDGER_BY_ID)
	public Ledger getLedgerById(@RequestParam Long id){
		Ledger res=ledgerService.getLedgerById(id);	
		return res;
	}
	
}
