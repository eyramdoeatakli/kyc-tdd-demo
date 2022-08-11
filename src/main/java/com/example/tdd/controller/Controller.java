package com.example.tdd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.tdd.model.KycInformation;
import com.example.tdd.service.KycRetrievalService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class Controller {
	
	private KycRetrievalService kycRetrievalService;

	
	
	@GetMapping("get-kyc-info/{msisdn}")
	public KycInformation getKycInfo(@PathVariable String msisdn) {
		KycInformation kyInfo=kycRetrievalService.getKycInfo(msisdn);
		return kyInfo;
	} 

}
