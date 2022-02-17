import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            // Gets input
            System.out.print("Enter a, b, and c: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();

            // Computes result
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            double rootOne = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
            double rootTwo = (-b - Math.pow(discriminant, 0.5)) / 2 * a;

            // Prints result
            if (discriminant > 0) {
                System.out.println("The equation has two roots " + rootOne + " and " + rootTwo);
            } else if (discriminant == 0) {
                System.out.println("The equation has one root " + rootOne);
            } else {
                System.out.println("The equation has no roots");
            }
        }
    }
}
