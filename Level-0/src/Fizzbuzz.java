import java.util.Random;

public class Fizzbuzz {

	public static void main(String[] args) {
		
		Random ran = new Random();
		for (int i = 1; i < 101; i++) {
			int test = ran.nextInt(100);
			FizzbuzzTest(test);
		}
	}
	
	private static void FizzbuzzTest(int i) {
		if (i % 15 == 0)
			System.out.println("Fizzbuzz " + i);
		else if (i % 3 == 0)
			System.out.println("Fizz " + i);
		else if (i % 5 == 0)
			System.out.println("Buzz " + i);
	}
	
}
