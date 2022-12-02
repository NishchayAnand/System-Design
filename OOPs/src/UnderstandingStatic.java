
public class UnderstandingStatic {
	
	// getAge() static method will be executed first.
	static int age = getAge();
	
	// getWeight() method will be executed at the time of object creation.
	int weight = getWeight();
	
	// private static variable
	private static int cars;
	
	// will be executed after getAge() function call at line 5.
	static {
		System.out.println("Inside static block.");
		age = 20;
		cars = 30;
	}
	
	// static method of class Main.
	static int getAge() {
		System.out.println("Inside getAge static method");
		return 10;
	}
	
	// non-static method of class Main.
	int getWeight() {
		System.out.println("Inside getWeight method");
		return 50;
	}	
	
	// Inner Class -> Nested Class
	class Inner2 {
		
		int height2;
		int weight2;
		
		// can access the static and non-static fields of the enclosing class.
		int getCorrectAge() {
			return getAge();
		}
		
		int getCorrectWeight() {
			return getWeight();
		}
		
	}
	
	// Static Nested Class
	static class Inner{
		
		int height;
		static int weight2;
		
		// can only access the static fields.
		int getCorrectAge() {
			return getAge();
		}
		
		//int getCorrectWeight() {
			//return getWeight(); -> will throw an error.
		//}
		
	}
	
	public static void main(String args[]) {
		
		// can only access the static data member of class Main. 
		System.out.println(age);
		//System.out.println(weight); -> Will throw error
		
		// creating object of inner class.
		UnderstandingStatic obj = new UnderstandingStatic();
		Inner2 in = obj.new Inner2();
		
		System.out.println(obj.cars);
		
		// creating object of static nested class
		Inner in_stat = new Inner();
		
		//System.out.println(Inner.getCorrectAge); -> static class name cannot be used to access non-static members
		//System.out.println(in_stat.weight2); -> bas practice to access static variables using class objects
		
	}

}
