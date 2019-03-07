
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot r = new Robot();
	public static void main(String[] args) {
	
r.hide();
r.penDown();
r.setSpeed(1000);
r.miniaturize();
r.setWindowSize(0, 0); 
 
 
String answer =  JOptionPane.showInputDialog("What shape do you want me to do?"
		+ "  Square Triangle Circle");
		

		if (answer.equalsIgnoreCase("square")) {
	r.show();
	r.setWindowSize(10000, 10000); 
for (int squar3 = 0; squar3 < 4; squar3++) {
		r.move(150);
		r.turn(90);
}
	}
	if (answer.equalsIgnoreCase("triangle")) {
	r.show();
	r.setWindowSize(10000, 10000);
for (int triangl3 = 0; triangl3 < 3; triangl3++) {
		r.turn(120);
		r.move(150);
}
	}
	if (answer.equalsIgnoreCase("circle")) {
	r.show();
for (int circl3 = 0; circl3 < 70; circl3++) {
	   r.turn(5);
	   r.move(5);
}
	}
	

	



}
}	