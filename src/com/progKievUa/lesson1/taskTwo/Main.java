package com.progKievUa.lesson1.taskTwo;

public class Main {

	public static void main(String[] args) {
		
		Triangle triangleOne = new Triangle();
		
		
	System.out.println("Площадь треугольника по трем сторонам равна: " + triangleOne.areaTriangleOnThreeSide(1, 1, 1));
	
	Triangle triangleTwo = new Triangle(3,6);
	System.out.println("Площадь треугольника по стороне и высоте равна: " + triangleTwo.areaTriangleOnSideAndHeight(triangleTwo.getSideOnHeight(), triangleTwo.getHeight()));
	
	}
	
}
