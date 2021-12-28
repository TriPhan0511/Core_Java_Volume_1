package notHelloWorld_DIY;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

public class SimpleFrame extends JFrame 
{
	public SimpleFrame()
	{
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension size = kit.getScreenSize();
		setSize(size.width / 2, size.height / 2);
	}
	
	public SimpleFrame(int width, int height)
	{
		setSize(width, height);
	}
}
