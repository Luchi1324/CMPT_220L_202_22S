import java.util.Scanner;
public class Problem3 {
    public static String title(String s) {
        // Converts passed string, s, into an array of chars
        char[] c = s.toCharArray();
        // Capitalises first letter
        c[0] = Character.toUpperCase(c[0]);
        for (int i = 0; i < c.length; i++) {
            // Checks if there is a space, then capitilizes ajacent letter
            if (c[i] == ' ') {
                c[i+1] = Character.toUpperCase(c[i+1]);
            }
        }
        return String.valueOf(c);
    }
    public static void main(String[] args) {
        // Gets input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sInput = input.nextLine();
        input.close();

        // Calls function, then returns result
        System.out.println("The new string is: "+title(sInput));
    }
}
