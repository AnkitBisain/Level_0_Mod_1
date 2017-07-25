package variables_and_conditionals;

/** 
I have a pocket full of change. I hate doing math. Make me a program that will calculate 
how much money I have without me having to use my brain.
*/

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

    public static void main(String[] args) {

        // Ask the user how many nickels they have
    	String pe = JOptionPane.showInputDialog("How many pennies do you have?");
    	int p = Integer.parseInt(pe);
    	String ni = JOptionPane.showInputDialog("How many nickels do you have?");
    	int n = Integer.parseInt(ni);
    	String di = JOptionPane.showInputDialog("How many dimes do you have?");
    	int d = Integer.parseInt(di);
    	String qu = JOptionPane.showInputDialog("How many quarters do you have?");
    	int q = Integer.parseInt(qu);
        int c = p+5*n+10*d+25*q;
        JOptionPane.showMessageDialog(null, "You have " + c + " cents!");
        // Tell the user how much money they have

    }
}