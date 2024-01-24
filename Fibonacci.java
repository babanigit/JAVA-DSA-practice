public class Fibonacci {

    private static long Fibonacci(int n) {

        if(n <= 1) return n ;

        long num = Fibonacci(n-1) + Fibonacci(n-2);

        return num;
    }
    

    public static void main(String[] args) {

        System.out.println(Fibonacci(8));
    }
}
