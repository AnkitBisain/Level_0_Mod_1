package variables_and_conditionals;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args){
	 String a = JOptionPane.showInputDialog("How many hours did you code for this week?");
	 int t = Integer.parseInt(a);
	 if(t>=3){
	 JOptionPane.showMessageDialog(null, "You're a Code Ninja!");
	 }
	 if(t<2){
	 JOptionPane.showMessageDialog(null, "Maybe you should spend less time on youtube...");
	 }
	 if(t>=5){
		playBatmanTheme();
	 }
	}

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

