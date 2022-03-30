import java.util.Scanner;
public class Problem3 {
    public static int[] count(String s) {
        int[] counts = new int[10];
        for (int i = 0; i < counts.length; i++) {
            int count = 0;
            for (int j = 0; i < counts.length; i++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            counts[i] = count;
            }
        }
        return counts;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();
        count(str);
        // JA: Output?
    }
}
