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
 *
 * @author PAVLE
 */
public class ProdavnicaRacunaraMain {

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
