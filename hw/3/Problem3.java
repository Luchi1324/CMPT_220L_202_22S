import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            // Gets input
            System.out.print("Enter the coordinates for two points (x1, y1, x2, y2): ");
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();

            // Computes result
            double m = (y2-y1)/(x2-x1);
            double b = y1-m*x1;
            
            // Formats then outputs result
            if (m == 1 && b == 0) {
                System.out.println("The line equation for two points ("+x1+", "+y1+") and ("+x2+", "+y2+") is y = x");
            } else if (m == 1) {
                System.out.println("The line equation for two points ("+x1+", "+y1+") and ("+x2+", "+y2+") is y = x + "+b);
            } else if (b == 0) {
                System.out.println("The line equation for two points ("+x1+", "+y1+") and ("+x2+", "+y2+") is y = "+m+"x");
            } else {
                System.out.println("The line equation for two points ("+x1+", "+y1+") and ("+x2+", "+y2+") is y = "+m+"x + "+b);
            }
        }
    }
}
