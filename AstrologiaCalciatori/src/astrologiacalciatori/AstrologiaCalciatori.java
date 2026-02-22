/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package astrologiacalciatori;

import java.io.IOException;

/**
 * Classe che ha l'obiettivo di verificare se l'astrologia influisce sui goal dei calciatori.
 * @author pazzagli.angelica
 */
public class AstrologiaCalciatori {

    /**
     * Metodo principale per avviare il programma.
     * 
     * @see Gestore
     * @see Istogramma
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Gestore g = new Gestore("sportivi.csv", "zodiaco.csv");
        
        g.readFiles();
        
        g.controllaSegni();
        
        g.stampaRisultati();
        
        Istogramma istogramma = new Istogramma();
        istogramma.aggiornaBarre(g);
        istogramma.setVisible(true);
        
    } 
}
