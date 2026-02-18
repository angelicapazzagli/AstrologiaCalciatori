/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package astrologiacalciatori;

import java.io.IOException;
import java.util.ArrayList;

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
    
    public void readFiles() throws IOException {
        this.calciatori = FileManager.readFileSportivi(fileSportivo);
        this.segniZodiacali = FileManager.readFileZodiaco(fileZodiaco);
    }
    
    public void controllaSegni() {
        for(SegnoZodiacale s : segniZodiacali) {
            for(Calciatore c : calciatori) {
                if(c.getMeseNascita().equals(s.getMeseInizio()) || c.getMeseNascita().equals(s.getMeseFine())) {
                    if(c.getGiornoNascita() >= s.getGiornoInizio()) {
                        boolean check = false;
                    }
                }
            }
        }
    }
}
