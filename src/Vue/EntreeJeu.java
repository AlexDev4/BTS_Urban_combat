package Vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Window.Type;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntreeJeu extends JFrame {

	private JPanel contentPane;
	private Arene frmArene;
	private ChoixJoueur frmChoixJoueur;
	private EntreeJeu EntreeJeu;
	
	private void btnExit_click()
	{
		System.exit(0);
	}
	
	private void btnStart_click() {
		this.frmArene = new Arene() ;
		this.frmArene.setVisible(true);
		EntreeJeu.this.dispose();

	}
	
	private void btnConnect_click() {
		this.frmChoixJoueur = new ChoixJoueur();
		this.frmChoixJoueur.setVisible(true);
		EntreeJeu.this.dispose();
	}

	public EntreeJeu() {
		setTitle("Urban Marginal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 176);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Start a server :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 10, 198, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblConnectAnExisting = new JLabel("Connect an existing server :");
		lblConnectAnExisting.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConnectAnExisting.setBounds(10, 33, 230, 18);
		contentPane.add(lblConnectAnExisting);
		
		JLabel lblIpServer = new JLabel("IP server :");
		lblIpServer.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIpServer.setBounds(10, 61, 85, 13);
		contentPane.add(lblIpServer);
		
		JTextField txtIP = new JTextField();
		txtIP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtIP.setText("127.0.0.1");
		txtIP.setBounds(92, 61, 152, 19);
		contentPane.add(txtIP);
		txtIP.setColumns(10);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConnect_click();
			}
		});
		btnConnect.setBounds(254, 59, 85, 21);
		contentPane.add(btnConnect);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExit_click();
			}
		});
		btnExit.setBounds(254, 90, 85, 21);
		contentPane.add(btnExit);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStart_click();
			}
		});
		btnStart.setBounds(254, 8, 85, 21);
		contentPane.add(btnStart);
	}
}
