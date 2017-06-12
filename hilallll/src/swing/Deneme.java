package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Deneme extends JFrame {
	public Deneme() {
		setLayout(new GridLayout());
		setVisible(true);
		setSize(150, 150);
		JLabel isimJL = new JLabel("adýnýz:");
		JLabel soyadJL = new JLabel("soyadýnýz:");

		JTextField isimTF = new JTextField();
		JTextField soyadTF = new JTextField();
		isimTF.setBackground(Color.PINK);
		soyadTF.setBackground(Color.PINK);
		add(isimJL);
		add(isimTF);
		add(isimTF);
		add(soyadJL);
		add(soyadTF);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
