import javax.swing.JOptionPane;

public class SimpleNumberSorter {

	public static void main(String args[]) {
		int[] array = new int[3];
		for (int i = 0; i < 3; i++) {
			String inputString = JOptionPane.showInputDialog("Enter a number to be sorted.");
			 array[i] = Integer.parseInt(inputString);
		}
		
		for (int passThrough = 0; passThrough < array.length - 1; passThrough++) {
			
			for (int index = 0; index < array.length - 1; index++) {
				if (array[index] > array[index + 1]) {
					int tmp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = tmp;
				}
					
			}
		}
		for (int ii = 0; ii < array.length; ii++) {
			System.out.println(array[ii]);
		}
		
		System.out.print('\n');
		
		for (int passThrough = 0; passThrough < array.length - 1; passThrough++) {
			
			for (int index = 0; index < array.length - 1; index++) {
				if (array[index] < array[index + 1]) {
					int tmp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = tmp;
				}
					
			}
		}
		for (int ii = 0; ii < array.length; ii++) {
			System.out.println(array[ii]);
		}
		
	}
	
}
