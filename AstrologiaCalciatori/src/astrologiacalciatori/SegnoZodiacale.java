/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package astrologiacalciatori;

/**
 * Classe che identifica un segno zodiacale ed i suoi dettagli.
 * @author pazzagli.angelica
 */
public class SegnoZodiacale {
    private String segno, dataInizio, dataFine;
    
    /**
     * Costruisce un segno zodiacale.
     * 
     * @param segno è il nome del segno zodiacale
     * @param inizio è la data di inizio del segno zodiacale
     * @param fine è la data di fine del segno zodiacale
     */
    public SegnoZodiacale(String segno, String inizio, String fine) {
        this.segno = segno;
        this.dataInizio = inizio;
        this.dataFine = fine;
    }
    
    /**
     * Metodo per restituire il nome del segno zodiacale.
     * 
     * @return il nome del segno zodiacale
     */
    public String getSegno() {
        return segno;
    }
    
    /**
     * Metodo per restituire il giorno in cui inizia il segno zodiacale.
     * 
     * @return il giorno in cui inizia il segno zodiacale
     */
    public int getGiornoInizio() {
        return Integer.parseInt(dataInizio.substring(0, 2));
    }
    
    /**
     * Metodo per restituire il mese in cui inizia il segno zodiacale.
     * 
     * @return il mese in cui inizia il segno zodiacale
     */
    public String getMeseInizio() {
        return dataInizio.substring(2);
    }
    
    /**
     * Metodo per restituire il giorno in cui finisce il segno zodiacale.
     * 
     * @return il giorno in cui finisce il segno zodiacale
     */
    public int getGiornoFine() {
        return Integer.parseInt(dataFine.substring(0, 2));
    }
    
    /**
     * Metodo per restituire il mese in cui finisce il segno zodiacale.
     * 
     * @return il mese in cui finisce il segno zodiacale
     */
    public String getMeseFine() {
        return dataFine.substring(2);
    }
}
