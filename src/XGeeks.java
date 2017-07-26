package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
		String june = "writing recipes";
        // 2. Ask the user to enter a name. Store their answer in a variable.
		for(int i = 0; i<10; i++){
		String input = JOptionPane.showInputDialog("Whose superpower would you like to check?");
        // 3. Show the superpower in a pop-up, depending on the name entered. 
		i = 0;
		if(input.equalsIgnoreCase("june")){
			JOptionPane.showMessageDialog(null, input + "'s superpower is" + june);
		}else{
			if(input.equals(null)){
				i = 10;
			}else{
			JOptionPane.showMessageDialog(null, input + " has no superpower yet");
		}
		}
    }
}}