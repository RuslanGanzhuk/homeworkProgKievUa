package com.progKievUa.lesson1.task4;

public class Phone {
	
	private long number;
	private String model;
	
	public Phone(long number, String model) {
		this.number = number;
		this.model = model;
	}

	public Phone() {
		
	}
	
	public String call(long number){
		
		return "";
	}
	
	public long regestrationToNetwork(long number){
		
		return number;
	}

	
	
	
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String toString() {
		return "Phone [number=" + number + ", model=" + model + "]";
	}
	
}
