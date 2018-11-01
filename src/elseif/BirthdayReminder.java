
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 15";
		String dadsBirthday = "July 21";
		String myBirthday = "July 30";
        String noBirthday = "Sorry i dont remember that birthday";
		// 2. Find out which birthday the user wants and and store their response in a variable
	String wants = JOptionPane.showInputDialog(null,"What birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(wants);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (wants.equalsIgnoreCase("mom")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (wants.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);		}
		// 6. if user asked for your name
			// print myBirthday
		else if(wants.equalsIgnoreCase("daniel")) {
			System.out.println(myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println(noBirthday);
		}
} 
}
