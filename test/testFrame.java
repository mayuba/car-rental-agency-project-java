package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
 
import Interface.Client_version1_0.RecherchePanel;
import Interface.Client_version1_0.ReservationPanel;
import Interface.Entreprise_Version1_0.ConfigurationPane; 
import Utilitaire.Client;

public class testFrame {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testFrame window = new testFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static void changement(String p) {

		if (p.equals("recherche")) {
			ReservationPanel ReservationPanel = new ReservationPanel();
			ReservationPanel.setBounds(0, 0, 500, 608);
			RecherchePanel.setVisible(false);
			ReservationPanel.show();
			frame.getContentPane().add(ReservationPanel);

		}
		  

		if (p.equals("Connexion")) {
			ConfigurationPane configurationPanel = new ConfigurationPane();
			configurationPanel.setBounds(100, 100, 500, 608);
			RecherchePanel.setVisible(false);
			configurationPanel.show();
			frame.getContentPane().add(configurationPanel);

		}

	}

	static RecherchePanel RecherchePanel = new RecherchePanel();

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 891, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		RecherchePanel.setBounds(0, 0, 500, 608);

		RecherchePanel.show();
		;
		frame.getContentPane().add(RecherchePanel);

	}

}
