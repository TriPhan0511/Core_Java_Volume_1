package notHelloWorld_DIY;

import javax.swing.JFrame;

public class NotHelloWorldFrame extends JFrame 
{
	public NotHelloWorldFrame()
	{
		add(new NotHelloWorldComponent());
		pack();
	}
}
