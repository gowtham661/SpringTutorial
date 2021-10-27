package com.sp.tut.SpringTutorial.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sp.tut.SpringTutorial.model.LandingModel;
import com.sp.tut.SpringTutorial.services.LandingService;

@Controller
@ResponseBody
public class LandingControllerImpl implements LandingController {

	@Autowired
	LandingService service;

	public String getLandingData() {
		// TODO Auto-generated method stub
		return "Welcome To sample Program";
	}

	public String printMe(String name) {
		// TODO Auto-generated method stub
		return "Welcome " + name + " To sample Program";
	}

	public String printMyPathParam(String id) {
		// TODO Auto-generated method stub
		return "Welcome " + id + " To sample Program";
	}

	public String samplePostCall() {
		// TODO Auto-generated method stub
		return "Sample Post call";
	}

	public String sampleRequestCall(Map<String, String> reqParm) {
		// TODO Auto-generated method stub
		System.out.println(reqParm.get("name"));
		return "Sample Request Call";
	}

	public String samplePostModelCall(LandingModel reqParm) {
		// TODO Auto-generated method stub
		return service.getLandingData();
	}

}
