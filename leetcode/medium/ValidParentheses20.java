package medium;
    import java.util.Stack;

    /**
     * ValidParentheses20
     */
    public class ValidParentheses20 {
        static Stack<Character> stack = new Stack<>();

        public static boolean isValid(String s) {
            if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}')
                return false;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == '(' || ch == '{' || ch == '[')
                    stack.push(ch);

                if (stack.isEmpty() && (ch == ']' || ch == ')' || ch == '}'))
                    return false;

                if ((ch == ')' && stack.peek() != '(') || (ch == ']' && stack.peek() != '[')|| (ch == '}' && stack.peek() != '{'))
                    return false;
                    
                if (stack.peek() == '(' && ch == ')' || stack.peek() == '{' && ch == '}'|| stack.peek() == '[' && ch == ']')
                    stack.pop();

            }
            return stack.isEmpty();
        }

        public static void main(String[] args) {

            // String[] str = new String[] {

            // };
            String str = "{[]}";

            System.out.println(isValid(str));

        }
    }