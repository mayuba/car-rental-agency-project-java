package Interface.Client_version1_0;
/*@
 * mamadou belly ngaido
 * josepha
 * oudou
 * 
 * 
 * 
 * class pour l'affichage formulaire
 * 
 * 
 * pour recceuillirles infos du client
 */
import javax.swing.JPanel;
import java.awt.TextField;
/*@
 * 
 
 */
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.awt.Button; 

import Utilitaire.Client;
import test.testFrame;

public class FormulairePane extends JPanel {

	/**
	 * Create the panel.
	 * 
	 * 
	 * get and set de chaque attribut concernant le client
	 * 
	 */

	 

	public TextField getNom() {
		return nom;
	}

	public void setNom(TextField nom) {
		this.nom = nom;
	}

	public TextField getPrenom() {
		return prenom;
	}

	public void setPrenom(TextField prenom) {
		this.prenom = prenom;
	}

	public TextField getCourriel() {
		return courriel;
	}

	public void setCourriel(TextField courriel) {
		this.courriel = courriel;
	}

	public TextField getCellulaire() {
		return cellulaire;
	}

	public void setCellulaire(TextField cellulaire) {
		this.cellulaire = cellulaire;
	}

	public TextField getNum_permis() {
		return Num_permis;
	}

	public void setNum_permis(TextField num_permis) {
		Num_permis = num_permis;
	}

	public TextField getClass_permis() {
		return Class_permis;
	}

	public void setClass_permis(TextField class_permis) {
		Class_permis = class_permis;
	}

	public TextField getAdresse() {
		return adresse;
	}

	public void setAdresse(TextField adresse) {
		this.adresse = adresse;
	}

	TextField nom, prenom, courriel, cellulaire, Num_permis, Class_permis, adresse;
	
	
	/*@
	 * initialisation des composante du panel
	 */

	public FormulairePane() {
		setLayout(null);
//jtextfield pour champ de saisi
		nom = new TextField();
		nom.setBounds(26, 31, 243, 22);
		add(nom);

		prenom = new TextField();
		prenom.setBounds(26, 81, 243, 22);
		add(prenom);

		courriel = new TextField();
		courriel.setBounds(26, 132, 243, 22);
		add(courriel);

		cellulaire = new TextField();
		cellulaire.setBounds(26, 178, 243, 22);
		add(cellulaire);

		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(94, 11, 75, 14);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Prenom");
		lblNewLabel_2.setBounds(94, 61, 75, 14);
		add(lblNewLabel_2);

		JLabel lblNewLabel_4 = new JLabel("Telephone");
		lblNewLabel_4.setBounds(83, 158, 86, 14);
		add(lblNewLabel_4);

		Num_permis = new TextField();
		Num_permis.setBounds(26, 232, 243, 22);
		add(Num_permis);

		Class_permis = new TextField();
		Class_permis.setBounds(26, 285, 243, 22);
		add(Class_permis);
//Jlabel pour le titre de chaq textfield
		JLabel lblDateDeNaissance = new JLabel("Courriel");
		lblDateDeNaissance.setBounds(94, 109, 75, 14);
		add(lblDateDeNaissance);
		JLabel lblNumeroDePermis = new JLabel("No Permis de conduire");
		lblNumeroDePermis.setBounds(55, 206, 162, 14);
		add(lblNumeroDePermis);

		JLabel lblCodePostal = new JLabel("Adresse");
		lblCodePostal.setBounds(94, 313, 73, 14);
		add(lblCodePostal);

		JLabel lblClasseDePermis = new JLabel("Classe de permis de conduire");
		lblClasseDePermis.setBounds(42, 260, 175, 14);
		add(lblClasseDePermis);

		adresse = new TextField();
		adresse.setBounds(26, 332, 243, 22);
		add(adresse);

		Button button = new Button("S'enregistrer");
		button.setBounds(420, 566, 70, 22);
		add(button);
		setBorder(BorderFactory.createTitledBorder("Information"));
	}
}
