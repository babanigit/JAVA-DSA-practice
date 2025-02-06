
import java.util.Arrays;

public class AnagramChecker {

    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "Silent";

        str1.replaceAll("\\s", "").toLowerCase();
        str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("not an anagram!");
        } else {

            char[] charArr1 = str1.toCharArray(), charArr2 = str2.toCharArray();

            Arrays.sort(charArr1);
            Arrays.sort(charArr2);

            if (Arrays.equals(charArr1, charArr2)) {
                System.out.println("is an anagram");
            } else {
                System.out.println("not an anagram!");

            }
        }

    }
}
