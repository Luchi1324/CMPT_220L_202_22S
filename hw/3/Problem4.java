public class Problem4 {
    public static void main(String[] args){
        // Generates random coordinates within radius
        double x = 5 + Math.random() * -10;
        double y = 5 + Math.random() * -10;

        // Computes distance using Pythagoras theorem
        double hypo = Math.pow((x*x + y*y), 0.5);

        System.out.println("The point is ("+x+", "+y+")");
        System.out.println("And its distance to the centre is " + hypo);
    }
}
