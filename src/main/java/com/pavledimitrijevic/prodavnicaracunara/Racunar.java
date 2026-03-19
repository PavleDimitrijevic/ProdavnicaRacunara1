/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pavledimitrijevic.prodavnicaracunara;

import java.util.ArrayList;

/**
 *
 * @author PAVLE
 */
public class Racunar {

    private Long racunarID;
    private String naziv;
    private double cenaPoKomadu;
    private String opis;
    private TipRacunara tipRacunara;
    private ArrayList<Komponenta> komponente;

    public Racunar() {
    }

    public Racunar(Long racunarID, String naziv, double cenaPoKomadu, String opis, TipRacunara tipRacunara, ArrayList<Komponenta> komponente) {
        setRacunarID(racunarID);
        setNaziv(naziv);
        setCenaPoKomadu(cenaPoKomadu);
        setOpis(opis);
        setTipRacunara(tipRacunara);
        setKomponente(komponente);
    }

    @Override
    public String toString() {
        return naziv + "(Cena po komadu: " + cenaPoKomadu + "din)";
    }

    public Long getRacunarID() {
        return racunarID;
    }

    public void setRacunarID(Long racunarID) {
        if (racunarID == null) {
            throw new NullPointerException("ID ne sme biti null.");
        }

        if (racunarID <= 0) {
            throw new IllegalArgumentException("ID mora biti pozitivan broj.");
        }

        this.racunarID = racunarID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        if (naziv == null) {
            throw new NullPointerException("Naziv ne sme biti null.");
        }

        if (naziv.trim().isEmpty()) {
            throw new IllegalArgumentException("Naziv ne sme biti prazan.");
        }

        this.naziv = naziv;
    }

    public double getCenaPoKomadu() {
        return cenaPoKomadu;
    }

    public void setCenaPoKomadu(double cenaPoKomadu) {
        if (cenaPoKomadu <= 0) {
            throw new IllegalArgumentException("Cena po komadu mora biti veca od nule.");
        }
        this.cenaPoKomadu = cenaPoKomadu;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        if (opis == null) {
            throw new NullPointerException("Opis ne sme biti null.");
        }

        if (opis.trim().isEmpty()) {
            throw new IllegalArgumentException("Opis ne sme biti prazan.");
        }
        this.opis = opis;
    }

    public TipRacunara getTipRacunara() {
        return tipRacunara;
    }

    public void setTipRacunara(TipRacunara tipRacunara) {
        if (tipRacunara == null) {
            throw new NullPointerException("Tip racunara ne sme biti null.");
        }
        this.tipRacunara = tipRacunara;
    }

    public ArrayList<Komponenta> getKomponente() {
        return komponente;
    }

    public void setKomponente(ArrayList<Komponenta> komponente) {
        if (komponente == null) {
            throw new NullPointerException("Lista komponenti ne sme biti null.");
        }

        if (komponente.isEmpty()) {
            throw new IllegalArgumentException("Racunar mora imati bar jedanu komponentu.");
        }
        this.komponente = komponente;
    }

}
