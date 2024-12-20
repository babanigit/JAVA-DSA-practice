package practice.recursion;

public class Fibonacci2 {

    private static long fibonacci(int n) {
        long num = 0;

        if (n <= 1)
            return n;

        num = fibonacci(n - 1) + fibonacci(n - 2);

        return num;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

}
