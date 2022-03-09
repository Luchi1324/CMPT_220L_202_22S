import java.util.Scanner;
public class Project2 {
    public static void main(String[] args) {
        // Creates scanner and variables
        Scanner input = new Scanner(System.in);
        // Creates nums to hold input, then creates rem to hold remainders
        int[] nums = new int[10];
        int[] rem = new int[42];
        int distinctNs = 0;
        
        // Gets input 10 times, then adds them to array of ints
        for (int i = 0; i < 10; i++) {
            int n = input.nextInt();
            nums[i] = n;
        }
        input.close();

        // For each input, it calculates input % 42 and increments remainders array at position = remainder
        // For example, if nums[j] % 42 = 3, then it increases rem[3] by 1 and it's counted as a distinct number
        for (int j = 0; j < 10; j++) {
            int c = nums[j] % 42;
            rem[c]++;
        }
        // Iterates through the rem array, increases distinctNs if a remainder (rem[i] > 0) is detected
        // Duplicate remainders are only counted as one distinct number, i.e. rem[3] = 2 and rem[3] = 8 only count as one distinctN
        for (int i = 0; i < 42; i++) {
            if (rem[i] > 0) {
                distinctNs++;
            }
        }
        // Outputs result
        System.out.println(distinctNs);
    }
}
