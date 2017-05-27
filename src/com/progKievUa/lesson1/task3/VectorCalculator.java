package com.progKievUa.lesson1.task3;

public class VectorCalculator {
	
	
	static public Vector3D sumVector (Vector3D obj1, Vector3D obj2){
		
		Vector3D sum;
		sum = new Vector3D(obj1.getX()+obj2.getX(),obj1.getY()+obj2.getY(),obj1.getZ()+obj2.getZ());
		return sum;
	   
	}
	
static public Vector3D subtractionVector (Vector3D obj1, Vector3D obj2){
		
		Vector3D subtraction;
		subtraction = new Vector3D(obj1.getX()-obj2.getX(),obj1.getY()-obj2.getY(),obj1.getZ()-obj2.getZ());
		return subtraction;
	   
	}

static public double scalarMultiplication (Vector3D obj1, Vector3D obj2){
	
	double multiplicationScalar = ((obj1.getX()*obj2.getX())+(obj1.getY()*obj2.getY())+ (obj1.getZ()*obj2.getZ()));
	return multiplicationScalar;
   
}

static public Vector3D vectorMultiplication (Vector3D obj1, Vector3D obj2){
	
	Vector3D multiplicationVector;
	multiplicationVector = new Vector3D((obj1.getY()*obj2.getZ()-obj1.getZ()*obj2.getY()),(obj1.getZ()*obj2.getX()- obj1.getX()*obj2.getZ()),(obj1.getX()*obj2.getY()-obj1.getY()*obj2.getX()));
	System.out.println("Векторное произведение = (" + multiplicationVector.getX()+ "*x " + multiplicationVector.getY() + "*y " + multiplicationVector.getZ() + "*z" + ")");
	return multiplicationVector;
   
}

}
