import java.lang.Math;

// Shape class
class Shape {
    // Method to calculate area
    public double area() {
        return 0; // Default implementation returns 0
    }
}

// Circle class, subclass of Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override area method for Circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class, subclass of Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override area method for Rectangle
    @Override
    public double area() {
        return length * width;
    }
}

// Main class to test Shape, Circle, and Rectangle classes
class Main {
    public static void main(String[] args) {
        // Create Circle object and calculate its area
        Circle circle = new Circle(5);
        System.out.println("Area of circle: " + circle.area());

        // Create Rectangle object and calculate its area
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}
