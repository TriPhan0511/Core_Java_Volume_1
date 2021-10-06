
public class FirstSample {

	public static void main(String[] args) {
//		System.out.println("We will not use 'Hello, world!'");
//		System.out.println(2.0 - 1.1);
		
//		char ch = 'A';
//		System.out.println(ch);
//		
//		String st = "A";
//		System.out.println(st);
		
//		char tradeMark = '\u2122';
//		System.out.println(tradeMark);
		
//		System.out.println('\u005B');
		
//		Variables 
//		double salary;
//		int vacationDays;
//		long earthPopulation;
//		boolean done;
//		
//		salary = 100.99;
//		System.out.println("Salary: " + salary);
//		
//		vacationDays = 12;
//		System.out.println("Vacation days: " + vacationDays);
//		
//		earthPopulation = 7000000000l;
//		System.out.println("Population: " + earthPopulation);
//		
//		done = false;
//		System.out.println(done);
//		
//		done = true;
//		
//		if (done) {
//			System.out.println("Everything is done!");
//		} else {
//			System.out.println("There are something must be done.");
//		}
//		
//		int count = 0;
//		System.out.println(count);
		
//		Starting with Java 10, you do not need to declare the types of the local variables
//		if they can be inferred from the initial value. Simply use the keyword var instead of the type:
//		var vacationDays = 12;
//		System.out.println(vacationDays);
		
//		Use getClass().getSimpleName() to check the type of a variable in Java
//		String str = "Hello, world!";
//		System.out.println(str.getClass().getSimpleName());  // String
		
//		if (str.getClass().getSimpleName().equals("String")) {
//			System.out.println("It's is a String.");
//		}

//		String[] arr = new String[5];
//		System.out.println(arr.getClass().getSimpleName());
		
//		Constants
//		In Java, you use the keyword final to denote a constant
//		double final PI = 3.14;
		
//		Enumerated types
//		Sometimes, a variable should only hold a restricted set of values.
//		You can define your own enumerated type: 
		enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}
		Size s = Size.MEDIUM;
		
//		A variable of type Size can hold only one of the values listed in the type declaration, 
//		or the special value null that indicates that the variable is not set to any value at all.
		
		System.out.println(s.getClass().getSimpleName()); // Size
		
	}
	
	
	
	

}























