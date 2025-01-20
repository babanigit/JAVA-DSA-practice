import java.util.Stack;

public class ReverseaStringUsingStack {

    public static void main(String[] args) {
        String str = "Hello, World!";

        // Step 1: Create a stack
        Stack<Character> stack = new Stack<>();

        // Step 2: Push each character of the string onto the stack
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        // Step 3: Pop each character from the stack to build the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Reversed String: " + reversed.toString());

    }

}
