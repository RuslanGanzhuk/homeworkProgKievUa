package com.progKievUa.lesson1.task4;

import java.util.Arrays;

/*
 *  Опишите класс Phone (одним из свойств должен быть его номер).
 *  Также опишите класс Network (сеть мобильного оператора). 
 *  Телефон должен иметь метод регистрации в сети мобильного оператора.
 *  Также у телефона должен быть метод call (номер другого телефона),
 *  который переберет все телефоны, зарегистрированные в сети.
 *  Если такой номер найден, то осуществить вызов,
 *  если нет - вывести сообщение о неправильности набранного номера.
 *   
 *   create Ruslan Ganzhuk
 */

public class Runner {

	public static void main(String[] args) {
		
		Network network = new Network();
		
		Phone phone = new Phone(54,"nokia");
		Phone phone1 = new Phone(522,"lg");
		
		phone.regestrationToNetwork(network);
		phone1.regestrationToNetwork(network);
		
		
		//network.printAray();
		
		System.out.println(phone.call(522));
		System.out.println(phone.call(6));
		
		//System.out.println(network.searchNumberToCall(54));
		
 
	}

}
