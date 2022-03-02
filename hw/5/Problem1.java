import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        // Gets user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer to multiply it's digits: ");
        long nInput = input.nextLong();
        input.close();
        // Calls function, prints result
        System.out.println(multiplyDigits(nInput));
    }
    public static int multiplyDigits(long n) {
        int product = 1;
        // Until n is fully divided, extracts digits by % 10
        while (n != 0) {
            product = (int) (product * (n % 10));
            n = n / 10;
        }
        // Returns computed result
        return product;
    }
}