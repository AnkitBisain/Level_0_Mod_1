package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

    // 1. Make a main method that includes all the steps below….
	public static void main(String[] args){
    // 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random r = new Random();
    // 3. Print out this variable
		for(int i = 0; i<10; i++){
		int mg8 = r.nextInt(4);
		i = 0;
    //4. Get the user to enter a question for the 8 ball
		String s = JOptionPane.showInputDialog("Enter a question.");
    // 5. If the random number is 0
		if(s.equals(null)){
			i = 10;
		}else{
		if(mg8 == 0){
			JOptionPane.showMessageDialog(null, "Yes");
		}
    // -- tell the user "Yes"
		if(mg8 == 1){
			JOptionPane.showMessageDialog(null, "No");
		}
    // 6. If the random number is 1

    // -- tell the user "No"

    // 7. If the random number is 2
		if(mg8 == 2){
			JOptionPane.showMessageDialog(null, "Maybe you should ask google?");
		}
    // -- tell the user "Maybe you should ask Google?"
		if(mg8 == 3){
			JOptionPane.showMessageDialog(null,"You are fake news.");
		}
    // 8. If the random number is 3
		}
    // -- write your own answer

	}
}
}
