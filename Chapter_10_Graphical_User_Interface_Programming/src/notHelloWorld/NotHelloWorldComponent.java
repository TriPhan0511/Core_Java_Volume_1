package notHelloWorld;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;


/**
 * A component that displays a message.
 * 
 * @author Tri Phan
 *
 */
public class NotHelloWorldComponent extends JComponent 
{
	private static final int DEFAULT_WIDTH = 300;
	private static final int  DEFAULT_HEIGHT = 200;
	private static final int MESSAGE_X = 75;
	private static final int MESSAGE_Y = 100;
	
	@Override
	public void paintComponent(Graphics g)
	{
		g.drawString("Not Hello, World Component", MESSAGE_X, MESSAGE_Y);
	}
	
	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
