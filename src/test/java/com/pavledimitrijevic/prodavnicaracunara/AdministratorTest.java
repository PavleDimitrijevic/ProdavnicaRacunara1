/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.pavledimitrijevic.prodavnicaracunara;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author PAVLE
 */
public class AdministratorTest {

    private Administrator administrator;

    public void AdministratorTestPrazan() {
        assertNotNull(administrator);
    }

    public void AdministratorTest() {
        administrator = new Administrator(1L, "Pavle", "Dimitrijevic", "pavle123", "pavle123");

        assertNotNull(administrator);
        assertEquals(1L, administrator.getAdministratorID());
        assertEquals("Pavle", administrator.getIme());
        assertEquals("Dimitrijevic", administrator.getPrezime());
        assertEquals("pavle123", administrator.getUsername());
        assertEquals("pavle123", administrator.getPassword());
    }

    @BeforeEach
    public void setUp() {
        administrator = new Administrator();
    }

    @AfterEach
    public void tearDown() {
        administrator = null;
    }

    @ParameterizedTest
    @CsvSource({
        "1, 1, true",
        "1, 2, false"
    })
    public void testEquals(Long id1, Long id2, boolean expected) {
        System.out.println("equals");

        Administrator administrator1 = new Administrator();
        administrator1.setAdministratorID(id1);

        Administrator administrator2 = new Administrator();
        administrator2.setAdministratorID(id2);

        assertEquals(expected, administrator1.equals(administrator2));
    }

    @Test
    public void testToString() {
        System.out.println("toString");

        administrator.setAdministratorID(1L);
        administrator.setIme("Pavle");
        administrator.setPrezime("Dimitrijevic");
        administrator.setUsername("pavle123");
        administrator.setPassword("pavle123");

        assertTrue(administrator.toString().contains("Pavle"));
        assertTrue(administrator.toString().contains("Dimitrijevic"));
    }

    @Test
    public void testSetAdministratorID() {
        System.out.println("setAdministratorID");
        administrator.setAdministratorID(1L);
        assertEquals(1L, administrator.getAdministratorID());
    }

    @Test
    void testSetAdministratorIDNull() {
        assertThrows(java.lang.NullPointerException.class, () -> administrator.setAdministratorID(null));
    }

    @Test
    void testSetAdministratorIDNegative() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> administrator.setAdministratorID(-1L));
    }

    @Test
    void testSetAdministratorIDNula() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> administrator.setAdministratorID(0L));
    }

    @Test
    public void testSetIme() {
        System.out.println("setIme");
        administrator.setIme("Pavle");
        assertEquals("Pavle", administrator.getIme());
    }

    @Test
    void testSetImeNull() {
        assertThrows(java.lang.NullPointerException.class, () -> administrator.setIme(null));
    }

    @Test
    void testSetImeEmpty() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> administrator.setIme(""));
    }

    @Test
    void testSetImeBlankoZnak() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> administrator.setIme("   "));
    }

    @Test
    void testSetImeRazmak() {
        administrator.setIme("Djordje David");
        assertEquals("Djordje David", administrator.getIme());
    }

    @Test
    public void testSetPrezime() {
        System.out.println("setPrezime");
        administrator.setPrezime("Dimitrijevic");
        assertEquals("Dimitrijevic", administrator.getPrezime());
    }

    @Test
    void testSetPrezimeNull() {
        System.out.println("setPrezimeNull");
        assertThrows(java.lang.NullPointerException.class, () -> administrator.setPrezime(null));
    }

    @Test
    void testSetPrezimeEmpty() {
        System.out.println("setPrezimeEmpty");
        assertThrows(java.lang.IllegalArgumentException.class, () -> administrator.setPrezime(""));
    }

    @Test
    void testSetPrezimeBlankoZnak() {
        System.out.println("setPrezimeBlankoZnak");
        assertThrows(java.lang.IllegalArgumentException.class, () -> administrator.setPrezime("   "));
    }

    @Test
    void testSetPrezimeRazmak() {
        System.out.println("setPrezimeRazmak");
        administrator.setPrezime("Dimitrijevic Aleksic");
        assertEquals("Dimitrijevic Aleksic", administrator.getPrezime());
    }

    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        administrator.setUsername("pavle123");
        assertEquals("pavle123", administrator.getUsername());
    }

    @Test
    void testSetUsernameNull() {
        System.out.println("setUsernameNull");
        assertThrows(java.lang.NullPointerException.class, () -> administrator.setUsername(null));
    }

    @Test
    void testSetUsernameEmpty() {
        System.out.println("setUsernameEmpty");
        assertThrows(java.lang.IllegalArgumentException.class, () -> administrator.setUsername(""));
    }

    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        administrator.setPassword("pavle123");
        assertEquals("pavle123", administrator.getPassword());
    }

    @Test
    public void testSetPasswordNull() {
        System.out.println("setPasswordNull");
        assertThrows(java.lang.NullPointerException.class, () -> administrator.setPassword(null));

    }

    @Test
    void testSetPasswordManje() {
        System.out.println("setPasswordManje");
        assertThrows(java.lang.IllegalArgumentException.class, () -> administrator.setPassword("pavle"));
    }
}
