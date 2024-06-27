package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP - Versão 1.0");
		lblNewLabel.setBounds(32, 30, 339, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@Author Filipe Jacob");
		lblNewLabel_1.setBounds(32, 72, 148, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WEB Service:");
		lblNewLabel_2.setBounds(32, 115, 120, 13);
		getContentPane().add(lblNewLabel_2);
		
		JLabel ldbWebService = new JLabel("republicavitual.com.br");
		ldbWebService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link ("https://republicavirtual.com.br/");
			}
		});
		ldbWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ldbWebService.setForeground(SystemColor.textHighlight);
		ldbWebService.setBounds(132, 115, 152, 13);
		getContentPane().add(ldbWebService);
		
		JButton btnGithub = new JButton("");
		btnGithub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/filipejacob");
			}
		});
		btnGithub.setForeground(SystemColor.control);
		btnGithub.setToolTipText("Github");
		btnGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGithub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGithub.setBackground(SystemColor.control);
		btnGithub.setBounds(35, 178, 48, 48);
		btnGithub.setBorder(null);
		getContentPane().add(btnGithub);
		
		JButton btnLinkedin = new JButton("");
		btnLinkedin.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkedin.png")));
		btnLinkedin.setToolTipText("Linkedin");
		btnLinkedin.setBorder(null);
		btnLinkedin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLinkedin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://www.linkedin.com/in/filipe-jacob/");
			}
		});
		btnLinkedin.setBackground(SystemColor.control);
		btnLinkedin.setBounds(115, 178, 48, 48);
		getContentPane().add(btnLinkedin);

	} //fim do construtor
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
