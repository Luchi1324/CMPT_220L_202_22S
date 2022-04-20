import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        // Creates input
		Scanner input = new Scanner(System.in);

        // Creates array of 100 randomly generated ints
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}

		// Prompt user to enter the index of the array they want to get the value of
        // Prints either corresponding array value or 'Out of Bounds'
		System.out.print("Enter the index of the array: ");
		try {
			System.out.println("The corresponding element value is " + array[input.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException x) {
			System.out.println("Out of bounds.");
		}
        input.close();
        
	}
}
