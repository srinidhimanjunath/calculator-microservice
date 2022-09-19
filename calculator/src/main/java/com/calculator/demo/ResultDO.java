package com.calculator.demo;

public class ResultDO {
	
	private String additionResult;
	private String multiplicationResult;
	public String getAdditionResult() {
		return additionResult;
	}
	public void setAdditionResult(String additionResult) {
		this.additionResult = additionResult;
	}
	public String getMultiplicationResult() {
		return multiplicationResult;
	}
	public void setMultiplicationResult(String multiplicationResult) {
		this.multiplicationResult = multiplicationResult;
	}
	public ResultDO(String additionResult, String multiplicationResult) {
		super();
		this.additionResult = additionResult;
		this.multiplicationResult = multiplicationResult;
	}
	public ResultDO() {
		super();
	}
	
	
	
	
	

}
