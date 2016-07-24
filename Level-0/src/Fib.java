public class Fib {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++)
			System.out.println(FibNum(i));
		
	}
	
	private static int FibNum(int n) {
		
		if (n < 1)
			return 0;
	
		int a = 0;
		int b = 1;
		
		for (int i = 0; i < n; i++) {
			if (i % 2 == 1) {
				a += b;
			} else {
				b += a;
			}
		}
		
		return a > b ? a : b;
		
	}
	
}
