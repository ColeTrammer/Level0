import javax.swing.JOptionPane;

public class Zork {

	public static void main(String[] args) {

		boolean win = false;
		
		String answer = JOptionPane.showInputDialog("You are in a very dark room with a house.");
		if (answer.equalsIgnoreCase("down"))
			answer = JOptionPane.showInputDialog("You find a wall. Go elsewere");
		if (answer.equalsIgnoreCase("up")) {
			answer = JOptionPane
					.showInputDialog("You are now in a dimly lit clearing outside the house.\nA forest surrounds you.");
			if (answer.equalsIgnoreCase("down"))
				answer = JOptionPane.showInputDialog("The house's door has mysteriously closed!");
			if (answer.equalsIgnoreCase("up")) {
				answer = JOptionPane.showInputDialog(
						"You are in a dimly lit forest and are surrounded by trees.\nYou have also turned 90 degrees.");
				if (answer.equalsIgnoreCase("up"))
					answer = JOptionPane.showInputDialog("You find a scary monster in your path! Turn back");
				if (!answer.equalsIgnoreCase("down"))
					JOptionPane.showMessageDialog(null, "The monster killed you!!!!");
				else {
					answer = JOptionPane.showInputDialog(
							"You find a clearing with a magically enchanted stick.\nYou are now surrouded by trees.");
					if (answer.equalsIgnoreCase("up"))
						answer = JOptionPane.showInputDialog("You find an unpassable wall.");
					if (answer.equalsIgnoreCase("down")) {
						answer = JOptionPane.showInputDialog("You find a scary monster in your path! Turn back");
						if (answer.equalsIgnoreCase("down")) {
							answer = JOptionPane.showInputDialog("You slay the monster with your magical stick!\nYou are free to continue!");
							if (answer.equalsIgnoreCase("up")) {
								answer = JOptionPane.showInputDialog("After turning back, a horde of monsters ambush you.");
								JOptionPane.showMessageDialog(null, "After trying to fight against the monster, they kill you!!!");
							}
							else if (answer.equalsIgnoreCase("down")) {
								JOptionPane.showMessageDialog(null, "You have made it out of the forest and won!");
								win = true;
							}
						}
					}
				}
			}
		}
		if (!win)
			JOptionPane.showMessageDialog(null, "You fall on the ground and die!.");
	}

}
