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
public class TipRacunaraTest {

    private TipRacunara tipRacunara;

    public void TipRacunaraTestPrazan() {
        assertNotNull(tipRacunara);
    }

    public void TipRacunara() {
        tipRacunara = new TipRacunara(1L, "Gaming racunar");

        assertNotNull(tipRacunara);
        assertEquals(1L, tipRacunara.getTipRacunaraID());
        assertEquals("Gaming racunar", tipRacunara.getNaziv());
    }

    @BeforeEach
    public void setUp() {
        tipRacunara = new TipRacunara();
    }

    @AfterEach
    public void tearDown() {
        tipRacunara = null;
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        tipRacunara.setNaziv("Gaming racunar");
        assertTrue(tipRacunara.toString().contains("Gaming racunar"));
    }

    @Test
    public void testSetTipRacunaraID() {
        System.out.println("setTipRacunaraID");
        tipRacunara.setTipRacunaraID(1L);
        assertEquals(1L, tipRacunara.getTipRacunaraID());
    }

    @Test
    public void testSetTipRacunaraIDNull() {
        System.out.println("setTipRacunaraIDNull");
        assertThrows(java.lang.NullPointerException.class, () -> tipRacunara.setTipRacunaraID(null));
    }

    @Test
    public void testSetTipRacunaraIDNegative() {
        System.out.println("setTipRacunaraIDNegative");
        assertThrows(java.lang.IllegalArgumentException.class, () -> tipRacunara.setTipRacunaraID(-1L));
    }

    @Test
    public void testSetTipRacunaraIDNula() {
        System.out.println("setTipRacunaraIDNula");
        assertThrows(java.lang.IllegalArgumentException.class, () -> tipRacunara.setTipRacunaraID(0L));

    }

    @Test
    public void testSetNaziv() {
        System.out.println("setNaziv");
        tipRacunara.setNaziv("Gaming racunar");
        assertEquals("Gaming racunar", tipRacunara.getNaziv());

    }

    @Test
    void testSetNazivNull() {
        System.out.println("setNazivNull");
        assertThrows(java.lang.NullPointerException.class, () -> tipRacunara.setNaziv(null));
    }

    @Test
    void testSetNazivEmpty() {
        System.out.println("setNazivEmpty");
        assertThrows(java.lang.IllegalArgumentException.class, () -> tipRacunara.setNaziv(""));
    }

}
