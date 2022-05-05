import java.util.*;

public class Project5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Gets user input, then creates Complex objects with inputted data
            System.out.print("Enter the first complex number: ");
            Complex com1 = new Complex(input.nextDouble(), input.nextDouble());
            System.out.print("Enter the second complex number: ");
            Complex com2 = new Complex(input.nextDouble(), input.nextDouble());

            // Outputs results
            double a = com1.getRealPart();
            double b = com1.getImaginaryPart();
            double c = com2.getRealPart();
            double d = com2.getImaginaryPart();

            // Calls addition
            System.out.printf("\n(%.1f + %.1fi) + (%.1f + %.1fi) = %s", a, b, c, d, com1.add(com2));

            // Calls subtraction
            System.out.printf("\n(%.1f + %.1fi) - (%.1f + %.1fi) = %s", a, b, c, d, com1.subtract(com2));

            // Calls multiplication
            System.out.printf("\n(%.1f + %.1fi) * (%.1f + %.1fi) = %s", a, b, c, d, com1.multiply(com2));

            // Calls division
            System.out.printf("\n(%.1f + %.1fi) / (%.1f + %.1fi) = %s", a, b, c, d, com1.divide(com2));
            
            // Calls absolute value
            System.out.printf("\n|%.1f + %.1fi| = %f", a, b, com1.abs());
        }
    }
}