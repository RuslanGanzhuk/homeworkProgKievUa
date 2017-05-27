package com.progKievUa.lesson1.taskTwo;

/*
 * Описать класс «Triangle». 
 * В качестве свойств возьмите длины сторон треугольника.
 * Реализуйте метод, который будет возвращать площадь этого треугольника.
 * Создайте несколько объектов этого класса и протестируйте их.
 * create Ruslan Ganzhuk
 */

public class Triangle {
	
	private double sideOne;
	private double sideTwo;
	private double sideThree;
	
    public Triangle (double sideOne, double sideTwo, double sideThree){
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}
	
	public Triangle (){
		
	}
	
	public double areaTriangle(double a,double b,double c){
		//S = 	1	a · h
		//		2
				
		double S;
		
		double x = (a+b+c)/2;
		
		S = Math.sqrt(x*((x-a)*(x-b)*(x-c)));
		
		return S;
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