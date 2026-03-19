/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pavledimitrijevic.prodavnicaracunara;

import java.util.Objects;

/**
 *
 * @author PAVLE
 */
public class Administrator {

    private Long administratorID;
    private String ime;
    private String prezime;
    private String username;
    private String password;

    public Administrator(Long administratorID, String ime, String prezime, String username, String password) {
        setAdministratorID(administratorID);
        setIme(ime);
        setPrezime(prezime);
        setUsername(username);
        setPassword(password);
    }

    public Administrator() {
    }

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

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    public Long getAdministratorID() {
        return administratorID;
    }

    public void setAdministratorID(Long administratorID) {
        if (administratorID == null) {
            throw new NullPointerException("ID ne sme biti null.");
        }

        if (administratorID <= 0) {
            throw new IllegalArgumentException("ID mora biti pozitivan broj.");
        }

        this.administratorID = administratorID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        if (ime == null) {
            throw new NullPointerException("Ime ne sme biti null.");
        }

        if (ime.trim().isEmpty()) {
            throw new IllegalArgumentException("Ime ne sme biti prazno.");
        }

        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        if (prezime == null) {
            throw new NullPointerException("Prezime ne sme biti null.");
        }

        if (prezime.trim().isEmpty()) {
            throw new IllegalArgumentException("Prezime ne sme biti prazno.");
        }

        this.prezime = prezime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null) {
            throw new NullPointerException("Username ne sme biti null.");
        }

        if (username.isEmpty()) {
            throw new IllegalArgumentException("Username ne sme biti prazan.");
        }

        this.username = username;
    }

    public String getPassword() {
        return password;
    }

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
