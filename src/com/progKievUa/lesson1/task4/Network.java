package com.progKievUa.lesson1.task4;

import java.util.Arrays;

public class Network {
	
	private long [] listNumberOfNetwork = new long [0];	
	//private Phone phone;
	
	public void addNumberOnNetwork(Phone phone){
	
		long number = phone.getNumber();
		long [] tempArray = new long [listNumberOfNetwork.length+1];
		
		System.arraycopy(listNumberOfNetwork,0,tempArray,0,listNumberOfNetwork.length);
		
		tempArray[tempArray.length-1] = number;
		this.listNumberOfNetwork = tempArray;

	}
	
	public long searchNumberToCall(long number){
		
		for (int i = 0; i < listNumberOfNetwork.length; i++){
			if (number == listNumberOfNetwork[i]){
				return number;
			} 			
	    }
		return 0;
	}
			
	
//	public void printAray(){
//		System.out.println(Arrays.toString(listNumberOfNetwork));
//	}
	
}
