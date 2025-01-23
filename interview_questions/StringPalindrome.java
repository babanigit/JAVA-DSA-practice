public class StringPalindrome {

    public static boolean checkPalindrome(String str){

        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);

        if (str.equals(reversed)) {
            return true;
        }else{
            return false;
        }
    }
 
    public static void main(String[] args) {
        
        // madam
        System.out.println(checkPalindrome("madam"));

    }
}
