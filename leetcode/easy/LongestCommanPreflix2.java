// package easy;
import java.util.Arrays;
import java.util.Scanner;

public class LongestCommanPreflix2 {
    static Scanner myObj = new Scanner(System.in);

    static public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {

        System.err.println("enter the amount of strings u want to store");
        int stringData = myObj.nextInt();
        String[] str = new String[stringData];
        for (int i = 0; i < stringData; i++) {
            // System.out.println("enter the " +i+ " number");
            str[i] = myObj.next();
        }
        myObj.close();
        // String[] str = {
        // "ani", "ano", "annotation"
        // };
        String data = longestCommonPrefix(str);

        System.err.println("The solution is : " + data);
    }
}
