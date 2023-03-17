package inheritance_Mock;

public class execution {
	
	public static void main(String[] args) {
		
		System.out.println(east.a); // Normal Call
		
		east x = new east();  // Object for Non static
		System.out.println(x.b);
		
		System.out.println(); // space
		System.out.println(); // space
		
		// static call
		System.out.println(north.a); // Inheritance superclass
		System.out.println(north.c); // Inheritance superclass
		System.out.println(north.e); // Normal call
		
		System.out.println();  // space
		System.out.println();  // space
		
		
		// non static call
		west y = new west();
		System.out.println(y.d); // Inheritance superclass
		System.out.println(y.b); // Inheritance superclass
		
		north z = new north();
		System.out.println(z.f); // Normal call
		System.out.println(z.b); // Inheritance superclass
		
		System.out.println(x.b); // Inheritance superclass
		
		System.out.println(north.a); // Inheritance superclass
		System.out.println(north.e); // Normal call  
		
	}	
	
}	
	
	/*	west.demo();
		
		west x = new west();
		x.test();
		
		System.out.println();
		System.out.println();
		

		north.demo();
		
		north y = new north();
		y.test();  */
		
	/*	west.demo();
		
		west x = new west();
		x.test();
		
		System.out.println();
		System.out.println();
		
		north.demo();
		
		north z = new north();
		z.test(); */
		
	/*	new north();*/
		
	


