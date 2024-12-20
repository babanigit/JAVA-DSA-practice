import java.util.Arrays;

public class CloseString {

    public static boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length())return false;

        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            f1[word1.charAt(i) - 'a']++;
            f2[word2.charAt(i) - 'a']++;

            System.err.println("hello");

            // System.out.println(i); //0 ,1 ,2
            // System.out.println(word1.charAt(i)); //a ,b ,c
            // System.out.println(f1[word1.charAt(i)-'a']++); //1 ,1 ,1
            // System.out.println(f2[word2.charAt(i)-'a']++ + "\n"); //1 ,1 ,1
            

        }

        System.out.println("a + a++ is "+ f1['a'-'a']++);
        System.out.println("b + a++ is "+ f1['b'-'a']++);
        System.out.println("b + a++ is "+ f1['b'-'a']++);
        System.out.println("b + a++ is "+ f1['b'-'a']++);

        // for (int i = 0; i < word1.length(); i++) {
   
        //     System.err.println("value of f1 " + f1[i]);
        //     System.err.println("value of f2 " + f2[i]);
        // }

        for (int i = 0; i < 26; i++) {
            System.err.println(f1[i]);
            System.err.println(f2[i]);

            if ((f1[i] == 0 && f2[i] != 0) || (f1[i] != 0 && f2[i] == 0)) return false;
        }

        
        Arrays.sort(f1);
        Arrays.sort(f2);

        for (int i = 0; i < 26; i++) {
            if (f1[i] != f2[i])
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        // System.err.println("hello");

        String str1 = "abc";
        String str2 = "bcx";

        boolean data = closeStrings(str1, str2);
        System.out.println(data);
    }
}
