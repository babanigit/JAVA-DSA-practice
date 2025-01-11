class MathUtils {
    static int square(int x) {
        return x * x;
    }
}

public class Static_Practice {
    public static void main(String[] args) {
        int result = MathUtils.square(5); // No object creation required
        System.out.println("Square of 5 is: " + result); // Output: 25
    }
}
