
package Utilitaire;

import java.io.Serializable;

import Interface.Client_version1_0.FormulairePane;

public class Client extends Object implements Serializable {

	FormulairePane fp;

	 

	public Client(String nom, String prenom, String courriel, String adresse, String TEL, String classP,
			String Npermis,double totalprix) {
		this.nom = nom;
		this.prenom = prenom;
		this.courriel = courriel;
		this.adresse = adresse;
		this.TEL = TEL;
		this.classP = classP;
		this.Npermis = Npermis;
		this.totalprix=totalprix;
	}

	private String idClient;
	private String classP;
	private String Npermis;
	public double totalprix;
	public double getTotalprix() {
		return totalprix;
	}

	public String getIdClient() {
		return this.idClient;
	}

	public String nom;

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	private String prenom;

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	private String courriel;

	public String getCourriel() {
		return this.courriel;
	}

	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

	private String adresse;

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	private String login;

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	private String pass;

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	private String TEL;

	public String getTEL() {
		return this.TEL;
	}

	public void setTEL(String TEL) {
		this.TEL = TEL;
	}

}
