import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        // Gets input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int posInt = input.nextInt();
        double sqrtInt = Math.sqrt(posInt);
        int sqrtIntRounded = (int)sqrtInt;
        input.close();

        // Computes result
        // Marker to break out of conditional
        outerIf:
        if (sqrtInt % 1 != 0) {
            // Finds simplest root form
            for (int i = sqrtIntRounded; i>1; i--) {
                if (posInt % Math.pow(i, 2) == 0) {
                    // If i divides evenly into posInt, result is i * sqrt(posInt/i^2)
                    System.out.printf("Sqrt(%d) is %d*Sqrt(%.0f)", posInt, i, posInt/Math.pow(i, 2));
                    break outerIf;
                }
            }
            // If the root cannot be simplified, prints int as root
            System.out.printf("Sqrt(%d) is Sqrt(%d)", posInt, posInt);
        } else if (sqrtInt % 1 == 0) {
            // If the root is a perfect square, just prints the root
            System.out.printf("Sqrt(%d) is %.0f", posInt, sqrtInt);
        }
    }
}
