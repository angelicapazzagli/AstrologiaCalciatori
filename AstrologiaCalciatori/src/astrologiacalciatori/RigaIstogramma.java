/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package astrologiacalciatori;

/**
 * Classe che identifica la riga di un istogramma ed i suoi dati.
 * @author pazzagli.angelica
 */
public class RigaIstogramma {
    private String segno;
    private int goalTotali;
    
    /**
     * Costruisce una riga dell'istogramma con i risultati.
     * 
     * @param segno il nome del segno di cui si parla
     */
    public RigaIstogramma(String segno) {
        this.segno = segno;
        goalTotali = 0;
    }
    
    /**
     * Metodo che aggiunge una quantità di goal all'attributo della classe, che viene passato come parametro.
     * 
     * @param goal il numero di goal da aggiungere
     */
    public void addGoal(int goal) {
        goalTotali += goal;
    }
    
    /**
     * Metodo per restituire il numero di goal totali.
     * 
     * @return il numero di goal totali
     */
    public int getGoal() {
        return goalTotali;
    }
    
    /**
     * Metodo per restituire il nome del segno di cui si sta calcolando il risultato.
     * 
     * @return il nome del segno di cui si sta calcolando il risultato
     */
    public String getSegno() {
        return segno;
    }
    
    /**
     * Metodo per restituire i dettagli della riga ed il calcolo degli asterischi che gli spettano.
     * 
     * @param maxGoal il numero massimo di goal che è stato trovato
     * @return il nome del segno con i rispettivi goal ed il numero di asterischi appena calcolato secondo una proporzione
     */
    public String stampaRiga(int maxGoal) {
        int nAsterischi = goalTotali * 50 / maxGoal;
        String asterischi = "";
        for(int i = 0; i < nAsterischi; i++) {
            asterischi += "*";
        }
        return segno + " (" + goalTotali + ") " + asterischi;
    }
}
