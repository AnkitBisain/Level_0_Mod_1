package variables_and_conditionals;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		
		String sc =JOptionPane.showInputDialog("What is your score?");
		int s = Integer.parseInt(sc);
		if(s<=100 & s>=97){
			JOptionPane.showMessageDialog(null, "A+");
		}
		if(s<97 & s>=93){
			JOptionPane.showMessageDialog(null, "A");
		}
		if(s<93 & s>=90){
			JOptionPane.showMessageDialog(null, "A-");
		}
		if(s<90 & s>=87){
			JOptionPane.showMessageDialog(null, "B+");
		}
		if(s<87 & s>=83){
			JOptionPane.showMessageDialog(null, "B");
		}
		if(s<83 & s>=80){
			JOptionPane.showMessageDialog(null, "B-");
		}
		if(s<80 & s>=77){
			JOptionPane.showMessageDialog(null, "C+");
		}
		if(s<77 & s>=73){
			JOptionPane.showMessageDialog(null, "C");
		}
		if(s<73 & s>=70){
			JOptionPane.showMessageDialog(null, "C-");
		}
		if(s<70 & s>=67){
			JOptionPane.showMessageDialog(null, "D+");
		}
		if(s<67 & s>=63){
			JOptionPane.showMessageDialog(null, "D");
		}
		if(s<63 & s>=60){
			JOptionPane.showMessageDialog(null, "D-");
		}
		if(s<60){
			JOptionPane.showMessageDialog(null, "F");
		}
	}
}
//100  - 97: A+
//96.9 - 93: A
//92.9 - 90: A-
//89.9 - 87: B+
//86.9 - 83: B
//82.9 - 80: B-
//79.9 - 77: C+
//76.9 - 73: C
//72.9 - 70: C-
//69.9 - 67: D+
//66.9 - 63: D
//62.9 - 60: D-