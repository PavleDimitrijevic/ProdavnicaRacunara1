/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.pavledimitrijevic.prodavnicaracunara;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PAVLE
 */
public class StavkaRacunaTest {

    private StavkaRacuna stavkaRacuna;
    private Racun racun;
    private Racunar racunar;

    @Test
    public void StavkaRacunaTestPrazan() {
        assertNotNull(stavkaRacuna);
    }

    @Test
    public void StavkaRacunaTest() {
        stavkaRacuna = new StavkaRacuna(racun, 1, 2, 400000.0, racunar);

        assertNotNull(stavkaRacuna);
        assertEquals(racun, stavkaRacuna.getRacun());
        assertEquals(1, stavkaRacuna.getRb());
        assertEquals(2, stavkaRacuna.getKolicina());
        assertEquals(400000.0, stavkaRacuna.getCena());
        assertEquals(racunar, stavkaRacuna.getRacunar());
    }

    @BeforeEach
    public void setUp() {
        stavkaRacuna = new StavkaRacuna();
        racun = new Racun();
        racunar = new Racunar();
    }

    @AfterEach
    public void tearDown() {
        stavkaRacuna = null;
        racun = null;
        racunar = null;
    }

    @Test
    public void testSetRacun() {
        System.out.println("setRacun");
        stavkaRacuna.setRacun(racun);
        assertEquals(racun, stavkaRacuna.getRacun());
    }

    @Test
    void testSetRacunNull() {
        System.out.println("setRacunNull");
        assertThrows(java.lang.NullPointerException.class, () -> stavkaRacuna.setRacun(null));
    }

    @Test
    public void testSetRb() {
        System.out.println("setRb");
        stavkaRacuna.setRb(1);
        assertEquals(1, stavkaRacuna.getRb());
    }

    @Test
    void testSetRbNula() {
        System.out.println("setRbNula");
        assertThrows(java.lang.IllegalArgumentException.class, () -> stavkaRacuna.setRb(0));
    }

    @Test
    void testSetRbNegative() {
        System.out.println("setRbNegative");
        assertThrows(java.lang.IllegalArgumentException.class, () -> stavkaRacuna.setRb(-1));
    }

    @Test
    public void testSetKolicina() {
        System.out.println("setKolicina");
        stavkaRacuna.setKolicina(2);
        assertEquals(2, stavkaRacuna.getKolicina());
    }

    @Test
    void testSetKolicinaNula() {
        System.out.println("setKolicinaNula");
        assertThrows(java.lang.IllegalArgumentException.class, () -> stavkaRacuna.setKolicina(0));
    }

    @Test
    void testSetKolicinaNegative() {
        System.out.println("setKolicinaNegative");
        assertThrows(java.lang.IllegalArgumentException.class, () -> stavkaRacuna.setKolicina(-1));
    }

    @Test
    public void testSetCena() {
        System.out.println("setCena");
        stavkaRacuna.setCena(400000.0);
        assertEquals(400000.0, stavkaRacuna.getCena());
    }

    @Test
    void testSetCenaNula() {
        System.out.println("setCenaNula");
        assertThrows(java.lang.IllegalArgumentException.class, () -> stavkaRacuna.setCena(0.0));
    }

    @Test
    void testSetCenaNegative() {
        System.out.println("setCenaNegative");
        assertThrows(java.lang.IllegalArgumentException.class, () -> stavkaRacuna.setCena(-400000.0));
    }

    @Test
    public void testSetRacunar() {
        System.out.println("setRacunar");
        stavkaRacuna.setRacunar(racunar);
        assertEquals(racunar, stavkaRacuna.getRacunar());
    }

    @Test
    public void testSetRacunarNull() {
        System.out.println("setRacunarNull");
        assertThrows(java.lang.NullPointerException.class, () -> stavkaRacuna.setRacunar(null));
    }

}
