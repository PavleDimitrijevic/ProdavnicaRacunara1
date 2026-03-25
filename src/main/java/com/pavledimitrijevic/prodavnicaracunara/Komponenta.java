/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pavledimitrijevic.prodavnicaracunara;

/**
 * Predstavlja komponentu racunara.
 * <p>
 * Svaka komponenta ima redni broj, naziv i pripada nekom racunaru.
 * </p>
 *
 * @author PAVLE
 */
public class Komponenta {

    /**
     * Racunar kome komponenta pripada.
     * <p>
     * Obelezen je kao <b>transient</b> da se ne bi serijalizovao.
     * </p>
     */
    private transient Racunar racunar;

    /**
     * Redni broj komponente kao int
     */
    private int rb;

    /**
     * Naziv komponente kao string
     */
    private String naziv;

    /**
     * Inicijalizuje objekat klase Komponenta sa atributima koji imaju default
     * vrednosti.
     */
    public Komponenta() {
    }

    /**
     * Inicijalizuje objekat klase Komponenta sa svim parametrima.
     *
     * @param racunar Racunar kome komponenta pripada. Ne sme biti null.
     * @param rb Redni broj komponente. Mora biti veci od nule.
     * @param naziv Naziv komponente. Ne sme biti null niti prazan string.
     */
    public Komponenta(Racunar racunar, int rb, String naziv) {
        setRacunar(racunar);
        setRb(rb);
        setNaziv(naziv);
    }

    /**
     * Vraca tekstualni prikaz komponente.
     *
     * @return String sa podacima o rednom broju i nazivu komponente u formatu
     * rb + ". " + naziv
     */
    @Override
    public String toString() {
        return rb + ". " + naziv;
    }

    /**
     * Vraca racunar kome komponenta pripada.
     *
     * @return racunar
     */
    public Racunar getRacunar() {
        return racunar;
    }

    /**
     * Postavlja racunar kome komponenta pripada. Racunar ne sme biti null.
     *
     * @param racunar Racunar kome komponenta pripada
     * @throws java.lang.NullPointerException ako je racunar null
     */
    public void setRacunar(Racunar racunar) {
        if (racunar == null) {
            throw new NullPointerException("Racunar ne sme biti null.");
        }
        this.racunar = racunar;
    }

    /**
     * Vraca redni broj komponente.
     *
     * @return redni broj
     */
    public int getRb() {
        return rb;
    }

    /**
     * Postavlja redni broj komponente. Redni broj mora biti veci od nule.
     *
     * @param rb Redni broj
     * @throws java.lang.IllegalArgumentException ako je redni broj negativan
     * ili jednak nuli
     */
    public void setRb(int rb) {
        if (rb <= 0) {
            throw new IllegalArgumentException("Redni broj mora biti pozitivan broj.");
        }
        this.rb = rb;
    }

    /**
     * Vraca naziv komponente.
     *
     * @return naziv komponente
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Postavlja naziv komponente. Naziv ne sme biti null niti prazan string.
     *
     * @param naziv Naziv
     * @throws java.lang.NullPointerException ako je naziv null
     * @throws java.lang.IllegalArgumentException ako je naziv prazan string
     */
    public void setNaziv(String naziv) {
        if (naziv == null) {
            throw new NullPointerException("Naziv ne sme biti null.");
        }

        if (naziv.trim().isEmpty()) {
            throw new IllegalArgumentException("Naziv ne sme biti prazan.");
        }
        this.naziv = naziv;
    }

}
