/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pavledimitrijevic.prodavnicaracunara;

/**
 *
 * @author PAVLE
 */
public class TipRacunara {

    private Long tipRacunaraID;
    private String naziv;

    public TipRacunara(Long tipRacunaraID, String naziv) {
        setTipRacunaraID(tipRacunaraID);
        setNaziv(naziv);
    }

    public TipRacunara() {
    }

    public Long getTipRacunaraID() {
        return tipRacunaraID;
    }

    @Override
    public String toString() {
        return naziv;
    }

    public void setTipRacunaraID(Long tipRacunaraID) {
        if (tipRacunaraID == null) {
            throw new NullPointerException("ID ne sme biti null.");
        }

        if (tipRacunaraID <= 0) {
            throw new IllegalArgumentException("ID mora biti pozitivan broj.");
        }
        this.tipRacunaraID = tipRacunaraID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        if (naziv == null) {
            throw new NullPointerException("Naziv ne sme biti null.");
        }

        if (naziv.isEmpty()) {
            throw new IllegalArgumentException("Naziv ne sme biti prazan.");
        }
        this.naziv = naziv;
    }

}
