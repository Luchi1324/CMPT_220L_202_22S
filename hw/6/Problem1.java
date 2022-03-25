import java.util.concurrent.ThreadLocalRandom;

public class Problem1 {
    public static void main(String[] args) {
        // Creates counts array
        int[] counts = new int[10];

        // Generates random integers between 0 - 9 a hundred times
        for (int i = 0; i < 100; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt(0, 9 + 1);;
            counts[randomInt]++;
        }

        // Prints counts
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("The number of "+i+"s is "+counts[i]+"\n");
        }

    }
}