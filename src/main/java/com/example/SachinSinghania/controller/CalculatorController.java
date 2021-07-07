package com.example.SachinSinghania.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SachinSinghania.entiry.CalculatorEntity;
import com.example.SachinSinghania.service.CalculatorService;

@RestController
public class CalculatorController {
	
	@Autowired
	CalculatorService calService;
	
	@RequestMapping(value= "/add-num/{num1}/{num2}",  method = RequestMethod.POST)
	public int add(@PathVariable int num1, @PathVariable int num2) {
		int res = calService.addNum(num1, num2);
		return res;
	}
	
	@RequestMapping(value= "/sub-num/{num1}/{num2}",  method = RequestMethod.POST)
	public int subtract(@PathVariable int num1, @PathVariable int num2) {
		int res = calService.subNum(num1, num2);
		return res;
	}
	
	@RequestMapping(value= "/div-num/{num1}/{num2}",  method = RequestMethod.POST)
	public float div(@PathVariable int num1, @PathVariable int num2) {
		float res = calService.divNum(num1, num2);
		return res;
	}
	
	@RequestMapping(value= "/mul-num/{num1}/{num2}",  method = RequestMethod.POST)
	public int mult(@PathVariable int num1, @PathVariable int num2) {
		int res = calService.mulNum(num1, num2);
		return res;
	}
	
	@RequestMapping(value= "/get-all-data",  method = RequestMethod.GET)
	public List<CalculatorEntity> getAllResult() {
		List<CalculatorEntity> data = new ArrayList<>();
		data = calService.findAllData();
		return data;
	}

}
