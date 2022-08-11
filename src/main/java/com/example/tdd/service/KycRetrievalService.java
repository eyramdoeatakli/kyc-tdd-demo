package com.example.tdd.service;


import org.springframework.stereotype.Service;

import com.example.tdd.interfaces.IKycApiFacade;
import com.example.tdd.model.KycInformation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class KycRetrievalService {
	
	
//	private KycApiFacadeImpl kycApiFacadeImpl;
	private IKycApiFacade ikycFaApiFacade;


	
	
	public KycInformation getKycInfo(String msisdn) {
		KycInformation kycInfo=new KycInformation();
		
		if(msisdn.isEmpty()) {
			kycInfo.setResponse("Number is empty");
		}else {
			log.info("Inside getKycInfo method");
			kycInfo=ikycFaApiFacade.retrieveKycInfo(msisdn);
			log.info("after calling retrieveKycInfo  method {}",kycInfo);	
				
		}


		return  kycInfo;
	}








}
