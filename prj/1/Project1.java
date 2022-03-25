import java.util.Scanner;
// JA: It's always good to have a comment in the header explaining what the program does.
public class Project1 {
    public static void main(String[] args) {
        // Gets Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter S1 and T: ");
        int s1 = input.nextInt();
        int t = input.nextInt();
        input.close();

        // Computes results
        // JA: How?
        int s2 = (2*t) - s1;
        System.out.println("S2 is "+s2);
    }
}
