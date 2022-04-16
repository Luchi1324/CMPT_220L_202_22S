import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        // Gets user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.next();
        System.out.print("Enter the delimiters: ");
        String delim = input.next();
        input.close();

        // Calls function, splits string, then returns substrings
        System.out.println(split(s, delim));
    }

    public static ArrayList<String> split(String s, String delimiters) {
        // Creates list for substring and for delimiters
        ArrayList<String> substringList = new ArrayList<String>();
        char[] delims = delimiters.toCharArray();
        char[] strings = s.toCharArray();

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < delims.length; j++) {

            }
        }

        return substringList;
    }
}

// Substring object
class substring {
    // Data fields
    private String contents;

    // Constructor
    substring() {}

    // Methods
    public void addToContents(String substr) {
        this.contents += " " + substr;
    }
}