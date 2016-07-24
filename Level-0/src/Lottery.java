import java.util.Random;

public class Lottery {

	public static void main(String args[]) {
		
		Random ran = new Random();
		
		for (int ii = 0; ii < 8; ii++) {
			for (int i = 0; i < 5; i++) {
				System.out.print((ran.nextInt(69) + 1) + " ");
			}
			System.out.println(ran.nextInt(26) + 1);
		}
	}
	
}
