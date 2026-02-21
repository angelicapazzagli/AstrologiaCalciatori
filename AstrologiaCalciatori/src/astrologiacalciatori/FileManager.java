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
 * Classe che identifica un file da leggere o scrivere, con i suoi possibili metodi.
 * @author pazzagli.angelica
 */
public class FileManager {
    /**
     * Metodo per leggere il file dei sportivi e trasferirlo in una struttura dati.
     * 
     * @param file è il file che contiene i nomi dei calciatori che deve essere trasferito in una lista di oggetti
     * @return la lista di oggetti che identifica tutto ciò che contiene il file
     * @throws FileNotFoundException se il file da leggere non viene trovato
     * @throws IOException se si verifica un errore nella fase di lettura
     */
    public static ArrayList<Calciatore> readFileSportivi(String file) throws FileNotFoundException, IOException {
        ArrayList<Calciatore> convocazione = new ArrayList<Calciatore>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] colonne = line.split(",");
                int goal = Integer.parseInt(colonne[1]);
                Calciatore c = new Calciatore(colonne[0], goal, colonne[2].replace("/", ""), colonne[3].replace("/", ""));
                convocazione.add(c);
            }
        }
        return convocazione;
    }
    
    /**
     * Metodo per leggere il file dei segni zodiacali e trasferirlo in una struttura dati.
     * 
     * @param file è il file che contiene i segni zodiacali ed i loro periodi che devono essere trasferito in una lista di oggetti
     * @return la lista di oggetti che identifica tutto ciò che contiene il file
     * @throws FileNotFoundException se il file non viene trovato
     * @throws IOException se si verifica un errore durante la lettura del file
     */
    public static ArrayList<SegnoZodiacale> readFileZodiaco(String file) throws FileNotFoundException, IOException {
        ArrayList<SegnoZodiacale> segni = new ArrayList<SegnoZodiacale>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] colonne = line.split(",");
                SegnoZodiacale s = new SegnoZodiacale(colonne[0], colonne[1].replace("/", ""), colonne[2].replace("/", ""));
                segni.add(s);
            }
        }
        return segni;
    }
}
