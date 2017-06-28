package com.progKievUa.lesson1.task4;

public class Phone {

	private long number;
	private String model;
	private Network network;

	public Phone(long number, String model) {
		this.number = number;
		this.model = model;
	}

	public Phone() {

	}

	public void regestrationToNetwork(Network network) {
		this.network = network;
		this.network.addNumberOnNetwork(this);

	}
	
	public String call(long number) {
		
		long tempSearch = this.network.searchNumberToCall(number);
		if (tempSearch!=0){
			
			return "Please wait..." + "You call to " + number;
		}
		return "Sorry this number not registration";
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
