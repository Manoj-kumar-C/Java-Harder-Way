// Abstract class example
abstract class Shape {
    // Abstract method (no implementation)
    public abstract void draw();

    // Concrete method with implementation
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass of Shape
class Circle extends Shape {
    // Implementing the abstract method
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

// Interface example
interface Drawable {
    // Abstract method (no implementation)
    void draw();
}

// Concrete class implementing the interface
class Rectangle implements Drawable {
    // Implementing the draw method specified by the interface
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        // Using abstract class
        Shape shape = new Circle(); // Polymorphism
        shape.draw(); // Output: Drawing Circle
        shape.display(); // Output: This is a shape.

        // Using interface
        Drawable drawable = new Rectangle();
        drawable.draw(); // Output: Drawing Rectangle
    }
}
