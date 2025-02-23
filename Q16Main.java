import java.util.Scanner;

// Parent class Shape
class Shape {
    // Method to get the area (default)
    public double getArea() {
        return 0.0;
    }
}

// Subclass Rectangle that extends Shape
class Rectangle extends Shape {
    private double length, width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override getArea() method to calculate the rectangle's area
    @Override
    public double getArea() {
        return length * width;
    }
}

// Main class to test the Rectangle class
public class Q16Main {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter length and width
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        // Create an instance of Rectangle with user-provided values
        Rectangle rect = new Rectangle(length, width);

        // Print the computed area of the rectangle
        System.out.println("Rectangle Area: " + rect.getArea());

        // Close scanner
        scanner.close();
    }
}