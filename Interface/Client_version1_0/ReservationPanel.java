package Interface.Client_version1_0;
/*@
 * 
 * 
 * 
 * linterface de reservation<
 * 
 */
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;

import Data.ReservationData;
import Utilitaire.Client;
import Utilitaire.Reservation;
import test.testFrame;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReservationPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	
	/*@
	 * 
	 * affichage panel infor de reservation
	 * et affchice
	 * 
	 */

	ReservationData rdata = new ReservationData();

	static Reservation res;

	public Reservation getRes() {
		return res;
	}

	public static void setRes(Reservation re) {
		res = re;
	}

	double prixtaxe;
	public double total = 0;
	static double prix_classe = 0;
	static double nbJrSupp = 0;
	static double prixAssurance = 0;
	static double prixSuppl = 0;
	static double taxe = 15;
	double prix;
	double prixassurances;

	FormulairePane FormulairePane = new FormulairePane();

	public ReservationPanel() {

		setLayout(null);
		JButton btnReserve = new JButton("Reserver");
		btnReserve.addActionListener(new ActionListener() {
			private JOptionPane jop;

			public void actionPerformed(ActionEvent e) {
				String nom = FormulairePane.getNom().getText();
			
				
				String adresse = FormulairePane.getAdresse().getText();
			
				
				String TEL = FormulairePane.getCellulaire().getText();
				

				String courriel = FormulairePane.getCourriel().getText();
				
				String prenom = FormulairePane.getPrenom().getText();
				
				
				String classP = FormulairePane.getClass_permis().getText();
				
				
				String Npermis = FormulairePane.getNum_permis().getText();
				
					
			

				Client c = new Client(nom, prenom, courriel, adresse, TEL, classP, Npermis, getTotalReser());
				 

				// Boîte du message d'information

				jop = new JOptionPane();
				if(nom.equals("")|prenom.equals("")|adresse.equals("")|courriel.equals("")|TEL.equals("")|classP.equals("")|Npermis.equals("")){
					JOptionPane.showMessageDialog(null, "Veuillez completer toutes les informations avant de poursuivre");}
				else{

				int option = JOptionPane.showConfirmDialog(null, "Numero de confirmation : "+Npermis+"\nVotre nom : "+nom+"\nVotre prenom : "+prenom+"\n"+"\nVotre adresse : "+adresse+"\n"+"\nVotre telephone : "+TEL+"\n"+"\nVotre courriel : "+courriel+"\n",
						"Confirmation", JOptionPane.YES_OPTION);

				if (option == JOptionPane.YES_OPTION) {
					
					JOptionPane.showMessageDialog(null, "VOTRE RESERVATION A ÉTÉ EFFECTUÉ\nImprimer votre recu");
					System.exit(1);

					
				}
			 
			}}
		});
		btnReserve.setBounds(614, 536, 89, 23);
		add(btnReserve);
		JLabel lblCatgorieDeVhicule;
		JLabel lblType;
		JLabel lblPrixVehicule;
		JLabel lblKilomtrage;
		JLabel lblToltalGeneral;
		JLabel lblkilo;
		JLabel lbPrixAssurance;
		JLabel lblTaxe;
		setLayout(null);

		FormulairePane.setBounds(521, 25, 299, 480);
		add(FormulairePane);
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(115, 536, 89, 23);
		add(btnAnnuler);
		btnAnnuler.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			
				JOptionPane.showMessageDialog(null, "MERCI!\n RETOUR A LA PAGE D'ACCEUIL");
				System.exit(0);
				
			}
			
		});
	
		JPanel FacturePane = new JPanel();
		FacturePane.setBounds(33, 25, 455, 480);
		add(FacturePane);
		FacturePane.setLayout(null);

		lblCatgorieDeVhicule = new JLabel("CAT\u00C9GORIE DE V\u00C9HICULE");
		lblCatgorieDeVhicule.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCatgorieDeVhicule.setBounds(57, 48, 136, 14);
		FacturePane.add(lblCatgorieDeVhicule);

		lblType = new JLabel(getRes().getTypeVehicule());
		lblType.setForeground(Color.RED);
		lblType.setBounds(57, 95, 166, 14);
		FacturePane.add(lblType);

		lblPrixVehicule = new JLabel("CAD " + getRes().getPrixType() + " ");
		lblPrixVehicule.setBounds(354, 95, 58, 14);
		FacturePane.add(lblPrixVehicule);

		JLabel lblKilomtrageDuVhicule = new JLabel("KILOM\u00C9TRAGE DU V\u00C9HICULE");
		lblKilomtrageDuVhicule.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKilomtrageDuVhicule.setBounds(59, 170, 154, 14);
		FacturePane.add(lblKilomtrageDuVhicule);

		lblKilomtrage = new JLabel("" + getRes().getForfaits() + "");
		lblKilomtrage.setBounds(57, 214, 156, 14);
		FacturePane.add(lblKilomtrage);

		lblkilo = new JLabel("Inclus");
		lblkilo.setBounds(354, 214, 58, 14);
		FacturePane.add(lblkilo);

		JLabel lblTaxesEtFrais = new JLabel("TAXES ET FRAIS");
		lblTaxesEtFrais.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTaxesEtFrais.setBounds(59, 295, 88, 14);
		FacturePane.add(lblTaxesEtFrais);

		JLabel lblVehicleLicenseFee = new JLabel("PRIX D'ASSURANCE " + nbJours + " /jour");
		lblVehicleLicenseFee.setBounds(57, 336, 166, 14);
		FacturePane.add(lblVehicleLicenseFee);

		lbPrixAssurance = new JLabel("CAD " + nbJours * getRes().getAssurance() + "");
		lbPrixAssurance.setBounds(354, 338, 91, 14);
		FacturePane.add(lbPrixAssurance);

		JLabel lblCotTotalEstim = new JLabel("CO\u00DBT TOTAL ESTIM\u00C9");
		lblCotTotalEstim.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCotTotalEstim.setBounds(59, 406, 113, 14);
		FacturePane.add(lblCotTotalEstim);
		JLabel lblValueAddedTax = new JLabel("VALUE ADDED TAX " + taxe + "%");
		lblValueAddedTax.setBounds(57, 363, 156, 14);
		FacturePane.add(lblValueAddedTax);
		lblToltalGeneral = new JLabel("CAD " + getTotalReser() + "");
		lblToltalGeneral.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblToltalGeneral.setBounds(314, 431, 99, 19);
		FacturePane.add(lblToltalGeneral);

		lblTaxe = new JLabel("CAD " + taxe + "");
		lblTaxe.setBounds(354, 363, 91, 14);
		FacturePane.add(lblTaxe);
		FacturePane.setBorder(BorderFactory.createTitledBorder("D\u00E9tails du prix"));
	}

	public static int nbJours = 1;

	public double getTotalReser() {
		double prix_classe = getRes().getPrixType();
		double total = ((nbJours * prix_classe) + getRes().getAssurance());
		taxe = (total * taxe) / 100;
		total = total + taxe;
		return total;
	}

}
