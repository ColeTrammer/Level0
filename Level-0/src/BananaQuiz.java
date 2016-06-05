import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		speak("Do you like bananas?");
		String like = JOptionPane.showInputDialog(null);
		if (like.equalsIgnoreCase("no")) {
			speak("You are crazy!");
		} else if (like.equalsIgnoreCase("yes")) {
			speak("What is your favorite hobby?");
			String hobby = JOptionPane.showInputDialog(null);
			speak(hobby + " is much better with bananas!");
		} else {
			speak("You are bananas!");
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
