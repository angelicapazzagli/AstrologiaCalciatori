/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package astrologiacalciatori;

/**
 *
 * @author pazzagli.angelica
 */
public class SegnoZodiacale {
    private String segno, dataInizio, dataFine;
    
    public SegnoZodiacale(String segno, String inizio, String fine) {
        this.segno = segno;
        this.dataInizio = inizio;
        this.dataFine = fine;
    }
    
    public String getSegno() {
        return segno;
    }
    
    public int getGiornoInizio() {
        return Integer.parseInt(dataInizio.substring(0, 2));
    }
    
    public String getMeseInizio() {
        return dataInizio.substring(2);
    }
    
    public int getGiornoFine() {
        return Integer.parseInt(dataFine.substring(0, 2));
    }
    
    public String getMeseFine() {
        return dataFine.substring(2);
    }
}
