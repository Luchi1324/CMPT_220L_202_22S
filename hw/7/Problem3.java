import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Gets input
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble(); 
        double x2 = input.nextDouble();
        double y2 = input.nextDouble(); 
        double x3 = input.nextDouble();
        double y3 = input.nextDouble(); 

        // Creates point objects
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        Point point3 = new Point(x3, y3);
        input.close();

        // Calls method, then outputs result
        Point centrePoint = getCentrePoint(point1, point2, point3);
        System.out.println("The centre point is at "+centrePoint);
    }

    public static Point getCentrePoint(Point p1, Point p2, Point p3) {
        // Calculates points using Centroid formula
        double x = (p1.getX() + p2.getX() + p3.getX()) / 3;
        double y = (p1.getY() + p2.getY() + p3.getY()) / 3;

        return new Point(x, y);
    }
}
