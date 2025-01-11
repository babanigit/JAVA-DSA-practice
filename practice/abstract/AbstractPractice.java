abstract class Shape {
    abstract void draw(); // Abstract method

    static {
        System.out.println("hey static");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName(); // Returns the class name
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
}

public class AbstractPractice {
    public static void main(String[] args) {
        // Array of Shape references
        Shape[] shapes = new Shape[4];

        // Assigning different Shape objects to the array
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();
        shapes[3] = new Square();

        // Displaying object names and calling draw()
        for (Shape shape : shapes) {
            System.out.println(shape); // Calls the overridden toString()
            shape.draw();
        }
    }
}
