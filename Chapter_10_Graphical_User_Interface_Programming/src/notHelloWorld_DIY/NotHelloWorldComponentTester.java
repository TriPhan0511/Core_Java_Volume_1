package notHelloWorld_DIY;

import javax.swing.JFrame;

public class NotHelloWorldComponentTester 
{
	public static void main(String[] args)
	{
//		Creates a frame
		var frame = new SimpleFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Creates a component named "NotHelloWorldComponent"
		var component = new NotHelloWorldComponent();
		frame.add(component);
		
//		Sets the frame visible
		frame.setVisible(true);
	}
}

































