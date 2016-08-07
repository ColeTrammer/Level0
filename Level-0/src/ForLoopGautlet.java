
public class ForLoopGautlet {

	public static void main(String[] args) {
	
		for (int i =  0; i <= 100; i++) {
			System.out.println(i);
		}
	
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
		}
	
		for (int i = 1; i <= 99; i += 2) {
			System.out.println(i);
		}
	
		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 0)
				System.out.println(i + " even");
			if (i % 2 == 1)
				System.out.println(i + " odd");
		}
		
		for (int i = 0; i <= 777; i += 7) {
			System.out.println(i);
		}
		
		for (int i = 15, ii = 1; i >= 0; i--, ii++) {
			System.out.println("In " + (2016 - i) + ", I was " + ii + " years old.");
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " " + j);
			}
		}
		
		for (int i = 1; i <= 9; i += 3) {
			for (int j = i; j < i + 3; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
		for (int i = 1; i <= 100; i += 10) {
			for (int j = i; j < i + 10; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
		for (int rows = 0; rows < 6; rows++) {
			for (int i = 0; i <= rows; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (int i = 0; i <= 100; i++) {
			System.out.println(100 - i);
		}
		
	}
	
}
