/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pavledimitrijevic.prodavnicaracunara;

/**
 * Predstavlja tip racunara u prodavnici racunara. Tip racunara se identifikuje
 * pomocu ID-a i naziva.
 *
 * @author PAVLE
 */
public class TipRacunara {

    /**
     * ID tipa racunara kao Long
     */
    private Long tipRacunaraID;

    /**
     * Naziv racunara kao String
     */
    private String naziv;

    /**
     * Inicijalizuje objekat klase TipRacunara sa svim parametrima.
     *
     * @param tipRacunaraID Jedinstveni ID tipa racunara. Ne sme biti null i
     * mora biti veci od nule.
     * @param naziv Naziv tipa racunara. Ne sme biti null niti prazan string.
     */
    public TipRacunara(Long tipRacunaraID, String naziv) {
        setTipRacunaraID(tipRacunaraID);
        setNaziv(naziv);
    }

    /**
     * Inicijalizuje objekat klase TipRacunara sa atributima koji imaju default
     * vrednosti.
     */
    public TipRacunara() {
    }

    /**
     * Vraca jedinstveni ID tipa racunara.
     *
     * @return ID tipa racunara
     */
    public Long getTipRacunaraID() {
        return tipRacunaraID;
    }

    /**
     * Vraca tekstualni prikaz tipa racunara.
     *
     * @return naziv tipa racunara
     */
    @Override
    public String toString() {
        return naziv;
    }

    /**
     * Postavlja jedinstveni ID tipa racunara. ID tipa racunara ne sme biti null
     * i mora biti veci od nule.
     *
     * @param tipRacunaraID ID tipa racunara
     * @throws java.lang.NullPointerException ako je tipRacunaraID null
     * @throws java.lang.IllegalArgumentException ako je tipRacunaraID manji ili
     * jednak nuli
     */
    public void setTipRacunaraID(Long tipRacunaraID) {
        if (tipRacunaraID == null) {
            throw new NullPointerException("ID ne sme biti null.");
        }

        if (tipRacunaraID <= 0) {
            throw new IllegalArgumentException("ID mora biti pozitivan broj.");
        }
        this.tipRacunaraID = tipRacunaraID;
    }

    /**
     * Vraca naziv tipa racunara.
     *
     * @return naziv tipa racunara
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Postavlja naziv tipa racunara. Naziv tipa racunara ne sme biti null niti
     * prazan string.
     *
     * @param naziv Naziv tipa racunara
     * @throws java.lang.NullPointerException ako je naziv null
     * @throws java.lang.IllegalArgumentException ako je naziv prazan string
     */
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
