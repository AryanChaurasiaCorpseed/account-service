package com.account.dashboard.service;

import com.account.dashboard.domain.account.LedgerType;
import com.account.dashboard.dto.CreateStatutoryDetails;

public interface StatutoryService {

	Boolean createLedgerType(CreateStatutoryDetails createStatutoryDetails);

	Boolean updateStatutoryDetails(CreateStatutoryDetails createStatutoryDetails);

	LedgerType getStatutoryDetailsById(Long id);

}
