package com.calculator.SubtractionMS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SubtractionController {
	private Logger logger = LoggerFactory.getLogger(SubtractionController.class);
	
	@GetMapping("calculate/Subtract/{number1}/{number2}")
	public int getSubtractionResult(@PathVariable int number1,@PathVariable int number2) {
		int result = number1-number2;
		logger.info("Result of subtraction = " + result);
		return result;
	
	}
	
	
	
	
	
	

}
