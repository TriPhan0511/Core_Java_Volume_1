
public class FormattedOutput {

	public static void main(String[] args) {
		/* Formatting output using System.out.printf()*/
		
		int integerNumber = 100;
		System.out.printf("An integer: %d", integerNumber);
		
//		This will print it up to two decimal places
		System.out.printf("\nFormatted with precision: %.2f", Math.PI); // 3.14 (Math.PI is a double)
		
//		Appends zero to the rightmost part of the decimal automa
		float floatNumber = 5.2f;
		System.out.printf("\nFormatted to a specific width: %.4f", floatNumber); // 5.2000

	}

}
