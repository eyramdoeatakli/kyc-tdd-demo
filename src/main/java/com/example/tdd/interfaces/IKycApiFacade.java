package com.example.tdd.interfaces;

import com.example.tdd.model.KycInformation;

public interface IKycApiFacade {
	
	 KycInformation retrieveKycInfo(String msisdn);
	

}
