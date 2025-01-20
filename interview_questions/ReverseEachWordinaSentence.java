public class ReverseEachWordinaSentence {

    public static void main(String[] args) {

        String str = "Hello World";
        String[] words = str.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            reversedSentence.append(reversed).append(" ");
        }

        // Convert StringBuilder to a string and trim the trailing space
        String result = reversedSentence.toString().trim();
        System.out.println("Reversed sentence with capitalized words: " + result);
    }

}
