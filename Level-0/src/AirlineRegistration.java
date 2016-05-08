import javax.swing.JOptionPane;

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration
 * information at the check-in counter and print their boarding pass. You need
 * to collect the following information: First name Last name Destination
 * airport Birthday (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY,
 * M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {
		String fName = JOptionPane.showInputDialog("What is your first name?");
		String lName = JOptionPane.showInputDialog("What is your last name?");
		String dest = JOptionPane.showInputDialog("What airport are you going to?");
		String bDay = JOptionPane.showInputDialog("Please give your birthdate in the folowing format:\nmm/dd/yyyy");
		String gender = JOptionPane.showInputDialog("Please give your gender as M or F.");
		JOptionPane.showMessageDialog(null,
				lName + " " + fName + " " + bDay + " " + gender + "\nTraveling to " + dest + ".");
	}
}
