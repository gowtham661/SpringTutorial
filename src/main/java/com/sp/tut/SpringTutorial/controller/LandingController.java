package com.sp.tut.SpringTutorial.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sp.tut.SpringTutorial.model.LandingModel;

public interface LandingController {

	@RequestMapping(value="/getData", method = RequestMethod.GET)
	String getLandingData();

	@GetMapping("/getMyName")
	String printMe(@RequestParam String name);

	@RequestMapping("/getMyName/{id}")
	String printMyPathParam(@PathVariable(required = true) String id);

	@RequestMapping(value = "/sendData", method = RequestMethod.POST)
	String samplePostCall();

	@RequestMapping(value = "/sendPostData", method = RequestMethod.POST)
	String sampleRequestCall(@RequestBody Map<String, String> reqParm);

	@PostMapping(value = "/sendModelData")
	String samplePostModelCall(@RequestBody LandingModel reqParm);

}
