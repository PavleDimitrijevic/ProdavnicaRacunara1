/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pavledimitrijevic.prodavnicaracunara;

import java.util.Objects;

/**
 * * Predstavlja Administratora sa osnovnim podacima o njemu i pristupu.
 * <p>
 * Svaki administrator ima jedinstveni ID, ime, prezime, username i password.
 * </p>
 *
 * @author PAVLE
 */
public class Administrator {

    /**
     * ID administratora kao Long
     */
    private Long administratorID;

    /**
     * Ime administratora kao String
     */
    private String ime;

    /**
     * Prezime administratora kao String
     */
    private String prezime;

    /**
     * Username adminsitratora kao String
     */
    private String username;

    /**
     * Password administratora kao String
     */
    private String password;

    /**
     * Inicijalizuje objekat klase Administrator sa svim parametrima.
     *
     * @param administratorID Jedinstveni ID administratora. Mora biti pozitivan
     * broj.
     * @param ime Ime administratora. Ne sme biti null niti prazan string.
     * @param prezime Prezime administratora. Ne sme biti null niti prazan
     * string.
     * @param username Username administratora. Ne sme biti null niti prazan
     * string.
     * @param password Password administratora. Mora imati najmanje 8 karaktera.
     */
    public Administrator(Long administratorID, String ime, String prezime, String username, String password) {
        setAdministratorID(administratorID);
        setIme(ime);
        setPrezime(prezime);
        setUsername(username);
        setPassword(password);
    }

    /**
     * Inicijalizuje objekat klase Adminstrator sa atributima koje imaju default
     * vrednosti.
     */
    public Administrator() {
    }

    /**
     * Poredi dva administratora po njihovom ID-u.
     *
     * @param obj Objekat sa kojim se poredi ID
     * @return
     * <ul>
     * <li> true ako je uneti objekat razlicit od null, ako je objekat klase
     * Administrator i ako je ID isti ID prvog Administratora </li>
     * <li> false u svim ostalim slucajevima </li>
     * </ul>
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administrator other = (Administrator) obj;
        if (!Objects.equals(this.administratorID, other.administratorID)) {
            return false;
        }
        return true;
    }

    /**
     * Vraca tekstualni prikaz administratora.
     *
     * @return String sa podacima o imenu i prezimenu administratora u formatu
     * ime + " " + prezime
     */
    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    /**
     * Vraca ID administratora.
     *
     * @return administratorID
     */
    public Long getAdministratorID() {
        return administratorID;
    }

    /**
     * Postavlja ID administratora. ID mora biti pozitivan broj i ne sme biti
     * null.
     *
     * @param administratorID ID administratora
     * @throws java.lang.NullPointerException ako je ID null
     * @throws java.lang.IllegalArgumentException ako je ID manji ili jednak
     * nuli
     */
    public void setAdministratorID(Long administratorID) {
        if (administratorID == null) {
            throw new NullPointerException("ID ne sme biti null.");
        }

        if (administratorID <= 0) {
            throw new IllegalArgumentException("ID mora biti pozitivan broj.");
        }

        this.administratorID = administratorID;
    }

    /**
     * Vraca ime administratora.
     *
     * @return ime
     */
    public String getIme() {
        return ime;
    }

    /**
     * Postavlja ime administratora. Ime ne sme biti null niti prazan string.
     *
     * @param ime Ime administratora
     * @throws java.lang.NullPointerException ako je ime null
     * @throws java.lang.IllegalArgumentException ako je ime prazan string
     */
    public void setIme(String ime) {
        if (ime == null) {
            throw new NullPointerException("Ime ne sme biti null.");
        }

        if (ime.trim().isEmpty()) {
            throw new IllegalArgumentException("Ime ne sme biti prazno.");
        }

        this.ime = ime;
    }

    /**
     * Vraca prezime administratora.
     *
     * @return prezime
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * Postavlja prezime administratora. Prezime ne sme biti null niti prazan
     * string.
     *
     * @param prezime Prezime administratora
     * @throws java.lang.NullPointerException ako je prezime null
     * @throws java.lang.IllegalArgumentException ako je prezime prazan string
     */
    public void setPrezime(String prezime) {
        if (prezime == null) {
            throw new NullPointerException("Prezime ne sme biti null.");
        }

        if (prezime.trim().isEmpty()) {
            throw new IllegalArgumentException("Prezime ne sme biti prazno.");
        }

        this.prezime = prezime;
    }

    /**
     * Vraca username administratora.
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Postavlja username administratora. Username ne sme biti null niti prazan
     * string.
     *
     * @param username Username administratora
     * @throws java.lang.NullPointerException ako je username null
     * @throws java.lang.IllegalArgumentException ako je username prazan string
     */
    public void setUsername(String username) {
        if (username == null) {
            throw new NullPointerException("Username ne sme biti null.");
        }

        if (username.isEmpty()) {
            throw new IllegalArgumentException("Username ne sme biti prazan.");
        }

        this.username = username;
    }

    /**
     * Vraca password administratora.
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Postavlja password administratora. Password ne sme biti null i mora imati
     * najmanje 8 karaktera.
     *
     * @param password Password administratora
     * @throws java.lang.NullPointerException ako je password null
     * @throws java.lang.IllegalArgumentException ako je password kraci od 8
     * karaktera
     */
    public void setPassword(String password) {
        if (password == null) {
            throw new NullPointerException("Password ne sme biti null.");
        }

        if (password.length() < 8) {
            throw new IllegalArgumentException("Password mora imati najmanje 8 karaktera.");
        }

        this.password = password;
    }

}
