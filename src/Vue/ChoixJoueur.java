package Vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChoixJoueur extends JFrame {

	private JPanel contentPane;
	private Arene frmArene;


	private void btnPrecedent_click() {
		System.out.printf("Precedent");
	}
	
	private void btnSuivant_click() {
		System.out.printf("suivant");
	}
	
	private void btnGo_click() {
		System.out.printf("Go");
		this.frmArene = new Arene() ;
		this.frmArene.setVisible(true);
		ChoixJoueur.this.dispose();
	}
	
	public ChoixJoueur() {
		setTitle("Choix Joueur");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Alexi\\OneDrive\\Bureau\\BTS SIO\\Programmes\\Urban_Marginal\\media\\fonds\\fondchoix.jpg"));
		lblNewLabel.setBounds(0, 0, 386, 263);
		contentPane.add(lblNewLabel);
		
		JButton btnPrecedent = new JButton("");
	    btnPrecedent.setOpaque(false);
	    btnPrecedent.setContentAreaFilled(false);
	    btnPrecedent.setBorderPainted(false);
		btnPrecedent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPrecedent_click();
			}
		});
		btnPrecedent.setBounds(43, 153, 85, 21);
		contentPane.add(btnPrecedent);
		
		JButton btnSuivant = new JButton("");
		btnSuivant.setOpaque(false);
		btnSuivant.setContentAreaFilled(false);
		btnSuivant.setBorderPainted(false);
		btnSuivant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSuivant_click();
			}
		});
		btnSuivant.setBounds(270, 153, 85, 21);
		contentPane.add(btnSuivant);
		
		JButton btnGo = new JButton("");
		btnGo.setOpaque(false);
		btnGo.setContentAreaFilled(false);
		btnGo.setBorderPainted(false);
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGo_click();
			}
		});
		btnGo.setBounds(301, 184, 85, 69);
		contentPane.add(btnGo);
	}

}
