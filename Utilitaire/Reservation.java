package Utilitaire;

import Interface.Client_version1_0.RecherchePanel;

public class Reservation {
	RecherchePanel Rpanel;

	private String emplacement, dateDPrise, heureDPrise, dateDRetour, DatedeNaissance, typeVehicule, forfaits;
	private double prixType, prixForfait, assurance;

	public double getAssurance() {
		return assurance;
	}

	public Reservation(String emplacement, String dateDPrise, String dateDRetour, String DatedeNaissance,
			String typeVehicule, String heureDPrise, String forfaits, double prixType, double prixForfait,
			double assurance) {
		this.emplacement = emplacement;
		this.dateDPrise = dateDPrise;
		this.heureDPrise = heureDPrise;
		this.dateDRetour = dateDRetour;
		this.DatedeNaissance = DatedeNaissance;
		this.typeVehicule = typeVehicule;
		this.forfaits = forfaits;
		this.prixType = prixType;
		this.prixForfait = prixForfait;
		this.assurance = assurance;
	}

	public double getPrixType() {
		return prixType;
	}

	public double getPrixForfait() {
		return prixForfait;
	}

	public String getEmplacement() {
		return this.emplacement;
	}

	public String getDatePrise(int idReservation) {
		return dateDPrise;
	}

	public String getDateRetour() {
		return dateDRetour;
	}

	public String getTypeVehicule() {
		return typeVehicule;
	}

	public String getDatenaissance() {
		return DatedeNaissance;
	}

	public String getForfaits() {
		return forfaits;
	}

	private int periode;

	public int getPeriode() {
		return this.periode;
	}

	public void setPeriode(int periode) {
		this.periode = periode;
	}

	private int etat;

	public int getEtat() {
		return this.etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	private int idClient;

	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	private int idVoiture;

	public int getIdVoiture() {
		return this.idVoiture;
	}

	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}

}
