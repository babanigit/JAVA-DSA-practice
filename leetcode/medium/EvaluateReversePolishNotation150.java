package medium;
import java.util.Stack;

public class EvaluateReversePolishNotation150 {

    public static int evalRPN(String[] token) {

        // creating Stack Object
        Stack<Integer> stack = new Stack<Integer>();

        for (String store : token) {
            if ("+".equals(store))
                stack.push(stack.pop() + stack.pop());

            else if ("-".equals(store))
                stack.push(-(stack.pop() - stack.pop()));

            else if ("*".equals(store))
                stack.push((stack.pop() * stack.pop()));

            else if ("/".equals(store)) {
                int y = stack.pop();
                int x = stack.pop();
                stack.push(x / y);
                System.out.println(stack);
            }

            else
                stack.push(Integer.valueOf(store));
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String[] strs = new String[] {
                // "2", "1", "+", "3", "*"
                "4","13","5","/","+"
        };

        System.out.println(evalRPN(strs));
    }

}
