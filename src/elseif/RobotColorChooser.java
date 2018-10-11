//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot Spiderman = new Robot();
		//3. Ask the user what color they would like the robot to draw
		for(int i =0; i < 30; i ++) {
		String color = JOptionPane.showInputDialog("Wat color do u want??");
		
		//5. Use an if/else statement to set the pen color that the user requested
if (color.equals("blue")) {
	Spiderman.setPenColor(0,0,255);
}
if (color.equals("red"))  {
	Spiderman.setPenColor(255,0,0);
}
if (color.equals("green")) {
	Spiderman.setPenColor(0,255,0);
}
//6. If the user doesn’t enter anything, choose a random color
if (color.equals(""))   {
	Random Sorry = new Random();
	Spiderman.setPenColor(Sorry.nextInt(255),Sorry.nextInt(255),Sorry.nextInt(255));
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		Spiderman.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
        Spiderman.penDown();
        Spiderman.move(100);
        Spiderman.turn(90);
        Spiderman.move(100);
        Spiderman.turn(90);
        Spiderman.move(100);
        Spiderman.turn(90);
        Spiderman.move(100);
        Spiderman.turn(90);

	}
}
}
