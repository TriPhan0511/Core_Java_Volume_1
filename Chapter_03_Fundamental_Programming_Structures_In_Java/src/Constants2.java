
public class Constants2 {
//	Declare a class constant: Use static final keywords
	public static final double CM_PER_INCH = 2.54;
	
	public static void main(String[] args) {
		var paperWidth = 8.5;
		var paperHeight = 11;
		System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}
}
