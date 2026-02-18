/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package astrologiacalciatori;

/**
 *
 * @author pazzagli.angelica
 */
public class Calciatore {
    private String nome, nazionalità, dataNascita;
    private int goal;
    
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
