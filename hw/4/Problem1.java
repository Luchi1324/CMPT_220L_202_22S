import java.util.*;
public class Problem1 {
    public static void main(String[] args){
        // Gets input
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of sides: ");
            int n = input.nextInt(); 
            System.out.print("Enter the side: ");
            double s = input.nextDouble();

            // Computes then outputs results
            double area = (n * (s*s)) / (4 * Math.tan(Math.PI/n));
            System.out.println("The area of the polygon is "+area);
        }
    }
}
