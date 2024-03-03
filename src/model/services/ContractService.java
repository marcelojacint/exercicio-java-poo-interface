package model.services;

import model.entities.Contract;

public class ContractService {
	
	OnlinePaymentSerice onlinePaymentSerice;
	
	
	
	public ContractService(OnlinePaymentSerice onlinePaymentSerice) {
		this.onlinePaymentSerice = onlinePaymentSerice;
	}



	public void prcessContract(Contract contract, int months) {
		
		
	};

}
