package com.progKievUa.lesson1.task3;

/*
 * Описать класс «Vector3d» 
 * (т.е. он должен описывать вектор в 3-х мерной, декартовой системе координат).
 * В качестве свойств этого класса возьмите координаты вектора.
 * Для этого класса реализовать методы сложения,
 * скалярного и векторного произведения векторов.
 * Создайте несколько объектов этого класса и протестируйте их.
 * 
 * create Ruslan Ganzhuk 
 */

public class Main {

	public static void main(String[] args) {
		
		Vector3D vec1 = new Vector3D(2,1,-3);
		
		Vector3D vec2 = new Vector3D(0,-1,1);
		
		System.out.println("Сумма векторов = " + VectorCalculator.sumVector(vec1, vec2));
		
		System.out.println("Разность векторов = " + VectorCalculator.subtractionVector(vec1, vec2));
		
		System.out.println("Скалярное произведение векторов = " + VectorCalculator.scalarMultiplication(vec1, vec2));
		
		VectorCalculator.vectorMultiplication(vec1, vec2);

	}

}
