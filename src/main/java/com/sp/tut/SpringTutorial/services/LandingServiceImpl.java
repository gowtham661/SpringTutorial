package com.sp.tut.SpringTutorial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.tut.SpringTutorial.repositary.LandingRepository;

@Service
public class LandingServiceImpl implements LandingService {

	@Autowired
	LandingRepository landingRepo;
	
	public String getLandingData() {
		// TODO Auto-generated method stub
		return landingRepo.toString();
	}

}
