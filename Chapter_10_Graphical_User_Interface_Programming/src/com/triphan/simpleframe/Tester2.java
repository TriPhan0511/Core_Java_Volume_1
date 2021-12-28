package com.triphan.simpleframe;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Tester2 
{
	public static void main(String[] args)
	{
//		EventQueue.invokeLater(new Runnable() 
//		{
//			@Override
//			public void run() 
//			{
//				MyFrame frame = new MyFrame();
//				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				frame.setVisible(true);
//			}
//		});
		
		EventQueue.invokeLater(() -> {
			MyFrame frame = new MyFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("Simple Frame");
			frame.setVisible(true);
		});
	}
}

class MyFrame extends JFrame
{
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	public MyFrame()
	{
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}


























