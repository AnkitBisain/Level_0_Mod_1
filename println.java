package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class println {
	public static void main(String[] args){
		
	String input = JOptionPane.showInputDialog("How many cities would you like to claim?");
	int cities = Integer.parseInt(input);
	for(int j = 0; j<cities; j++){
		Random cityrandom = new Random();
		for(int i = 0; i<7; i++){
			int citynumber = 97 + cityrandom.nextInt(26);
			char cityletter = (char)citynumber;
			System.out.print(cityletter);
		}
		System.out.print(" is my city\n");
	}
	}
}
