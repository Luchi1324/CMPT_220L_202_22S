import java.util.*;
public class Problem2 {
    public static String decimalToBinary(int value) {
        // Creates binary array and counter
        int[] binaryN = new int[11];
        int count = 0;
        // Appends numbers to an array
        while (value > 0) {
            binaryN[count] = value % 2;
            value = value / 2;
            count++;
        }
        int[] reverse = new int[binaryN.length];
        for (int i = 0, j = reverse.length - 1; i < binaryN.length; i++, j--)
           reverse[j] = binaryN[i];
        // Prints binary array backwards
        String binaryStr = Arrays.toString(reverse);
        return binaryStr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        input.close();
        // Calls function, print result
        System.out.println("The binary value is "+decimalToBinary(n));
    }
}
