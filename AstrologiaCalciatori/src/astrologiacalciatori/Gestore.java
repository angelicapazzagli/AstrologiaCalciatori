/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package astrologiacalciatori;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author pazzagli.angelica
 */
public class Gestore {
    private String fileSportivo, fileZodiaco;
    private ArrayList<Calciatore> calciatori;
    private ArrayList<SegnoZodiacale> segniZodiacali;
    private ArrayList<RigaIstogramma> risultati;
    
    public Gestore(String fileSportivo, String fileZodiaco) {
        this.fileSportivo = fileSportivo;
        this.fileZodiaco = fileZodiaco;
        this.calciatori = new ArrayList();
        this.segniZodiacali = new ArrayList();
        this.risultati = new ArrayList();
    }
    
    /**
     * Metodo che legge i due file che devono essere gestiti.
     * @throws IOException se si verifica un errore durante la lettura.
     */
    public void readFiles() throws IOException {
        this.calciatori = FileManager.readFileSportivi(fileSportivo);
        this.segniZodiacali = FileManager.readFileZodiaco(fileZodiaco);
    }
    
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
    
    public void stampaRisultati() {
        int maxGoal = 0;
        for(RigaIstogramma r : risultati) {
            if(r.getGoal() > maxGoal) {
                maxGoal = r.getGoal();
            }
        }
        risultati.sort(Comparator.comparing(RigaIstogramma::getGoal).reversed());
        for(RigaIstogramma riga : risultati) {
            System.out.println(riga.stampaRiga(maxGoal));
        }
    }
}
