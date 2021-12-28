package notHelloWorld;

import javax.swing.JFrame;

/**
 * A frame that contains a message panel.
 * 
 * @author Tri Phan
 *
 */
public class NotHelloWorldFrame extends JFrame 
{
	public NotHelloWorldFrame()
	{
		add(new NotHelloWorldComponent());
		pack();
	}
}
