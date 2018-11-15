package extra;

import javax.swing.JOptionPane;

public class AreYouHappy {
	
public static void main(String[] args) {

		String wants = JOptionPane.showInputDialog(null, "Are you Happy?");

		if (wants.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing:)");
		}
		else if (wants.equalsIgnoreCase("no")) {
		JOptionPane.showMessageDialog(null, "Do you want to be happy?");
		}
	}
}