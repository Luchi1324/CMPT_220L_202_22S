import java.util.Scanner;
public class Project1 {
    public static void main(String[] args) {
        // Gets Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter S1 and T: ");
        int s1 = input.nextInt();
        int t = input.nextInt();
        input.close();

        // Computes results
        int s2 = (2*t) - s1;
        System.out.println("S2 is "+s2);
    }
}
