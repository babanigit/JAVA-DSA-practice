class Example {
    static int counter = 0; // Static variable

    Example() {
        counter++; // Increment for each object created
    }

    void displayCount() {
        System.out.println("Counter: " + counter);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();
        Example obj3 = new Example();

        obj3.displayCount(); // Output: Counter: 3 (shared variable)
    }
}
