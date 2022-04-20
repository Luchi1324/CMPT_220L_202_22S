import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        // Gets user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary number to convert to decimal: ");
        String binString = input.next();
        input.close();

        // Passes data into method, then prints result
        System.out.println(bin2Dec(binString));
    }

    // bin2Dec method
    public static int bin2Dec(String binString) throws BinaryFormatException {
		int deci = 0;
		for (int i = 0, j = binString.length() - 1; i < binString.length(); i++, j--) {
            // if number isn't 0 or 1 at any point, throws exception
			if (binString.charAt(i) < '0' || binString.charAt(i) > '1')
			    throw new BinaryFormatException(binString);
            // Converts to deci by finding value at each point and multiplying by respective power (i.e. 2^2 * 1, 2^1 * 0)
			deci += (Integer.parseInt(String.valueOf(binString.charAt(i)))) * Math.pow(2, j);
		}
		return deci;
	}
}

class BinaryFormatException extends NumberFormatException {
	// Constructs custom exception
	public BinaryFormatException(String binaryString) {
		super(binaryString + " is not a binary string");
	}
}
