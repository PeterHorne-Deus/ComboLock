/*
 * Peter Horne-Deus
 * This program simulates a lock
 * Combo.java
 * March 9, 2020
 */
package combolock;
import javax.swing.*;

/**
 *
 * @author Peter
 */
public class Combo {
    private int first,second,third;
    
    //Setting combinations
    public Combo(){
        first = Integer.parseInt(JOptionPane.showInputDialog("Enter First number"));
        second = Integer.parseInt(JOptionPane.showInputDialog("Enter Second number"));
        third = Integer.parseInt(JOptionPane.showInputDialog("Enter Third number"));
    }
    public Combo(int option){
        first = (int)(Math.random()*3 + 1);
        second = (int)(Math.random()*3 + 1 );
        third = (int)(Math.random()*3 + 1);
    }
    
    //Information Constructors
    public int getNum1(){
        return first;
    }
    public int getNum2(){
        return second;
    }
    public int getNum3(){
        return third;
    }
}
