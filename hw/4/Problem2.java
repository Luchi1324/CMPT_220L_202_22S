import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Grabs user input
         System.out.print("Enter the number of sides: ");
        int s = input.nextInt();
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();
        input.close();

        System.out.println("The coordinates of the points on the polygon are");
        // Computes result for each side
        for (int i = 0; i < s; i++) {
            double x = radius * Math.cos(2.0 * Math.PI / s * i);
            double y = radius * Math.sin(2.0 * Math.PI / s * i);
            System.out.printf("(%.2f, %.2f)", x, y);
            System.out.println();;
        }
    }
}
