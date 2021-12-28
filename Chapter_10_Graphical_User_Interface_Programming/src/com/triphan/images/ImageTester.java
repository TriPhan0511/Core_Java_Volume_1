package com.triphan.images;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class ImageTester 
{
	public static void main(String[] args)
	{
		var frame = new MyFrame();
		frame.setTitle("Image Tester");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class MyFrame extends JFrame
{
	public MyFrame()
	{
		add(new MyComponent());
		pack();
	}
}

class MyComponent extends JComponent
{
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 350;
	
	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
//		Image image = new ImageIcon("blue-ball.gif").getImage();
		Image image = new ImageIcon("images/blue-ball.gif").getImage();
		g.drawImage(image, 100, 100, null);
	}
}



































