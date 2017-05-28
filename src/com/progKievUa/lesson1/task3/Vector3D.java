package com.progKievUa.lesson1.task3;

/*
 * Class Vector3D for create vector.
 * Create Ruslan Ganzhuk
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
