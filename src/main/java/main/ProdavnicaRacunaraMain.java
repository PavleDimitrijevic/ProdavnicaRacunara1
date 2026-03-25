/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pavledimitrijevic.prodavnicaracunara.Komponenta;
import com.pavledimitrijevic.prodavnicaracunara.Racunar;
import com.pavledimitrijevic.prodavnicaracunara.TipRacunara;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Prikazuje upotrebu klasa Racunar, TipRacunara i Komponenta. U okviru primera
 * kreira se objekat racunar sa njegovim komponentama i vrši se njegova
 * serijalizacija u JSON format korišćenjem Gson biblioteke.
 *
 * JSON se snima u fajl racunar.json.
 *
 * @author PAVLE
 */
public class ProdavnicaRacunaraMain {

    /**
     * Glavna metoda koja se izvršava prilikom pokretanja programa. U okviru
     * metode kreira se tip računara, zatim objekat računar sa komponentama,
     * nakon čega se podaci serijalizuju i čuvaju u JSON fajl korišćenjem Gson
     * biblioteke.
     *
     * @param args argumenti komandne linije (ne koriste se u ovom primeru)
     */
    public static void main(String[] args) {
        TipRacunara tipRacunara = new TipRacunara(1L, "Gaming racunar");

        Racunar racunar = new Racunar();
        racunar.setRacunarID(1L);
        racunar.setNaziv("Gaming Beast X2");
        racunar.setCenaPoKomadu(200000);
        racunar.setOpis("Odlican gejming racunar");
        racunar.setTipRacunara(tipRacunara);

        ArrayList<Komponenta> komponente = new ArrayList<>();
        komponente.add(new Komponenta(racunar, 1, "Ryzen 9 procesor"));
        komponente.add(new Komponenta(racunar, 2, "32GB RAM"));
        komponente.add(new Komponenta(racunar, 3, "RTX 4080 graficka karta"));
        komponente.add(new Komponenta(racunar, 4, "1TB SSD"));

        racunar.setKomponente(komponente);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try ( FileWriter writer = new FileWriter("racunar.json")) {
            gson.toJson(racunar, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Racunar je upisan u fajl: racunar.json.");
    }

}
