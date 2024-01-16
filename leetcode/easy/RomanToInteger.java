
// package easy;
import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
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

            System.out.println(i);

            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {

                System.out.println(s.charAt(i) + " > " + s.charAt(i - 1));
                System.out.println(i);

                // result = VXC = 10-2*5, 100-2*10 = 85
                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
                System.out.println("if ka result " + result);

            } else

                // result = v = 5
                result += map.get(s.charAt(i));
            System.out.println("the result is " + result + " because of " + s.charAt(i));

        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("enter the roman character : ");
        String ch = scanner.next();
        // let he user entered =  VXC
        int returnInt = RomanToInt(ch);
        System.err.println(returnInt);
    }
}
