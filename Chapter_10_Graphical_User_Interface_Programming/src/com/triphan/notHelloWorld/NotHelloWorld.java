package com.triphan.notHelloWorld;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * @version 1.0 2021-12-27
 * @author Tri Phan
 *
 */
public class NotHelloWorld 
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() -> {
			var frame = new NotHelloWorldFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("NotHelloWorld");
			frame.setVisible(true);
		});
	}
}

/**
 * A frame that contains a message panel. 
 */
class NotHelloWorldFrame extends JFrame
{
	public NotHelloWorldFrame()
	{
		add(new NotHelloWorldComponent());
		pack();
	}
}

/**
 * A component that displays a message.
 *
 */
class NotHelloWorldComponent extends JComponent
{
	private static final int MESSAGE_X = 75;
	private static final int MESSAGE_Y = 100;
	
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	@Override
	public void paintComponent(Graphics g)
	{
		g.drawString("Not a Hello, world program", MESSAGE_X, MESSAGE_Y);
	}
	
	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}






























