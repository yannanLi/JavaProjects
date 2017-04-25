package game;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Snake {
	
	public static void main (String[] args)
	{
		JFrame frame =new JFrame("Snake");
		frame.setContentPane(new SnakePanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.pack();
		
		frame.setPreferredSize(new Dimension(SnakePanel.WIDTH, SnakePanel.HEIGHT));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
		
	}

