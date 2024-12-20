import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger3 {
    static Scanner scanner = new Scanner(System.in);
    static HashMap<Character, Integer> map = new HashMap<>();

    static public int RomanToInt(String s) {

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            result += map.get(s.charAt(i));
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("enter the roman character : ");
        String ch = scanner.next();
        // let he user entered = VXC
        int returnInt = RomanToInt(ch);
        System.err.println(returnInt);

        System.out.println("ehhhlooo");
    }
}
