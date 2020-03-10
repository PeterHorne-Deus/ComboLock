/*
 * Peter Horne-Deus
 * This program simulates a lock
 * ComboLock.java
 * March 9, 2020
 */

package combolock;
import javax.swing.*;
/**
 *
 * @author Peter
 */
public class ComboLock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Combo c;
        //Varaibles
        int option = Integer.parseInt(JOptionPane.showInputDialog("1. Make a combo\n2. Guess random comb\n"));
        int num1,num2,num3;
        int numGuess = 0;
        Boolean guess = false;
        
        //If The user wants to make a combo
        if(option == 1){
            c = new Combo();
            option = JOptionPane.showConfirmDialog(null,"Would You Like To Unlock The Lock?");
            //If The user wants to unlock the lock
            if(option == 0){
                do{
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
                num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third number"));
                numGuess++;
                
                if(num1 == c.getNum1() && num2 == c.getNum2() && num3 == c.getNum3() ){
                    System.out.println("Woo You Got it");
                    guess = true;
                }
                else{
                    System.out.println("Try Again");
                    
                }
                if(numGuess == 3){
                    guess = true;
                    System.out.println("Better Luck Next Time");
                }
            }while(guess == false);
            }
            else{
                System.out.println("Goodbye");
            }
        }
        //If The user wants to just guess a random combo
        else{
            c = new Combo(option);
            do{
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number (1-3)"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number (1-3)"));
                num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third number (1-3)"));
                numGuess++;
                
                if(num1 == c.getNum1() && num2 == c.getNum2() && num3 == c.getNum3() ){
                    System.out.println("Woo You Got it");
                    guess = true;
                }
                else{
                    System.out.println("Try Again");
                    
                }
                if(numGuess == 3){
                    guess = true;
                    num1 = c.getNum1();
                    num2 = c.getNum2();
                    num3 = c.getNum3();
                    
                    System.out.println("Better Luck Next the combo was: \n" +
                            num1 + "," + num2 + "," + num3);
                }
            }while(guess == false);
            
        }
        
        
    }    
}
