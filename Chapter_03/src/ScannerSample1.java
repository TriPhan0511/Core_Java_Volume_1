import java.util.Scanner;

public class ScannerSample1 {

	public static void main(String[] args) {
		
//		Declares and initializes a Scanner object
//		Scanner sc = new Scanner(System.in);
		
		/* Takes integer input from user */
//		System.out.print("Enter the first number: ");
//		int firstNumber = sc.nextInt();
//		System.out.print("Enter the second number: ");
//		int secondNumber = sc.nextInt();
//		System.out.println("Total: " + (firstNumber + secondNumber));
		
		/* Takes a String from the user */
//		System.out.print("Enter your name: ");
//		String name = sc.nextLine();
//		System.out.println("Good morning, " + name);
		
//		Close the Scanner object named sc
//		sc.close();
		
//		------------------------------------------------------------------------------------------------------
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("First number: " + firstNumber);
		
		System.out.print("Enter second number: ");
		int secondNumber = scanner.nextInt();
		System.out.println("Second number: " + secondNumber);
		
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Hello" + name);
		
		
		scanner.close();
		
//		------------------------------------------------------------------------------------------------------
		
		/* Using the "try with resource" statement (not use clode() method): */
		
//		try(Scanner scanner = new Scanner(System.in)){
//			int number = 0;
//			System.out.print("Enter an integer: ");
//			if (scanner.hasNextInt()) {
//				number = scanner.nextInt();
//				System.out.printf("The number is %d.", number);
//			} else {
//				System.out.println("The input is not an integer.");
//			}
//			
//			String name = "";
//			System.out.print("\nEnter your name: ");
//			if (scanner.hasNextLine()) {
//				name = scanner.nextLine();
//				System.out.printf("Aloha %s!", name);
//			}
//			
//		}
		


	}

}

































