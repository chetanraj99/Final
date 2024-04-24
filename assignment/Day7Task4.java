import java.util.Scanner;

public class Area {
    double length;
    double breadth;

    // Constructor to initialize length and breadth
    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length and breadth from the user
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();

        // Create an object of Area class
        Area rectangle = new Area(length, breadth);

        // Calculate and print the area of the rectangle
        double area = rectangle.returnArea();
        System.out.println("Area of rectangle: " + area);

        scanner.close();
    }
}
