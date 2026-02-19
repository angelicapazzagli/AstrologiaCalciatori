/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package astrologiacalciatori;

/**
 * Classe che identifica un calciatore ed i suoi dettagli.
 * @author pazzagli.angelica
 */
public class Calciatore {
    private String nome, nazionalità, dataNascita;
    private int goal;
    
    /**
     * Costruisce un calciatore con tutti i suoi attributi.
     * 
     * @param nome è il nome del calciatore
     * @param goal è il numero di goal che ha fatto il calciatore
     * @param nazionalità è la nazionalità del calciatore
     * @param nascita è la data di nascita del calciatore
     */
    public Calciatore(String nome, int goal, String nazionalità, String nascita) {
        this.nome = nome;
        this.goal = goal;
        this.nazionalità = nazionalità;
        this.dataNascita = nascita;
    }
    
    public int getGoal() {
        return goal;
    }
    
    public int getGiornoNascita() {
        return Integer.parseInt(dataNascita.substring(0, 2));
    }
    
    public String getMeseNascita() {
        return dataNascita.substring(2, 4);
    }
}
