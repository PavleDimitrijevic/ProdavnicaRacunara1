/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pavledimitrijevic.prodavnicaracunara;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PAVLE
 */
public class Racun {

    private Long racunID;
    private Date datumVreme;
    private double cena;
    private Administrator administrator;
    private ArrayList<StavkaRacuna> stavkeRacuna;

    public Racun() {
    }

    public Racun(Long racunID, Date datumVreme, double cena, Administrator administrator, ArrayList<StavkaRacuna> stavkeRacuna) {
        setRacunID(racunID);
        setDatumVreme(datumVreme);
        setCena(cena);
        setAdministrator(administrator);
        setStavkeRacuna(stavkeRacuna);
    }

    public Long getRacunID() {
        return racunID;
    }

    public void setRacunID(Long racunID) {
        if (racunID == null) {
            throw new NullPointerException("ID ne sme biti null.");
        }

        if (racunID <= 0) {
            throw new IllegalArgumentException("ID mora biti pozitivan broj.");
        }
        this.racunID = racunID;
    }

    public Date getDatumVreme() {
        return datumVreme;
    }

    public void setDatumVreme(Date datumVreme) {
        if (datumVreme == null) {
            throw new NullPointerException("Datum i vreme ne mogu biti null.");
        }

        Date today = new Date();
        if (datumVreme.after(today)) {
            throw new IllegalArgumentException("Datum ne moze biti u buducnosti.");
        }
        this.datumVreme = datumVreme;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if (cena <= 0) {
            throw new IllegalArgumentException("Cena mora biti veca od nule.");
        }

        this.cena = cena;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        if (administrator == null) {
            throw new NullPointerException("Racun mora imati administratora.");
        }
        this.administrator = administrator;
    }

    public ArrayList<StavkaRacuna> getStavkeRacuna() {
        return stavkeRacuna;
    }

    public void setStavkeRacuna(ArrayList<StavkaRacuna> stavkeRacuna) {
        if (stavkeRacuna == null) {
            throw new NullPointerException("Lista stavki ne sme biti null.");
        }

        if (stavkeRacuna.isEmpty()) {
            throw new IllegalArgumentException("Racun mora imati bar jednu stavku racuna.");
        }

        this.stavkeRacuna = stavkeRacuna;
    }

}
