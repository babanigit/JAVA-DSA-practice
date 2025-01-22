public final class MathUtils {
    // Private constructor to prevent instantiation
    private MathUtils() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    // Method to calculate the factorial of a number
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Number must be non-negative");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to find the greatest common divisor (GCD)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
