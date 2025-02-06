import java.util.LinkedHashMap;
import java.util.Map;

public class nonRepeatingFristCharFromString {

    public static void main(String[] args) {

        String str = "ababbcddeff"; // output should be 'c'

        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {

            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);

        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("got the value :- " + entry.getKey());
                break;
            }
        }

    }
}