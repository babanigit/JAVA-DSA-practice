import java.util.Scanner;
import java.util.Stack;

public class implementingQueueUsingStack {

    // initialize packages
    static Scanner obj = new Scanner(System.in);
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();


    public void MyQueue() {

        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void Push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while (stack1.size() > 1) {

            stack2.push(stack1.pop());
        }
        int data = stack1.push(stack2.pop());

        while (!stack2.isEmpty()) {
        }

        return data;
    }

    public int peek() {

        System.out.println("hellop");

        while (stack1.size() > 1) {

            stack2.push(stack1.pop());
        }
        int data = stack1.push(stack2.pop());

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return data;
    }

    public boolean empty() {

        boolean x = stack1.size() == 0;
        System.out.println(x);
        return stack1.size() == 0;
    }

    public static void main(String[] args) {

        // System.out.println("enter the number: ");
        // int n = obj.nextInt();

        // for (int i = 0; i < n; i++) {
        // Push(n);
        // }
        // obj.close();

        // implementingQueueUsingStack imp = new implementingQueueUsingStack();

        System.out.println("its running");

        try {
            // imp.Push(1);
            // imp.Push(2);
            // imp.Push(3);



        } catch (Exception e) {
            System.out.println(e);
        } 

        System.out.println();

    }
}