
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import java.nio.channels.ShutdownChannelGroupException;

import org.jointheleague.graphical.robot.Robot;
import org.jointheleague.graphical.robot.RobotImage;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
	rob.show();
	rob.moveTo(78, 500);
	
		// 2. Make the robot draw a star shape. Hint: 144.
	rob.setSpeed(100);
	rob.move(144);
	rob.turn(90);
	rob.penDown();
	rob.move(144);
	rob.turn(-70);
	rob.move(144);
	rob.turn(140);
	rob.move(144);
	rob.turn(-70);
	rob.move(144);
	rob.turn(140);
	rob.move(144);
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walkOfFame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
