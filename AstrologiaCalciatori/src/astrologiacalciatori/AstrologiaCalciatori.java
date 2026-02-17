/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package astrologiacalciatori;

import java.io.IOException;

/**
 *
 * @author pazzagli.angelica
 */
public class AstrologiaCalciatori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Gestore g = new Gestore("sportiiv.csv", "zodiaco.csv");
        
        g.readFiles();
    }
    
}
