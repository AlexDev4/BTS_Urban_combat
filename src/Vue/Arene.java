package Vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Arene extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Arene() {
		setTitle("Arene");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alexi\\OneDrive\\Bureau\\BTS SIO\\Programmes\\Urban_Marginal\\media\\fonds\\fondarene.jpg"));
		lblNewLabel.setBounds(0, 0, 811, 614);
		contentPane.add(lblNewLabel);
	}

}
