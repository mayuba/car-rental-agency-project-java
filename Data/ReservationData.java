package Data;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Vector;

import org.w3c.dom.Document;

import org.w3c.dom.Node;

import Utilitaire.Client;
import Utilitaire.Reservation;

public class ReservationData {
	static Document doc;
	static Node pere;

	public ReservationData() {
	}

	public Reservation find(int id) {
		return null;

	}

	public void create(Reservation r, Client c) {
		Connection conn = null;
		try {
			JdbcManager pro = new JdbcManager();
			conn = pro.getConnection();
			Statement state = conn.createStatement();
			System.out.println("Connexion effective !");

			String sql = "INSERT INTO reservation (nom,prenon,adresse,courriel,telephone,ville,DateNaissance,DatePrise,DateRetour,Classe,Kilometrage,prixTotal) "
					+ "VALUES ('" + c.getNom() + "','" + c.getPrenom() + "','" + c.getAdresse() + "','"
					+ c.getCourriel() + "','" + c.getTEL() + "','" + r.getEmplacement() + "','" + r.getDatenaissance()
					+ "','10/10/2020','10/10/2020','" + r.getTypeVehicule() + "','" + r.getForfaits() + "','"
					+ c.getTotalprix() + "');";
			state.executeUpdate(sql);

			state.close();
			conn.close();

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
	}

	public int delete(int id) {
		return id;

	}

	public int updateEtat(int id, int etat) {
		return etat;

	}

	public int update(Client client, Reservation reservation) {

		return 1;

	}

	public Vector selectAll() {
		Vector resultat = null;

		return resultat;
	}

	public Vector rechEtat(int val) {
		Vector resultat = null;

		return resultat;
	}

	public Vector rechByIdClient(int IdClient) {
		return null;

	}

}
