abstract class shape {

abstract void noOfSides();

}


 class triangle extends shape {

	void noOfSides(){
	System.out.println(" Number of sides of Triangle is 3.");         
	}
}

 class rectangle extends shape {

	void noOfSides(){
	System.out.println(" Number of sides of Rectangle is 4.");         
	}
}




 class hexagon extends shape {

	void noOfSides(){
	System.out.println(" Number of sides of Hexagon is 6.");         
	}
}




class abstractclassexp {

public static void main(String[]args){
	 triangle t1 = new triangle();
	 rectangle r1 = new rectangle();
	 hexagon h1 = new hexagon();
	 
	 
	 t1.noOfSides();
	 r1.noOfSides();
	 h1.noOfSides();
	 
}
}

