// Define the abstract class
abstract class Shape {
    // Abstract method: does not have a body
    abstract double computeArea();
    
    // Concrete method: can be shared by all subclasses
    void displayShape() {
        System.out.println("Displaying the area of the shape:");
    }
}

// Subclass for a Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double computeArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass for a Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double computeArea() {
        return length * width;
    }
}

public class Abstract {
    public static void main(String[] args) {
        // You cannot create an object of an abstract class directly (e.g., new Shape())
        
        Shape myCircle = new Circle(5.0);
        Shape myRectangle = new Rectangle(10.0, 4.0);

        myCircle.displayShape();
        System.out.println("Circle Area: " + String.format("%.2f", myCircle.computeArea()));

        System.out.println("---------------------------");

        myRectangle.displayShape();
        System.out.println("Rectangle Area: " + myRectangle.computeArea());
    }
}