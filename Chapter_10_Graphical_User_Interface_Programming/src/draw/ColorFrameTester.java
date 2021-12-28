package draw;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class ColorFrameTester 
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() -> {
			var frame = new ColorFrame();
			frame.setTitle("Color and Backgrounf color");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}

class ColorFrame extends JFrame
{
	public ColorFrame()
	{
		add(new ColorComponent());
		pack();
	}
}

class ColorComponent extends JComponent
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
	}
}

































