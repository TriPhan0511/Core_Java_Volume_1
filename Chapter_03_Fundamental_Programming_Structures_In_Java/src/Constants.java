
public class Constants {
	public static void main(String[] args) {
//		Declare a constant
		final var CM_PER_INCH = 2.54;
		
//		Declare some variables
		var paperWidth = 8.5;
		var paperHeight = 11;
		
		System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}
}
