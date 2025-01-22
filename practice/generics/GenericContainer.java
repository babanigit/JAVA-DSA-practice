// GenericContainer.java
public class GenericContainer<T> {
    private T value; // Generic variable to hold a value

    // Constructor
    public GenericContainer() {
        this.value = null;
    }

    // Getter method to retrieve the value
    public T getValue() {
        return value;
    }

    // Setter method to update the value
    public void setValue(T value) {
        this.value = value;
    }

    // Method to display the value's type and content
    public void displayType() {
        System.out.println("Type of T: " + value.getClass().getName());
    }
}
