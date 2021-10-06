
public class Constants {

	public static void main(String[] args) {
//		In Java, you use the keyword final to denote a constant
//		The final keyword indicates that you can assign to the variable once,
//		and then its value is set once and for all.
//		It is customary to name constants in all uppercase.
		final double CM_PER_INCH = 2.54;
		double paperWidth = 8.5;
		double paperHeight = 11;
		
		System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

	}

}
