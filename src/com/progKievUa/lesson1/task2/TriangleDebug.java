package com.progKievUa.lesson1.task2;

public class TriangleDebug {
	
	private double sideOne;
	private double sideTwo;
	private double sideThree;
	
    public TriangleDebug (double sideOne, double sideTwo, double sideThree){
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}
    
   
	public TriangleDebug (){
		
	}
	
	public double areaTriangleOnThreeSide(double a,double b,double c){
				
		double s;
		
		double x = (a+b+c)/2;
		
		s = Math.sqrt(x*((x-a)*(x-b)*(x-c)));
		
		return s;
	}
	
	public double areaTriangleOnThreeSide(TriangleDebug obj){
		
		double s;
		
		double x = (obj.getSideOne()+obj.getSideTwo()+obj.getSideThree())/2;
		
		s = Math.sqrt(x*((x-obj.getSideOne())*(x-obj.getSideTwo())*(x-obj.getSideThree())));
		
		return s;
	}
	

	public double getSideOne() {
		return sideOne;
	}

	public void setSideOne(double sideOne) {
		this.sideOne = sideOne;
	}

	public double getSideTwo() {
		return sideTwo;
	}

	public void setSideTwo(double sideTwo) {
		this.sideTwo = sideTwo;
	}

	public double getSideThree() {
		return sideThree;
	}

	public void setSideThree(double sideThree) {
		this.sideThree = sideThree;
	}
	
	public String toString() {
		return "Triangle [sideOne=" + sideOne + ", sideTwo=" + sideTwo
				+ ", sideThree=" + sideThree + "]";
	}

}
