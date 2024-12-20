import java.util.Scanner;

/**
 * palindromeNumber
 */
public class palindromeNumber {
    static Scanner scanner = new Scanner(System.in);
    static public boolean isPalindrome(int x){

        if (x<0) return false;

        int number = x;
        int reverse = 0;


        // this formula is used to reverse the number
        while (number>0) {

            reverse =reverse * 10 + number % 10;
            System.err.println(" rev- "+reverse );

            number /= 10;
            System.err.println(" num- "+number +"\n");

        }

        return x == reverse ;
    }
    public static void main(String[] args) {

        System.out.println("enter the number : ");
        int num = scanner.nextInt();
        

        System.out.println(isPalindrome(num));

    }
}