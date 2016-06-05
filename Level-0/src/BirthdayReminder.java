import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "August 24th";
		String dadsBirthday = "Auguest 9th";
		String myBirthday = "October 3rd";

		// 2. Find out which birthday the user wants and and store their
		// response in a variable
		String birthday = JOptionPane.showInputDialog("Which person's birthday have you forgotten?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
		// print mom's birthday
		// 5. if user asked for "dad"
		// print dad's birthday
		// 6. if user asked for your name
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		if (birthday.equalsIgnoreCase("mom")) {
			speak(momsBirthday);
		} else if (birthday.equalsIgnoreCase("dad")) {
			speak(dadsBirthday);
		} else if (birthday.equalsIgnoreCase("cole")) {
			speak(myBirthday);
		} else {
			speak("Sorry, i don't remember that person's birthday!");
		}
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
