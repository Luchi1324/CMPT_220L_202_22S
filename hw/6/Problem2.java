import java.util.Scanner;

class Point {
    double x;
    double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return ("(" + x + "," + y + ")"); 
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Point[] points = new Point[6];

        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x"+(i+1)+", y"+(i+1)+": ");
            int x = input.nextInt();
            int y = input.nextInt();
            points[i] = new Point(x, y);
        }
        input.close();
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
        }
    }

    public static double cross_product(Point a, Point b) {
        return a.x * b.y - a.y * b.x;
    }

    public static double area(Point[] vertices) {
        double sum = 0.0 //JA: Systax error
        for (int i = 0; i < 5; i++) {
            sum += cross_product(
                vertices[i],
                vertices[i+1]%5);
        }
    }
}
