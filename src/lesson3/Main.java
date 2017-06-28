package lesson3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cat cat = new Cat("Vasya",2,"grey");
		Cat cat1 = new Cat("Vasya",2,"grey");
		Cat cat2 = null;
		System.out.println(cat);
		
		System.out.println(cat.hashCode());
		System.out.println(cat1.hashCode());
		 
		
		try {
			cat2 = cat.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("=====");
		System.out.println("==" + (cat.equals(cat2)));
		System.out.println(cat2==cat);
		
		Class <?> catClass = cat.getClass();
		
		Field[] fieldArray = catClass.getDeclaredFields();
		for (Field field : fieldArray) {
			System.out.println(field);
		}
		
		System.out.println("======================");
		//System.out.println(cat1.hashCode());
		
		
		Cat cat444 = new Cat("Vasya",2,"grey");
		Cat cat555 = new Cat("Oleg",7,"blue");
		
		

	}
	
	public static void serialtoFile(Cat cat, File file){
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
				oos.writeObject(cat);		
	}catch(IOException e){
		e.printStackTrace();
	}
  }
	
	public static Cat deserFromFile(File file){
		Cat cat = null;
		try
	}
}
