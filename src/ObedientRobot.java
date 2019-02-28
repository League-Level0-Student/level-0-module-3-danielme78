import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot r = new Robot();
	public static void main(String[] args) {
	

		
		
		
r.show();
r.penDown();
r.setSpeed(1000);
r.miniaturize();

for (int square = 0; square < 6; square++) {
r.move(150);
r.turn(90);

}
}
}	