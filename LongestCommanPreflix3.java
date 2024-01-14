import java.util.Scanner;

public class LongestCommanPreflix3 {

    static Scanner myScanner = new Scanner(System.in);

    public static String longestCommonPrefix(String[] str) {

        StringBuilder result = new StringBuilder();

        System.err.println();
    




        return result.toString();
    }

    public static void main(String[] args) {
        
        System.err.println("enter the amount of strings u want to store");

        String[] str = new String[myScanner.nextInt()];

        for (int i = 0; i < str.length ; i++)  str[i] = myScanner.next();
    
        myScanner.close();

        // String[] str = {
        // "ani", "ano", "annotation"
        // };

        System.err.println("The solution is : " + longestCommonPrefix(str));

    }
}
