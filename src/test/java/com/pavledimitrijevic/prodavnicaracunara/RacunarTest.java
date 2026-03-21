/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.pavledimitrijevic.prodavnicaracunara;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PAVLE
 */
public class RacunarTest {

    private Racunar racunar;
    private TipRacunara tipRacunara;

    @Test
    public void RacunarTestPrazan() {
        assertNotNull(racunar);
    }

    @Test
    public void RacunarTest() {
        ArrayList<Komponenta> komponente = new ArrayList<>();
        komponente.add(new Komponenta());
        racunar = new Racunar(1L, "Gaming Beast X2", 200000,
                "Odlican gejming racunar", tipRacunara, komponente);

        assertNotNull(racunar);
        assertEquals(1L, racunar.getRacunarID());
        assertEquals("Gaming Beast X2", racunar.getNaziv());
        assertEquals(200000.0, racunar.getCenaPoKomadu());
        assertEquals("Odlican gejming racunar", racunar.getOpis());
        assertEquals(tipRacunara, racunar.getTipRacunara());
        assertEquals(komponente, racunar.getKomponente());
    }

    @BeforeEach
    public void setUp() {
        racunar = new Racunar();
        tipRacunara = new TipRacunara(1L, "Gaming racunar");
    }

    @AfterEach
    public void tearDown() {
        racunar = null;
        tipRacunara = null;
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        racunar.setNaziv("Gaming Beast X2");
        racunar.setCenaPoKomadu(200000.0);
        assertTrue(racunar.toString().contains("Gaming Beast X2"));
        assertTrue(racunar.toString().contains("200000.0"));
    }

    @Test
    public void testSetRacunarID() {
        System.out.println("setRacunarID");
        racunar.setRacunarID(1L);
        assertEquals(1L, racunar.getRacunarID());
    }

    @Test
    void testSetRacunarIDNull() {
        System.out.println("setRacunarIDNull");
        assertThrows(java.lang.NullPointerException.class, () -> racunar.setRacunarID(null));
    }

    @Test
    void testSetRacunarIDNegative() {
        System.out.println("setRacunarIDNegative");
        assertThrows(java.lang.IllegalArgumentException.class, () -> racunar.setRacunarID(-1L));
    }

    @Test
    void testSetRacunarIDNula() {
        System.out.println("setRacunarIDNula");
        assertThrows(java.lang.IllegalArgumentException.class, () -> racunar.setRacunarID(0L));
    }

    @Test
    public void testSetNaziv() {
        System.out.println("setNaziv");
        racunar.setNaziv("Gaming Beast X2");
        assertEquals("Gaming Beast X2", racunar.getNaziv());
    }

    @Test
    void testSetNazivRazmak() {
        System.out.println("setNazivRazmak");
        racunar.setNaziv("Gaming Beast X2");
        assertEquals("Gaming Beast X2", racunar.getNaziv());
    }

    @Test
    void testSetNazivNull() {
        System.out.println("setNazivNull");
        assertThrows(java.lang.NullPointerException.class, () -> racunar.setNaziv(null));
    }

    @Test
    void testSetNazivEmpty() {
        System.out.println("setNazivEmpty");
        assertThrows(java.lang.IllegalArgumentException.class, () -> racunar.setNaziv(""));
    }

    @Test
    void testSetNazivBlankoZnak() {
        System.out.println("setNazivBlankoZnak");
        assertThrows(java.lang.IllegalArgumentException.class, () -> racunar.setNaziv("   "));
    }

    @Test
    public void testSetCenaPoKomadu() {
        System.out.println("setCenaPoKomadu");
        racunar.setCenaPoKomadu(200000.0);
        assertEquals(200000.0, racunar.getCenaPoKomadu());
    }

    @Test
    void testSetCenaPoKomaduNegative() {
        System.out.println("setCenaPoKomaduNegative");
        assertThrows(java.lang.IllegalArgumentException.class, () -> racunar.setCenaPoKomadu(-200000.0));
    }

    @Test
    void testSetCenaPoKomaduNula() {
        System.out.println("setCenaPoKomaduNula");
        assertThrows(java.lang.IllegalArgumentException.class, () -> racunar.setCenaPoKomadu(0.0));
    }

    @Test
    public void testSetOpis() {
        System.out.println("setOpis");
        racunar.setOpis("Odlican");
        assertEquals("Odlican", racunar.getOpis());
    }

    @Test
    void testSetOpisRazmak() {
        System.out.println("setOpisRazmak");
        racunar.setOpis("Odlican racunar");
        assertEquals("Odlican racunar", racunar.getOpis());
    }

    @Test
    void testSetOpisNull() {
        System.out.println("setOpisNull");
        assertThrows(java.lang.NullPointerException.class, () -> racunar.setOpis(null));
    }

    @Test
    void testSetOpisEmpty() {
        System.out.println("setOpisEmpty");
        assertThrows(java.lang.IllegalArgumentException.class, () -> racunar.setOpis(""));
    }

    @Test
    void testSetOpisBlankoZnak() {
        System.out.println("setOpisBlankoZnak");
        assertThrows(java.lang.IllegalArgumentException.class, () -> racunar.setOpis("   "));
    }

    @Test
    public void testSetTipRacunara() {
        System.out.println("setTipRacunara");
        racunar.setTipRacunara(tipRacunara);
        assertEquals(tipRacunara, racunar.getTipRacunara());
    }

    @Test
    void testSetTipRacunaraNull() {
        System.out.println("setTipRacunaraNull");
        assertThrows(java.lang.NullPointerException.class, () -> racunar.setTipRacunara(null));
    }

    @Test
    public void testSetKomponente() {
        System.out.println("setKomponente");
        ArrayList<Komponenta> komponente = new ArrayList<>();
        komponente.add(new Komponenta());
        racunar.setKomponente(komponente);
        assertEquals(komponente, racunar.getKomponente());
    }

    @Test
    void testSetKomponenteNull() {
        System.out.println("setKomponenteNull");
        assertThrows(java.lang.NullPointerException.class, () -> racunar.setKomponente(null));
    }

    @Test
    void testSetKomponenteEmpty() {
        System.out.println("setKomponenteEmpty");
        assertThrows(java.lang.IllegalArgumentException.class, () -> racunar.setKomponente(new ArrayList<>()));
    }

}
