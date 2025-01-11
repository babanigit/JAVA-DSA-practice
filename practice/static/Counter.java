class CounterClass {
    int count = 0; // Non-static variable

    CounterClass() {
        count++; // Increment count for each object
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class Counter {
    public static void main(String[] args) {
        CounterClass obj1 = new CounterClass(); // obj1.count = 1
        CounterClass obj2 = new CounterClass(); // obj2.count = 1
        CounterClass obj3 = new CounterClass(); // obj3.count = 1

        obj1.displayCount(); // Output: Count: 1 (specific to obj1)
        obj2.displayCount(); // Output: Count: 1 (specific to obj2)
        obj3.displayCount(); // Output: Count: 1 (specific to obj3)
    }
}
