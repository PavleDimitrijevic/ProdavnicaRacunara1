/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.pavledimitrijevic.prodavnicaracunara;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PAVLE
 */
public class KomponentaTest {

    private Komponenta komponenta;
    private Racunar racunar;

    @Test
    public void KomponentaTestPrazan() {
        assertNotNull(komponenta);
    }

    @Test
    public void KomponentaTest() {
        komponenta = new Komponenta(racunar, 1, "Ryzen 9 procesor");

        assertNotNull(komponenta);
        assertEquals(racunar, komponenta.getRacunar());
        assertEquals(1, komponenta.getRb());
        assertEquals("Ryzen 9 procesor", komponenta.getNaziv());
    }

    @BeforeEach
    public void setUp() {
        racunar = new Racunar();
        komponenta = new Komponenta();
    }

    @AfterEach
    public void tearDown() {
        komponenta = null;
        racunar = null;
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        komponenta.setRb(1);
        komponenta.setNaziv("Ryzen 9 procesor");

        assertTrue(komponenta.toString().contains("1"));
        assertTrue(komponenta.toString().contains("Ryzen 9 procesor"));
    }

    @Test
    public void testSetRacunar() {
        System.out.println("setRacunar");
        komponenta.setRacunar(racunar);
        assertEquals(racunar, komponenta.getRacunar());
    }

    @Test
    void testSetRacunarNull() {
        System.out.println("setRacunarNull");
        assertThrows(java.lang.NullPointerException.class, () -> komponenta.setRacunar(null));
    }

    @Test
    public void testSetRb() {
        System.out.println("setRb");
        komponenta.setRb(1);
        assertEquals(1, komponenta.getRb());
    }

    @Test
    void testSetRbNula() {
        System.out.println("setRbNula");
        assertThrows(java.lang.IllegalArgumentException.class, () -> komponenta.setRb(0));
    }

    @Test
    void testSetRbNegative() {
        System.out.println("setRbNegative");
        assertThrows(java.lang.IllegalArgumentException.class, () -> komponenta.setRb(-1));
    }

    @Test
    public void testSetNaziv() {
        System.out.println("setNaziv");
        komponenta.setNaziv("SSD");
        assertEquals("SSD", komponenta.getNaziv());
    }

    @Test
    void testSetNazivRazmak() {
        System.out.println("setNazivRazmak");
        komponenta.setNaziv("Ryzen 9 procesor");
        assertEquals("Ryzen 9 procesor", komponenta.getNaziv());
    }

    @Test
    void testSetNazivNull() {
        System.out.println("setNazivNull");
        assertThrows(java.lang.NullPointerException.class, () -> komponenta.setNaziv(null));
    }

    @Test
    void testSetNazivEmpty() {
        System.out.println("setNazivEmpty");
        assertThrows(java.lang.IllegalArgumentException.class, () -> komponenta.setNaziv(""));
    }

    @Test
    void testSetNazivBlankoZnak() {
        System.out.println("setNazivBlankoZnak");
        assertThrows(java.lang.IllegalArgumentException.class, () -> komponenta.setNaziv("   "));
    }

}
