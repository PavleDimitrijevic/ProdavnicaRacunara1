/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pavledimitrijevic.prodavnicaracunara;

/**
 *
 * @author PAVLE
 */
public class StavkaRacuna {

    private Racun racun;
    private int rb;
    private int kolicina;
    private double cena;
    private Racunar racunar;

    public StavkaRacuna() {
    }

    public StavkaRacuna(Racun racun, int rb, int kolicina, double cena, Racunar racunar) {
        setRacun(racun);
        setRb(rb);
        setKolicina(kolicina);
        setCena(cena);
        setRacunar(racunar);
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        if (racun == null) {
            throw new NullPointerException("Racun ne sme biti null.");
        }
        this.racun = racun;
    }

    public int getRb() {
        return rb;
    }

    public void setRb(int rb) {
        if (rb <= 0) {
            throw new IllegalArgumentException("Redni broj mora biti pozitivan broj.");
        }
        this.rb = rb;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        if (kolicina <= 0) {
            throw new IllegalArgumentException("Kolicina mora biti veca od nule.");
        }
        this.kolicina = kolicina;
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

    public Racunar getRacunar() {
        return racunar;
    }

    public void setRacunar(Racunar racunar) {
        if (racunar == null) {
            throw new NullPointerException("Racunar ne sme biti null.");
        }
        this.racunar = racunar;
    }

}
