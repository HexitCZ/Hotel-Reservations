package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyPanel extends JPanel {
    public static JButton jcomp1;
    public static JButton jcomp2;
    public static JButton jcomp3;
    public static JTextArea jcomp4;
    public static JTextField jcomp5;
    public static JLabel jcomp6;
    public static JLabel jcomp7;
    public static JTextField jcomp8;
    public static JTextField jcomp9;
    public static JLabel jcomp10;

    public MyPanel() {
    	
        //construct components
        jcomp1 = new JButton ("Generate Floor");
        jcomp2 = new JButton ("Generate Room");
        jcomp3 = new JButton ("Update List");
        jcomp4 = new JTextArea (5,5);
        jcomp5 = new JTextField (5);
        jcomp6 = new JLabel ("Room count");
        jcomp7 = new JLabel ("Bed count");
        jcomp8 = new JTextField (5);
        jcomp9 = new JTextField (5);
        jcomp10 = new JLabel ("Price");

        //adjust size and set layout
        setPreferredSize (new Dimension (560, 574));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (40, 120, 135, 20);
        jcomp2.setBounds (40, 305, 135, 20);
        jcomp3.setBounds (290, 15, 140, 20);
        jcomp4.setBounds (195, 40, 335, 525);
        jcomp5.setBounds (40, 70, 65, 25);
        jcomp6.setBounds (40, 40, 100, 25);
        jcomp7.setBounds (40, 170, 100, 25);
        jcomp8.setBounds (40, 200, 65, 25);
        jcomp9.setBounds (40, 270, 135, 25);
        jcomp10.setBounds (40, 235, 100, 25);
    }


}
