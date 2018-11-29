package extra;

import javax.swing.JOptionPane;

public class AreYouHappy {
	
public static void main(String[] args) {

		String wants = JOptionPane.showInputDialog(null, "Are you happy?");

		if (wants.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing:)");
		}
		else if (wants.equalsIgnoreCase("no")) {
		String Wantz = JOptionPane.showInputDialog(null, "Do you want to be happy?");
		
	    if(Wantz.equalsIgnoreCase("yes")) {
	    	JOptionPane.showMessageDialog(null,"Change something");
	    }
	  
	    	else if(Wantz.equalsIgnoreCase("no")) {
	    JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");	
	        
	     }
	   }
	 }
   }
