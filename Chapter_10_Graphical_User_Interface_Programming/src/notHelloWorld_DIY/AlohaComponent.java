package notHelloWorld_DIY;

import javax.swing.JComponent;
import java.awt.Graphics;

public class AlohaComponent extends JComponent
{
	private String message;
	private int message_x;
	private int message_y;
	
	
	public AlohaComponent(String message, int message_x, int message_y)
	{
		this.message = message;
		this.message_x = message_x;
		this.message_y = message_y;
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		g.drawString(message, message_x, message_y);
	}
}
