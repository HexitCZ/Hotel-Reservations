package Core;

import javax.swing.JFrame;

import GUI.MyPanel;
import GUI.UI;
import Objects.Floor;
import Objects.Room;

public class Main
{

	public static void main(String[] args)
	{
		// UI.GenerateUI();
		// UI.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JFrame frame = new JFrame("MyPanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new MyPanel());

		frame.pack();
		frame.setVisible(true);

		Generator.GenerateSomething();
	}

}
