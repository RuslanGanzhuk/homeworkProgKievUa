package com.progKievUa.lesson1.taskOne;

public class Main {

	public static void main(String[] args) {
		
		Cat cat = new Cat();

		cat.setName("Barsik");
		cat.setAge(2);
		cat.setWeight(2);
		cat.setColor("grey");
		
		System.out.println(cat);
		
		System.out.print(cat.catHungry(cat.getName()));
		
		cat.catEat(cat.getName());
	}

}
