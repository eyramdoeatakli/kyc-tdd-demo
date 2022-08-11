package com.example.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.tdd.interfaces.IKycApiFacade;
import com.example.tdd.model.KycInformation;
@ExtendWith(MockitoExtension.class)
class KycRetrievalServiceTest {
	

	@Mock
	IKycApiFacade iKycApiFacade;


	
	@InjectMocks
	KycRetrievalService kycRetrievalService;

	
	
	@Test
	void whenMsisdnIsPassedReturnKycInfo() {
		String msisdn="233556428728";
		KycInformation kycInfo= new KycInformation();
		kycInfo.setDob("1923-02-10");
		kycInfo.setGender("Male");
		kycInfo.setMsidn("233556428728");
		kycInfo.setName("Ernest Arkel");

		when(iKycApiFacade.retrieveKycInfo(msisdn)).thenReturn(kycInfo);
		KycInformation retrieved= kycRetrievalService.getKycInfo(msisdn);
		
	   	assertEquals("Ernest Arkel",retrieved.getName());
	//	verify(kycApiFacadeImpl, times(1)).retrieveKycInfo(msisdn);
	}
	
	
	
	
	@Test
	void whenNoMsisdnIsPassedReturnErrorMsg() {
		String msisdn="";
		KycInformation kycInfo= new KycInformation();
				KycInformation retrieved= kycRetrievalService.getKycInfo(msisdn);
	   	assertEquals("Number is empty",retrieved.getResponse());

	}
	



}
