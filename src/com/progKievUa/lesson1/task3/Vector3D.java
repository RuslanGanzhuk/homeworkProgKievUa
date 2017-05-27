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

public class Vector3D {
	
	
	private double x;
	private double y;
	private double z;
	
	public Vector3D(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	public Vector3D() {
		
	}

	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public String toString() {
		return "[x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}
