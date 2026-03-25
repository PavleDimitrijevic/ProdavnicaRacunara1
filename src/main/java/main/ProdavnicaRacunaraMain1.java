/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import com.google.gson.Gson;
import com.pavledimitrijevic.prodavnicaracunara.Komponenta;
import com.pavledimitrijevic.prodavnicaracunara.Racunar;
import java.io.FileReader;

/**
 * Demonstrira postupak deserijalizacije objekta Racunar iz JSON fajla
 * korišćenjem Gson biblioteke.
 *
 * Klasa učitava podatke iz fajla racunar.json, rekonstruiše objekat računara
 * zajedno sa njegovim komponentama i prikazuje ih na standardnom izlazu.
 *
 * @author PAVLE
 */
public class ProdavnicaRacunaraMain1 {

    /**
     * Glavna metoda koja se izvršava prilikom pokretanja programa. Učitava se
     * JSON fajl racunar.json, vrši se deserijalizacija u objekat tipa Racunar,
     * nakon čega se podaci o računaru i njegovim komponentama ispisuju na
     * konzoli.
     *
     * @param args argumenti komandne linije (ne koriste se u ovom primeru)
     */
    public static void main(String[] args) {
        Gson gson = new Gson();

        try ( FileReader reader = new FileReader("racunar.json")) {
            Racunar racunar = gson.fromJson(reader, Racunar.class);

            System.out.println("Racunar:");
            System.out.println(racunar);

            System.out.println("Komponente:");
            for (Komponenta k : racunar.getKomponente()) {
                System.out.println(k);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
