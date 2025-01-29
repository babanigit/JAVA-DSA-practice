public class checkpalindrome {

    public static boolean checkpalindromeFun(String str) {

        StringBuilder sb1 = new StringBuilder(str);

        if (sb1.reverse().toString().equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("hello palindrome");
        System.out.println(checkpalindromeFun("madam"));

    }

}