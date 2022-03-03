import java.util.Scanner;
public class Problem4 {
    public static String format(long Seconds) {
        // Converts from seconds to hours, minutes and seconds respectively
        int hours = (int) (Seconds / 3600);
        int minutes = (int) (Seconds % 3600 / 60);
        int seconds = (int) (Seconds % 60);
        // Pads numbers with 0 if less than 10 w/ ternary operators
        String hh = hours < 10 ? "0"+hours : ""+hours;
        String mm = minutes < 10 ? "0"+minutes : ""+minutes;
        String ss = seconds < 10 ? "0"+seconds : ""+seconds;;
        String hhMmSs = hh+":"+mm+":"+ss;
        return hhMmSs;
    }
    public static void main(String[] args) {
        // Gets input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total seconds: ");
        long secondsInput = input.nextLong();
        input.close();

        // Calls function, than displays return result
        System.out.println("The hours, minutes, and seconds for total seconds "+secondsInput+" is "+format(secondsInput));
    }
}
