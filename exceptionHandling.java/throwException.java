public class throwException {

    public static void main(String[] args) {

        

        checkAge(15);
        System.out.println("hello exception");
        
    }


static void checkAge(int age) {
        if (age <= 18) {
            throw new ArithmeticException("access denied - you must at be at least 18 years old");
        }else {
            System.out.println("access granted - you are above 18+");
        }
    }

}