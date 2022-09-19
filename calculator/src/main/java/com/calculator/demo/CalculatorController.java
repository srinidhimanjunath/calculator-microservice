package com.calculator.demo;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class CalculatorController {
	
	@Autowired
	CalculatorProxy proxy;
	
	
	
	
	@GetMapping("calculate/Add/{number1}/{number2}")
	public ResultDO getAdditionResult(@PathVariable int number1,@PathVariable int number2) {
		int result = number1+number2;
		ResultDO tempDO = new ResultDO();
		int subtractionResult = proxy.getSubtractionResult(number1, number2);
		result-=subtractionResult;
		tempDO.setAdditionResult(result+"");
		
		return tempDO;
	}
	
	@GetMapping("calculate/multiply/{number1}/{number2}")
	public ResultDO getMultiplicationResult(@PathVariable int number1,@PathVariable int number2) {
		int result = number1*number2;
		ResultDO tempDO = new ResultDO();
		int subtractionResult = proxy.getSubtractionResult(number1, number2);
		result-=subtractionResult;
		tempDO.setMultiplicationResult(result+"");
		return tempDO;
	}

}
