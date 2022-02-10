import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Prompts user to enter seconds travelled
            System.out.print("Enter the ball travel time in seconds: ");
            double t = input.nextDouble();

            // Calculates height from time travelled
            double d = (0 * t) + (9.8 * (t*t)) / 2;
            
            // Displays results
            System.out.println("The height of the building is " + d + " meters");
        }
    }
}
