import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Prompts user for inputs for friction force, mass, and acceleration
            System.out.print("Enter the friction force in Newtons: ");
            double F = input.nextDouble();
            System.out.print("Enter the object's mass in kg: ");
            double m = input.nextDouble();
            System.out.print("Enter the object's acceleration in m/s^2: ");
            double a = input.nextDouble();

            // Calculates coefficient of friction from user inputs
            double u = (-(a*m-F))/(9.8*m);

            // Displays results
            System.out.println("The coefficient for friction is " + u);
        }
    }
}
