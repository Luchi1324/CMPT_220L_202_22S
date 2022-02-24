import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        // Gets inpuy
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a genome string: ");
        String genome = input.nextLine();
        boolean found = false;
        int start = -1;
        input.close();

        // Computes Results
        for (int i = 0; i < genome.length() - 2; i++) {
            // Checks triplets throughout the genome for a gene
            String triplet = genome.substring(i, i + 3);
            // Identifies starting point
            if (triplet.equals("ATG")) {
                start = i + 3;
            } else if (((triplet.equals("TAG")) || (triplet.equals("TAA")) || (triplet.equals("TGA"))) && (start != -1)) {
                // Checks if gene length is a multiple of 3 & ends before any of the above
                String gene = genome.substring(start, i);
                if (gene.length() % 3 == 0) {
                    found = true;
                    System.out.println(gene);
                    start = -1;
                }
            }
        }
        if (!found)
        System.out.println("no gene is found");
        }
    }
