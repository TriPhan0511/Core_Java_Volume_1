
public class Constants2 {

//	Its is probably more common in Java to create a constant so it's available to 
//	multiple methods inside a single class. They are usually called class constants.
//	Set up a class constant with the keywords static final
	public static final double CM_PER_INCH = 2.54;
	
	public static void main(String[] args) {
		 double paperWidth = 8.5;
		 double paperHeight = 11;
		 System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}
	
}
