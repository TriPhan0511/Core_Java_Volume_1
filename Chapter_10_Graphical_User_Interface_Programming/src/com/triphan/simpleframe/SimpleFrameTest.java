package com.triphan.simpleframe;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class SimpleFrameTest 
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() -> {
			var frame = new SimpleFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}


//Solution 2
class SimpleFrame extends JFrame
{
	public SimpleFrame()
	{
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		setSize(screenWidth / 2, screenHeight / 2);
	}
}


//Solution 1
//class SimpleFrame extends JFrame
//{
//	private static final int DEFAULT_WIDTH = 300;
//	private static final int DEFAULT_HEIGHT = 200;
//	
//	public SimpleFrame()
//	{
//		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
//		setResizable(false);
//	}
//}





























