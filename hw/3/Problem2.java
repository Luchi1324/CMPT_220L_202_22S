import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            // Gets input
            System.out.print("Enter the numerator and denominator: ");
            int numerator = input.nextInt();
            int denominator = input.nextInt();

            // Computes and prints result
            if (numerator / denominator < 1) {
                System.out.println(numerator+"/"+denominator+" is a proper fraction.");
            } else if (numerator % denominator == 0) {
                System.out.println(numerator+"/"+denominator+" is an improper fraction and can be reduced down to "+numerator/denominator);
            } else {
                int mixedInt = numerator / denominator;
                int mixedNumerator = numerator - (denominator*mixedInt);
                System.out.println(numerator+"/"+denominator+" is an improper fraction and it's mixed fraction is "+mixedInt+" + "+mixedNumerator+"/"+denominator);
            }
        }
    }
}

