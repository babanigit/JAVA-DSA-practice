
import java.util.Arrays;
import java.util.Scanner;

public class LongestCommanPreflix3 {

    static Scanner myScanner = new Scanner(System.in);

    public static String longestCommonPrefix(String[] str) {

        StringBuilder result = new StringBuilder();
        Arrays.sort(str);

        char[] first = str[0].toCharArray();
        char[] last = str[str.length - 1].toCharArray();

        for (int i = 0; i < first.length; i++) {

            if (first[i] != last[i]) break;
        
            result.append(first[i]);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {

        System.err.println("enter the amount of strings u want to store");

        String[] str = new String[myScanner.nextInt()];

        for (int i = 0; i < str.length; i++)
            str[i] = myScanner.next();

        myScanner.close();

        // String[] str = {
        // "ani", "ano", "annotation"
        // };

        System.err.println("The solution is : " + longestCommonPrefix(str));

    }
}
