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
    
    public String getDataNascita() {
        return dataNascita;
    }
}
