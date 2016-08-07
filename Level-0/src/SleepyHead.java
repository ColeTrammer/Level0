import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
		
		boolean isWeekday, isVacation;
		
		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
		
		if (JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
			isWeekday = false;
		else
			isWeekday = true;
	
		if (JOptionPane.showConfirmDialog(null, "Are you on a vacation?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
			isVacation = false;
		else
			isVacation = true;
		
		if (isWeekday && !isVacation)
			JOptionPane.showMessageDialog(null, "Get up lazybones!");
		else
			JOptionPane.showMessageDialog(null, "Sleep in.");
		

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
}
