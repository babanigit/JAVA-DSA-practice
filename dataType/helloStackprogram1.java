package dataType;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class helloStackprogram1 {

    static Stack<String> stack = new Stack<>();
    static Queue<String> queue = new LinkedList<>();
    


    public static void main(String[] args) {
        System.out.println("hello stack");

        System.out.println(stack.isEmpty());

        for (int i = 0; i < 3; i++) {
            stack.push("hello ");
            stack.push("there ");
            stack.push("jojo ");

        }

        System.out.println(stack.isEmpty());
        System.out.println(stack);
        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        System.out.println(stack);

        // queue

        queue.add("aniket ");
        queue.add("bro ");
        System.out.println(queue);
        System.out.println(queue.peek());


    }
}
