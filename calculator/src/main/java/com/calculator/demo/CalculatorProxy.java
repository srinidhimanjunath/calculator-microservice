package com.calculator.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "calculator-subtraction", url = "${SUBTRACTION_MS_SERVICE_HOST:http://localhost}:8101")
public interface CalculatorProxy {

	@GetMapping("calculate/Subtract/{number1}/{number2}")
	public int getSubtractionResult(@PathVariable int number1,@PathVariable int number2);
	
}
