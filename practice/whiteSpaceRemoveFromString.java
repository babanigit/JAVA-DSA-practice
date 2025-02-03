public class whiteSpaceRemoveFromString {

    public static void main(String[] args) {

        String str = "Aniket Panchal is a Boy";
        char charArr[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char ch : charArr) {
            if (ch != ' ') {
                sb.append(ch);
            }
        }
        System.out.println("Removed space string is:- " + sb.toString());

    }
}