import java.util.Random;

public class Problem4 {
    public static void main(String[] args){
        Random random = new Random();
        // Generates random coordinates within radius
        double x = random.nextDouble((5 - -5) + 1) + -5;
        double y = random.nextDouble((5 - -5) + 1) + -5;

        // Computes distance using Pythagoras equaton
        double hypo = Math.pow((x*x + y*y), 0.5);

        System.out.println("The point is ("+x+", "+y+")");
        System.out.println("And its distance to the centre is " + hypo);
    }
}
