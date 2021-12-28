package com.triphan.draw;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class DrawTest_2 
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() -> {
			var frame = new MyFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
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
	private static final int DEFAULT_WIDTH = 500;
	private static final int DEFAULT_HEIGHT = 500;
	
	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		double leftX = 120;
		double topY = 100;
		double width = 250;
		double height = 300;
		
//		Draw a rectangle
		Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
		g2.draw(rect);
		
//		Draw the enclosed ellipse
		Ellipse2D ellipse = new Ellipse2D.Double();
		ellipse.setFrame(rect);
		g2.draw(ellipse);
		
//		Draw two diagonals
		g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));
		g2.draw(new Line2D.Double(leftX + width, topY, leftX, topY + height));
		
//		Draw a circle with the same center
		double centerX = rect.getCenterX();
		double centerY = rect.getCenterY();
		double radius = 220;
		
		Ellipse2D circle = new Ellipse2D.Double();
		circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
		g2.draw(circle);
	}
}


















