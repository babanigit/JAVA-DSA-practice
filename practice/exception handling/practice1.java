public class practice1 {

    public static void main(String[] args) {

        try {
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage()); // Catch and handle the exception
        } finally {
            System.out.println("Execution complete"); // Finally block always executes
        }
    }
}
