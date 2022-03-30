import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        // Gets input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, and c: ");
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        input.close();

        // Creates new QuadraticEquation object, then displays roots based on discriminant
        QuadraticEquation userEquation = new QuadraticEquation(A, B, C);
        if (userEquation.getDiscriminant() > 0) {
            System.out.printf("Root 1: %.2f, Root 2: %.2f", userEquation.getRoot1(), userEquation.getRoot2());
        } else if (userEquation.getDiscriminant() == 0) {
            System.out.printf("Root: %.2f", userEquation.getRoot1());
        } else {
            System.out.println("This equation has no roots.");
        }
        
    }
}

class QuadraticEquation {
    // Declares private data fields
    private double a;
    private double b;
    private double c;

    // Constructor
    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getters
    double getA() {
        return a;
    }
    double getB() {
        return b;
    }
    double getC() {
        return c;
    }

    // Methods
    double getDiscriminant() {
        return Math.pow(b, 2) - 4 * (a * c);
    }

    // Only executes if the discriminant is non-negative (>0)
    double getRoot1() {
        if (this.getDiscriminant() >= 0) {
            return (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        } else {
            return 0.0;
        }
    }

    double getRoot2() {
        if (this.getDiscriminant() >= 0) {
            return (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
        } else {
            return 0.0;
        }
    }
}