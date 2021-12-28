package com.triphan.font;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class FontTest 
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() -> {
			var frame = new MyFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("Font Test");
			frame.setVisible(true);
		});
	}
}

class MyFrame extends JFrame
{
	public MyFrame()
	{
//		var component = new MyComponent();
//		component.setBackground(Color.RED);
//		component.setForeground(Color.PINK);
//		add(component);
		
		var component_2 = new MyComponent_2();
		add(component_2);
		
		pack();
	}
}

//Using color
class MyComponent extends JComponent
{
	@Override
	public Dimension getPreferredSize()
	{
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		return new Dimension(screenWidth / 3, screenHeight / 2);
	}
	

//	Set Paint
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.drawString("Good morning, every body!", 100, 200);
		
		g2.setPaint(Color.RED);
		g2.drawString("Warning", 100, 215);
		
		g2.setPaint(Color.BLACK);
		
		Rectangle2D rect = new Rectangle2D.Float(100, 250, 300, 150);
		g2.draw(rect);
		
		g2.setPaint(Color.YELLOW);
		g2.fill(rect);
		
		g2.setPaint(new Color(0, 128, 128));
		g2.drawString("Welcome", 100, 400);
	}
}

//Using Fonts
class MyComponent_2 extends JComponent
{
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 350;
	
	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.drawString("Not a hello world", 100, 100);
	}
}




























