package com.progKievUa.lesson1.taskOne;

/*
 *  Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
 *  Наделить его свойствами и методами. 
 *  Создать несколько экземпляров объектов этого класса. 
 *  Использовать эти объекты.
 *  
 *  create Ruslan Ganzhuk
 */

public class Cat {
	
	private String name;
	private int age;
	private double weight;
	private String color;
	
	public Cat (String name, int age,double weight ,String color){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.color = color;
	}
	
	public Cat (){
		
	}
	
	public String catSay (String word){
		return word;
	}
	
	public String catHungry (String name){
		return name + " is Hungry!!!";
	}
	
	public void catEat (String name){
		System.out.println(name + " eating...");
		System.out.println(name + " is full");
	}
	
	public String catAge (int catAge){
		return catAge + " years" ;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight
				+ ", color=" + color + "]";
	}

	
	
	
	

}
