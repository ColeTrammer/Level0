import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		int heightInches = Integer.parseInt(JOptionPane.showInputDialog("How tall are you in inches?"));
		double feet = heightInches / 12.0;

		if (feet > 4) {
			JOptionPane.showMessageDialog(null, "You can ride the ride!");
		} else {
			JOptionPane.showMessageDialog(null, "You cannot ride the ride!");
		}
	}
}
