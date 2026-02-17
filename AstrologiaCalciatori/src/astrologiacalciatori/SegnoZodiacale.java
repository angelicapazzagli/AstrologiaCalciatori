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
    
    public String getDataInizio() {
        return dataInizio;
    }
    
    public String getDataFine() {
        return dataFine;
    }
}
