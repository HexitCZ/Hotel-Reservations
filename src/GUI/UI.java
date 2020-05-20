package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class UI
{
	public static JFrame frame = new JFrame();
	public static JPanel panelCont = new JPanel();
	public static JPanel panelOne = new JPanel();
	public static JPanel panelTwo = new JPanel();
	public static JLabel label = new JLabel("flag");
	public static JButton button = new JButton("Accept");
	public static JButton button2 = new JButton("Add new");
	public static JTextField textfield = new JTextField();
	public static CardLayout cl = new CardLayout();
	public static void GenerateUI()
	{
		panelCont.setLayout(cl);
		
		panelCont.add(panelOne,"1");
		panelCont.add(panelTwo,"2");
		
		panelOne.setLayout(cl);
		panelTwo.setLayout(cl);
		
		panelOne.add(textfield);
		panelOne.add(button);
		
		panelTwo.add(label);
		panelTwo.add(button2);
		
		button.addActionListener((ActionListener) new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				cl.show(panelCont, "2");
			}

		});
		button2.addActionListener((ActionListener) new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				cl.show(panelCont, "1");
			}

		});

		
		button.setBounds(20, 20, 20, 20);
		button2.setBounds(20, 20, 20, 20);
		
		label.setBounds(0,0,100,20);
		label.setVisible(true);
		textfield.setBounds(0,0,100,20);
		textfield.setVisible(true);
		
		button.setVisible(true);
		button2.setVisible(true);

	
		frame.add(panelCont);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.setVisible(true);
	}

}
