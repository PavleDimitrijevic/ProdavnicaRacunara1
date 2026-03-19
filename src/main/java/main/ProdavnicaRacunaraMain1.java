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
 *
 * @author PAVLE
 */
public class ProdavnicaRacunaraMain1 {

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
