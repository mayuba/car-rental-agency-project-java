package Interface.Client_version1_0;
/*@
 * 
 * interface de recherche
 * constitu page d aceuil
 * 
 */
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner; 
import javax.swing.SpinnerDateModel;

import Utilitaire.Reservation;
import test.testFrame;

import java.awt.Choice;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class RecherchePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	Reservation reservation;
	String[] Classe = {  "Classe économique", "Classe moyenne", "Classe confort", "Classe luxe",
			"Classe de véhicules utilitaires" };
	double[] tabprixclass = { 39, 49, 59, 99, 89 };
	String[] forfaits = {"400 kilomètre", "kilomètre illimite" };
	double[] tabprixforfait = { 0.15, 10.40 };
	double prixAssurance = 17.30;
	JRadioButton assurance;
	double assurance1;
// costructeur
	public RecherchePanel() {
		setLayout(null);
		DateFormat format = new SimpleDateFormat("yyyy/MMMM/dd");
		assurance = new JRadioButton("Je suis couvert par une police d’assurance");
		assurance.setBounds(72, 359, 271, 23);
		add(assurance);
		setBorder(BorderFactory.createTitledBorder("Reservation"));
// choice classe de jva
		final Choice Emplacement = new Choice();
		Emplacement.setBounds(72, 80, 342, 20);
		String Ville[] = { "Ottawa", "Gatineau", "Toronto" };
		for (int i = 0; i < Ville.length; i++) {
			Emplacement.add(Ville[i]);
		}

		add(Emplacement);
// le forma na pas ete defini 
		
		final JFormattedTextField DatePrise = new JFormattedTextField();
		DatePrise.setText("Format(10/10/2015)");
		DatePrise.setBounds(72, 132, 204, 20);
		
		add(DatePrise);

		final Choice forfait = new Choice();
		forfait.setBounds(72, 333, 226, 20);

		for (int i = 0; i < forfaits.length; i++) {
			forfait.add(forfaits[i]);
		}
		add(forfait);

		final JSpinner HeurePrise = new JSpinner(new SpinnerDateModel(new Date(), null, null, Calendar.HOUR_OF_DAY));
		JSpinner.DateEditor de = new JSpinner.DateEditor(HeurePrise, "hh:mm");
		HeurePrise.setEditor(de);
		HeurePrise.setBounds(309, 132, 105, 20);
		add(HeurePrise);

		final JFormattedTextField DateRetour = new JFormattedTextField(format);
		DateRetour.setText("Format(10/10/2015)");
		DateRetour.setBounds(72, 163, 204, 20);

		add(DateRetour);

		JSpinner HeureRetour = new JSpinner(new SpinnerDateModel(new Date(), null, null, Calendar.HOUR_OF_DAY));
		JSpinner.DateEditor der = new JSpinner.DateEditor(HeureRetour, "hh:mm");
		HeureRetour.setEditor(der);
		HeureRetour.setBounds(309, 163, 105, 20);
		add(HeureRetour);

		final JFormattedTextField DateNaissance = new JFormattedTextField(format);
		DateNaissance.setBounds(72, 276, 226, 30);
		DateNaissance.setText("Format(10/10/2015)");
		add(DateNaissance);

		final Choice TypeVehicule = new Choice();
		TypeVehicule.setBounds(72, 229, 226, 20);
		for (int i = 0; i < Classe.length; i++) {
			TypeVehicule.add(Classe[i]);
		}
		add(TypeVehicule);

		final JButton recherche = new JButton("Recherche");
		recherche.setBounds(271, 417, 142, 37);

		add(recherche);

		
		/// creation des litener pour les boutons
		
		recherche.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				double prixclasse = 0;
				double prixforfait = 0;
				if (e.getSource() == recherche) {
					for (int i = 0; i < Classe.length; i++) {
						if (Classe[i].equals(TypeVehicule.getSelectedItem()))
							prixclasse = tabprixclass[i];
					}
					for (int i = 0; i < forfaits.length; i++) {
						prixforfait = tabprixforfait[i];
					}
					if (assurance.isSelected())
						assurance1 = 0;
					else
						assurance1 = prixAssurance;
					Reservation r = new Reservation(Emplacement.getSelectedItem(),
							DatePrise.getText() + " " + HeurePrise.getValue(), DateRetour.getText(),
							DateNaissance.getText(), TypeVehicule.getSelectedItem(), "10/10/1010",
							forfait.getSelectedItem(), prixclasse, prixforfait, assurance1);

					ReservationPanel.setRes(r);

					testFrame.changement("recherche");

				}
			}
		});

		JLabel lblEmplacement = new JLabel("Emplacement");
		lblEmplacement.setBounds(99, 60, 142, 14);
		add(lblEmplacement);

		JLabel lblTypeDau = new JLabel("Catégories de véhicules");
		lblTypeDau.setBounds(72, 209, 226, 14);
		add(lblTypeDau);

		JLabel lblDateDeNaissace = new JLabel("Date de naissace");
		lblDateDeNaissace.setBounds(72, 256, 226, 14);
		add(lblDateDeNaissace);

		JLabel lblOptionKilometrage = new JLabel("Option kilometrage");
		lblOptionKilometrage.setBounds(72, 313, 217, 14);
		add(lblOptionKilometrage);
		
		JButton btnConnexion = new JButton("Administration");
		btnConnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				testFrame.changement("Connexion");
				JOptionPane.showMessageDialog(null, "EN COURS DE MAINTENANCE");
				System.exit(0);
			}
		});
		btnConnexion.setBounds(501, 11, 160, 23);
		add(btnConnexion);

	}
}
