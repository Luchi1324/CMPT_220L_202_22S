import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            // Prompts user to input minutes
            System.out.print("Enter the number of minutes: ");
            int minutes = input.nextInt();

            // Calculates results
            int years = minutes / 60 / 24 / 365;
            int days = (minutes / 60 / 24 % 365);

            // Prints results
            System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
        }
    }
}
