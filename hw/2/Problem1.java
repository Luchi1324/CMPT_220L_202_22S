import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {  
            // Prompts user to enter radius of a circle
            System.out.print("Enter the radius of the circle: ");
            double radius = input.nextDouble();

            // Compute diameter and area
            double diameter = radius * 2;
            double area = radius* radius * 3.14159;
            
            // Displays result
            System.out.println("The diameter is " + diameter);
            System.out.println("The area is " + area);
        }
    }
}
