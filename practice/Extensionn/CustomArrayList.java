import java.util.ArrayList;

public class CustomArrayList<T> extends ArrayList<T> {
    // Method to get the middle element
    public T getMiddleElement() {
        if (this.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return this.get(this.size() / 2);
    }
}
