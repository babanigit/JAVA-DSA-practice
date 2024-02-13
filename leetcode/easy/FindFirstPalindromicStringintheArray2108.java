package easy;
public class FindFirstPalindromicStringintheArray2108 {

    public static String firstPalindrome(String[] words) {

        for (String word : words) {
            // first make the String mutable using StringBuilder and then reverse it.
            StringBuilder reversed = new StringBuilder(word).reverse();
          
            // converting mutable string to normal string using toString() method
            if (word.equals(reversed.toString())) {
                return word;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        String[] arr = new String[] {
                "abc", "car", "ada", "racecar", "cool"
        };
        System.out.println(firstPalindrome(arr));
    }
}
