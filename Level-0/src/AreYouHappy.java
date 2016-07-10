import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {

		String happy = JOptionPane.showInputDialog("Are you happy?");
		if (happy.equalsIgnoreCase("yes"))
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		else if (happy.equalsIgnoreCase("no")) {

			String want = JOptionPane.showInputDialog("Do you want to be happy?");
			if (want.equalsIgnoreCase("yes")) {
				String str = JOptionPane.showInputDialog("Do you actually care?");
				if (str.equalsIgnoreCase("yes"))
					JOptionPane.showMessageDialog(null, "Change something.");
				else if (str.equalsIgnoreCase("no"))
					JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
				else
					JOptionPane.showMessageDialog(null, "You can't type.");
			} 
			else if (want.equalsIgnoreCase("no"))
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");

			else
				JOptionPane.showMessageDialog(null, "You can't type.");

		} 
		else
			JOptionPane.showMessageDialog(null, "You can't type.");
	}
}
