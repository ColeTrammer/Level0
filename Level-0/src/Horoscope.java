import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String sign = JOptionPane.showInputDialog("What is your Zodiac Sign?");
		
		if (sign.equalsIgnoreCase("aries")) {
			JOptionPane.showConfirmDialog(null, "You will die young.");
		} else if (sign.equalsIgnoreCase("taurus")) {
			JOptionPane.showConfirmDialog(null, "You will burn.");
		} else if (sign.equalsIgnoreCase("gemini")) {
			JOptionPane.showConfirmDialog(null, "You will live a terrible life.");
		} else if (sign.equalsIgnoreCase("cancer")) {
			JOptionPane.showConfirmDialog(null, "You will do nothing.");
		} else if (sign.equalsIgnoreCase("leo")) {
			JOptionPane.showConfirmDialog(null, "You will be poor.");
		} else if (sign.equalsIgnoreCase("virgo")) {
			JOptionPane.showConfirmDialog(null, "You will fail.");
		} else if (sign.equalsIgnoreCase("libra")) {
			JOptionPane.showConfirmDialog(null, "You won't die young.");
		} else if (sign.equalsIgnoreCase("scorpio")) {
			JOptionPane.showConfirmDialog(null, "You won't burn.");
		} else if (sign.equalsIgnoreCase("sagittarius")) {
			JOptionPane.showConfirmDialog(null, "You won't live a terrible life.");
		} else if (sign.equalsIgnoreCase("capricorn")) {
			JOptionPane.showConfirmDialog(null, "You won't do nothing.");
		} else if (sign.equalsIgnoreCase("aquarius")) {
			JOptionPane.showConfirmDialog(null, "You won't be poor.");
		} else if (sign.equalsIgnoreCase("pisces")) {
			JOptionPane.showConfirmDialog(null, "You won't fail.");
		} else {
			JOptionPane.showMessageDialog(null, "No one cares about you!!!");
		}
	}
}
