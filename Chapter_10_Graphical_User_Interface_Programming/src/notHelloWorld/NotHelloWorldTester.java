package notHelloWorld;

import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * @version 1.0 2021-12-13
 * @author Tri Phan
 *
 */
public class NotHelloWorldTester 
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() -> {
			var frame = new NotHelloWorldFrame();
			frame.setTitle("Not Hello World");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}
