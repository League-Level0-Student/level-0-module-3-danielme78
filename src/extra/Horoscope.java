package extra;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {

	String aries = "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.";
	String taurus = "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.";
	String gemini = "Cerebral, chatty, loves learning and education, charming, and adventurous.";
	String cancer = "Emotional, group oriented, seeks security, family.";		
	String leo = "Generous,organized, protective, beautiful.";
	String virgo = "Particular, logical, practical, sense of duty, critical.";
	String zodiac = "Balanced, seeks beauty, sense of justice.";
	String scorpio = "Passionate, exacting, loves extremes, combative, reflective.";
	String sagittarius = "Happy, absent minded, creative, adventurous.";
	String capricorn = "Timeless, driven, calculating, ambitious.";
	String aquarius = "Forward thinking, communicative, people oriented, stubborn, generous, and dedicated.";
	String pisces = "Likeable, energetic, passionate, sensitive.";
	
	
String wants = JOptionPane.showInputDialog("What's your star sign?");

if (wants.equalsIgnoreCase("aries")) {
	JOptionPane.showMessageDialog(null,aries);
}
else if (wants.equalsIgnoreCase("taurus")) {
	JOptionPane.showMessageDialog(null,taurus);
}
else if (wants.equalsIgnoreCase("gemini")) {
	JOptionPane.showMessageDialog(null,gemini);
}
else if (wants.equalsIgnoreCase("cancer")) {
	JOptionPane.showMessageDialog(null,cancer);
}
else if (wants.equalsIgnoreCase("leo")) {
	JOptionPane.showMessageDialog(null,leo);
}
else if (wants.equalsIgnoreCase("virgo")) {
	JOptionPane.showMessageDialog(null,virgo);
}
else if (wants.equalsIgnoreCase("zodiac")) {
	JOptionPane.showMessageDialog(null,zodiac);
}
else if (wants.equalsIgnoreCase("scorpio")) {
	JOptionPane.showMessageDialog(null,scorpio);
}
else if (wants.equalsIgnoreCase("sagittarius")) {
	JOptionPane.showMessageDialog(null,sagittarius);
}
else if (wants.equalsIgnoreCase("capricorn")) {
	JOptionPane.showMessageDialog(null,capricorn);
}
else if (wants.equalsIgnoreCase("aquarius")) {
	JOptionPane.showMessageDialog(null,aquarius);
}
else if (wants.equalsIgnoreCase("pisces")) {
	JOptionPane.showMessageDialog(null,pisces);
}
else {
	JOptionPane.showMessageDialog(null, "That's not a star sign!");
}

















}
	
}
