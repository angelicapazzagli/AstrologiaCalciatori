/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package astrologiacalciatori;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Classe che identifica il gestore dei file.
 * @author pazzagli.angelica
 */
public class Gestore {
    private String fileSportivo, fileZodiaco;
    private ArrayList<Calciatore> calciatori;
    private ArrayList<SegnoZodiacale> segniZodiacali;
    private ArrayList<RigaIstogramma> risultati;
    
    
    /**
     * Metodo che costruisce il gestore dei file.
     * 
     * @param fileSportivo il file che contiene i sportivi ed i loro dati
     * @param fileZodiaco il file che contiene i segni zodiacali ed i loro dettagli
     */
    public Gestore(String fileSportivo, String fileZodiaco) {
        this.fileSportivo = fileSportivo;
        this.fileZodiaco = fileZodiaco;
        this.calciatori = new ArrayList();
        this.segniZodiacali = new ArrayList();
        this.risultati = new ArrayList();
    }
    
    /**
     * Metodo che legge i due file che devono essere gestiti.
     * 
     * @throws IOException se si verifica un errore durante la lettura.
     */
    public void readFiles() throws IOException {
        this.calciatori = FileManager.readFileSportivi(fileSportivo);
        this.segniZodiacali = FileManager.readFileZodiaco(fileZodiaco);
    }
    
    /**
     * Metodo per controllare di quale segno fa parte ogni calciatore così da poterci aggiungere i suoi goal nei risultati che andranno a costituire l'istogramma.
     */
    public void controllaSegni() {
        for(SegnoZodiacale s : segniZodiacali) {
            for(Calciatore c : calciatori) {
                boolean check = false;
                if(c.getMeseNascita().equals(s.getMeseInizio())) {
                    if(c.getGiornoNascita() >= s.getGiornoInizio()) {
                        check = true;
                    }
                }
                else if(c.getMeseNascita().equals(s.getMeseFine())) {
                    if(c.getGiornoNascita() <= s.getGiornoFine()) {
                        check = true;
                    }
                }
                if(check) {
                    boolean presenzaSegno = false;
                    for(RigaIstogramma riga : risultati) {
                        if(riga.getSegno().equals(s.getSegno())) {
                            riga.addGoal(c.getGoal());
                            presenzaSegno = true;
                        }
                    }
                    if(!presenzaSegno) {
                        RigaIstogramma riga = new RigaIstogramma(s.getSegno());
                        riga.addGoal(c.getGoal());
                        risultati.add(riga);
                    }
                }
            }
        }
    }
    
    /**
     * Metodo che individua il totale di goal più alto.
     * 
     * @return il totale di goal più alto
     */
    public int maxGoal() {
       int maxGoal = 0;
        for(RigaIstogramma r : risultati) {
            if(r.getGoal() > maxGoal) {
                maxGoal = r.getGoal();
            }
        }
        return maxGoal;
    }
    
    /**
     * @deprecated perchè con il JFrame istogramma non deve più essere utilizzato
     * Metodo per stampare ed ordinare in modo decrescente il risultato.
     */
    public void stampaRisultati() {
        risultati.sort(Comparator.comparing(RigaIstogramma::getGoal).reversed());
        for(RigaIstogramma riga : risultati) {
            System.out.println(riga.stampaRiga(maxGoal()));
        }
    }
    
    /**
     * Metodo che restituisce la lista dei risultati, ovvero le righe dell'istogramma.
     * 
     * @return i risultati che rappresentano l'istogramma
     */
    public ArrayList<RigaIstogramma> getRisultati() {
        risultati.sort(Comparator.comparing(RigaIstogramma::getGoal).reversed());
        return risultati;
    }
}
