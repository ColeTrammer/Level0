import javax.swing.JOptionPane;

public class Prime {

	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number."));
			if (isPrime(n))
				JOptionPane.showMessageDialog(null, n + " is prime.");
			else
				JOptionPane.showMessageDialog(null, n + " is not prime.");
		}

	}
	
	private static boolean isPrime(int n) {
		
		if (n == 2 || n == 3)
			return true;
		
		if (n % 2 == 0 || n % 3 == 0 || n <= 1)
			return false;
		
		for (int i = 6; i < (n / 2 - 1); i += 6) {
			if (n % (i - 1) == 0)
				return false;
			if (n % (i + 1) == 0)
				return false;
		}
		
		return true;
	}

}
