/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package astrologiacalciatori;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author pazzagli.angelica
 */
public class FileManager {
    public static ArrayList<Calciatore> readFileSportivi(String file) throws FileNotFoundException, IOException {
        ArrayList<Calciatore> convocazione = new ArrayList<Calciatore>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] colonne = line.split(",");
                int goal = Integer.parseInt(colonne[1]);
                Calciatore c = new Calciatore(colonne[0], goal, colonne[2].replace("/", ""), colonne[3].replace("/", ""));
            }
        }
        return convocazione;
    }
    
    public static ArrayList<SegnoZodiacale> readFileZodiaco(String file) throws FileNotFoundException, IOException {
        ArrayList<SegnoZodiacale> segni = new ArrayList<SegnoZodiacale>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] colonne = line.split(",");
                SegnoZodiacale s = new SegnoZodiacale(colonne[0], colonne[1].replace("/", ""), colonne[2].replace("/", ""));
            }
        }
        return segni;
    }
}
