/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package astrologiacalciatori;

/**
 *
 * @author pazzagli.angelica
 */
public class RigaIstogramma {
    private String segno;
    private int goalTotali;
    
    public RigaIstogramma(String segno) {
        this.segno = segno;
        goalTotali = 0;
    }
    
    public void addGoal(int goal) {
        goalTotali += goal;
    }
    
    public int getGoal() {
        return goalTotali;
    }
}
