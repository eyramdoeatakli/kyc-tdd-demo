package com.example.tdd.service;

import org.springframework.stereotype.Service;

import com.example.tdd.interfaces.IKycApiFacade;
import com.example.tdd.model.KycInformation;
@Service
public class KycApiFacadeImpl implements IKycApiFacade{

	
	
	@Override
	public KycInformation retrieveKycInfo(String msisdn) {
		KycInformation kycInformation= new KycInformation();
		kycInformation.setDob("2029-02-10");
		kycInformation.setGender("Male");
		kycInformation.setMsidn("msisdn");
		kycInformation.setName("Kofi Annan");
		kycInformation.setResponse("Successfully retrieved");
		return kycInformation;
	}

}
