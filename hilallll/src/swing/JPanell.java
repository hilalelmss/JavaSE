package swing;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class JPanell extends JFrame {
	String kullaniciAdi = "hilal";
	String kullaniciAdi2 = "mustafa";
	String sifre = "123";
	String sifre2 = "456";

	public JPanell() {

		setVisible(true);
		setSize(250, 250);
		setLayout(new BorderLayout());

		Panel panel = new Panel();
		panel.setLayout(new GridLayout(2, 2));
		add(panel, BorderLayout.SOUTH);
		panel.setPreferredSize(new Dimension(100, 100));
		panel.setBackground(Color.orange);

		JTextField kAdiTF = new JTextField(3);
		JTextField sifreTF = new JTextField(3);
		JTextField kodTF = new JTextField(3);

		Panel panel2 = new Panel();
		add(panel2, BorderLayout.CENTER);
		panel2.setBackground(Color.yellow);
		panel2.setLayout(new GridLayout(3, 2));

		Label basarili = new Label();
		panel.add(basarili, BorderLayout.EAST);

		Panel panel3 = new Panel();
		panel.add(panel3, BorderLayout.CENTER);
		panel3.setBackground(Color.green);

		Label label = new Label("ww");
		panel3.add(label);

		Button button = new Button("giriþ");
		panel.add(button, BorderLayout.CENTER);
		button.setBackground(Color.pink);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				button.setVisible(false);
				if (kAdiTF.getText().equals(kullaniciAdi)) {
					if (sifreTF.getText().equals(sifre))
						basarili.setText("giriþ baþarýlý");
				} else
					basarili.setText("kullanýcý adý veya þifre hatalý");

				if (kAdiTF.getText().equals(kullaniciAdi2)) {
					if (sifreTF.getText().equals(sifre2))
						basarili.setText("giriþ baþarýlý");
				} else
					basarili.setText("kullanýcý adý veya þifre hatalý");
			}
		});

		Label kAdiL = new Label("kullanýcý adý:");
		Label sifreL = new Label("sifre:");
		Label kodL = new Label("güvenlik kodu:");

		panel2.add(kAdiL);
		panel2.add(kAdiTF);
		panel2.add(sifreL);
		panel2.add(sifreTF);
		panel2.add(kodL);

		panel2.add(kodTF);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private LayoutManager koduret() {
		Random r = new Random();
		String kod = "";
		int karakterSayisi = 10;
		String alphabet = "1234567890abcdefghijklmnoprstuvyzx";
		for (int i = 0; i < karakterSayisi; i++) {
			kod += alphabet.charAt(r.nextInt(alphabet.length()));
		}

		return null;
	}

}
