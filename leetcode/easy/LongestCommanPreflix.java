// package easy;

// taking user input of strings

import java.util.Scanner;

public class LongestCommanPreflix {
    static Scanner myObj = new Scanner(System.in);

    public static String LongestCommanPreflix(String[] strs) {
        if (strs.length == 0)
            return "";

        for (int i = 0; i < strs[0].length(); ++i) {
            System.out.println(strs[0].length());
            for (int j = 1; j < strs.length; ++j) {
                System.err.println(strs.length);
                if (i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i))
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
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
        String data = LongestCommanPreflix(str);

        System.err.println(data);

    }

}
