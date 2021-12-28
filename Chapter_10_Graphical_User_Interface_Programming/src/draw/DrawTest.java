package draw;

import java.awt.Color;
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

public class DrawTest 
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() -> {
			var frame = new DrawFrame();
			frame.setTitle("DrawTest");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}

/**
 * A frame that contains a panel with drawings.
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
	public void paintComponent(Graphics g)
	{
		var g2 = (Graphics2D) g;
		
//		Draws a rectangle
		double leftX = 100;
		double topY = 100;
		double width = 200;
		double height = 150;
		var rect = new Rectangle2D.Double(leftX, topY, width, height);
		g2.draw(rect);
		
//		Draws the enclosed ellipse
		var ellipse = new Ellipse2D.Double();
		ellipse.setFrame(rect);
		g2.draw(ellipse);
		
//		Draws a diagonal
		g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));
		
//		Draws a circle with the same center
		double centerX = rect.getCenterX();
		double centerY = rect.getCenterY();
		double radius = 150;
		var circle = new Ellipse2D.Double();
		circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius); 
		g2.draw(circle);
		
		g2.setPaint(new Color(0, 128, 128));
		g2.drawString("Hello", 100, 100);
	}
	
	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}



































