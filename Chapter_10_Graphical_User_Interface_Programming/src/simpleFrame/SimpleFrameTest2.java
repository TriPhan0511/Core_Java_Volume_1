package simpleFrame;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SimpleFrameTest2 
{
	public static void main(String[] args)
	{
		var frame = new SimpleFrame2();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class SimpleFrame2 extends JFrame
{
	public SimpleFrame2()
	{
//		Set the size for the frame
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		setSize(screenWidth / 2, screenHeight / 2);
		
//		Set the frame icon
		Image img = new ImageIcon("red-ball.gif").getImage();
		setIconImage(img);
	}
}





























