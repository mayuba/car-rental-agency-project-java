
package Utilitaire;

import java.beans.*;
import java.io.Serializable;



public class Location extends Object implements Serializable {
    
 
    public Location() {
    }
    public Location(int idLocation, String dateLocation,int periode,int etat,int idClient, int idVoiture) {
    this.idLocation=idLocation;
    this.dateLocation=dateLocation;
    this.periode=periode;
    this.etat=etat;
    this.idClient=idClient;
    this.idVoiture=idVoiture;
    }
    private int idLocation;

    public int getIdLocation() {
        return this.idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

 
    private String dateLocation;

  
    public String getDateLocation() {
        return this.dateLocation;
    }

    public void setDateLocation(String dateLocation) {
        this.dateLocation = dateLocation;
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
