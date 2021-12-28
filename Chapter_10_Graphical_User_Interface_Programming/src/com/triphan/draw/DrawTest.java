package com.triphan.draw;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class DrawTest 
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() -> {
			var frame = new DrawFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("DrawTest");
			frame.setVisible(true);
		});
	}
}

/**
 * A frame that contains a panel with drawings
 *
 */
class DrawFrame extends JFrame
{
	public DrawFrame()
	{
		add(new DrawComponent());
		pack();
	}
}

/**
 * A component that displays rectangles and ellipses. 
 */
class DrawComponent extends JComponent
{
	private static final int DEFAULT_WIDTH = 400;
	private static final int DEFAULT_HEIGHT = 400;
	
	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
//		Draw a rectangle
		double leftX = 100;
		double topY = 100;
		double width = 200;
		double height = 150;
		
		var rect = new Rectangle2D.Double(leftX, topY, width, height);
		g2.draw(rect);
		
//		Draw the enclosed ellipse
		var ellipse = new Ellipse2D.Double();
		ellipse.setFrame(rect);
		g2.draw(ellipse);
		
//		Draw a diagonal line
		g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));
		
//		Draw a circle with the same center
		double centerX = rect.getCenterX();
		double centerY = rect.getCenterY();
		double radius = 150;
		
		var cirlce = new Ellipse2D.Double();
		cirlce.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
		g2.draw(cirlce);
	}
}

























