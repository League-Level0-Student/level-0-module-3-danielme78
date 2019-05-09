import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {


public static void main(String[]args){

String answer = JOptionPane.showInputDialog("What's your favorite color?");	

JOptionPane.showMessageDialog(null,"Your favorite color is " + answer );

Robot  bot = new Robot();
bot.penDown();
bot.setSpeed(1000);
bot.miniaturize();
bot.show();
bot.setWindowSize(10000, 10000);
for (int triangl3 = 0; triangl3 < 3; triangl3++) {
	bot.turn(120);
	bot.move(150);
	
	
}












}
}
