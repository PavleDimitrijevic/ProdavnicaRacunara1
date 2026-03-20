/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.pavledimitrijevic.prodavnicaracunara;

import java.util.ArrayList;
import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PAVLE
 */
public class RacunTest {

    private Administrator administrator;
    private Racun racun;

    @Test
    public void RacunTestPrazan() {
        assertNotNull(racun);
    }

    @Test
    public void RacunTest() {
        Date datum = new Date();
        ArrayList<StavkaRacuna> stavkeRacuna = new ArrayList<>();
        stavkeRacuna.add(new StavkaRacuna());

        racun = new Racun(1L, datum, 200000.0, administrator, stavkeRacuna);

        assertNotNull(racun);
        assertEquals(1L, racun.getRacunID());
        assertEquals(datum, racun.getDatumVreme());
        assertEquals(200000.0, racun.getCena());
        assertEquals(administrator, racun.getAdministrator());
        assertEquals(stavkeRacuna, racun.getStavkeRacuna());
    }

    @BeforeEach
    public void setUp() {
        racun = new Racun();
        administrator = new Administrator(1L, "Pavle", "Dimitrijevic", "pavle123", "pavle123");
    }

    @AfterEach
    public void tearDown() {
        racun = null;
        administrator = null;
    }

    @Test
    public void testSetRacunID() {
        System.out.println("setRacunID");
        racun.setRacunID(1L);
        assertEquals(1L, racun.getRacunID());
    }

    @Test
    void testSetRacunIDNull() {
        System.out.println("setRacunIDNull");
        assertThrows(java.lang.NullPointerException.class, () -> racun.setRacunID(null));
    }

    @Test
    void testSetRacunIDNegative() {
        System.out.println("setRacunIDNegative");
        assertThrows(java.lang.IllegalArgumentException.class, () -> racun.setRacunID(-1L));
    }

    @Test
    void testSetRacunIDNula() {
        System.out.println("setRacunIDNula");
        assertThrows(java.lang.IllegalArgumentException.class, () -> racun.setRacunID(0L));
    }

    @Test
    public void testSetDatumVreme() {
        System.out.println("setDatumVreme");
        Date datum = new Date();
        racun.setDatumVreme(datum);
        assertEquals(datum, racun.getDatumVreme());
    }

    @Test
    void testSetDatumVremeNull() {
        System.out.println("setDatumVremeNull");
        assertThrows(java.lang.NullPointerException.class, () -> racun.setDatumVreme(null));
    }

    @Test
    void testSetDatumVremeFuture() {
        System.out.println("setDatumVremeFuture");
        Date future = new Date(System.currentTimeMillis() + 100000);
        assertThrows(java.lang.IllegalArgumentException.class, () -> racun.setDatumVreme(future));
    }

    @Test
    public void testSetCena() {
        System.out.println("setCena");
        racun.setCena(200000.0);
        assertEquals(200000.0, racun.getCena());
    }

    @Test
    void testSetCenaNegative() {
        System.out.println("setCenaNegative");
        assertThrows(java.lang.IllegalArgumentException.class, () -> racun.setCena(-200000.0));
    }

    @Test
    void testSetCenaNula() {
        System.out.println("setCenaNula");
        assertThrows(java.lang.IllegalArgumentException.class, () -> racun.setCena(0.0));
    }

    @Test
    public void testSetAdministrator() {
        System.out.println("setAdministrator");
        racun.setAdministrator(administrator);
        assertEquals(administrator, racun.getAdministrator());
    }

    @Test
    void testSetAdministratorNull() {
        System.out.println("setAdministratorNull");
        assertThrows(java.lang.NullPointerException.class, () -> racun.setAdministrator(null));
    }

    @Test
    public void testSetStavkeRacuna() {
        System.out.println("setStavkeRacuna");
        ArrayList<StavkaRacuna> stavkeRacuna = new ArrayList<>();
        stavkeRacuna.add(new StavkaRacuna());
        racun.setStavkeRacuna(stavkeRacuna);
        assertEquals(stavkeRacuna, racun.getStavkeRacuna());
    }

    @Test
    void testSetStavkeRacunaNull() {
        System.out.println("setStavkeRacunaNull");
        assertThrows(java.lang.NullPointerException.class, () -> racun.setStavkeRacuna(null));
    }

    @Test
    void testSetStavkeRacunaEmpty() {
        System.out.println("setStavkeRacunaEmpty");
        assertThrows(java.lang.IllegalArgumentException.class, () -> racun.setStavkeRacuna(new ArrayList<>()));
    }

}
