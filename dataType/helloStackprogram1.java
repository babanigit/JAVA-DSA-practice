// package dataType;
// array,stack,queue,linkedList

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class helloStackprogram1 {

    static Stack<String> stack = new Stack<>();
    static Queue<String> queue = new LinkedList<>();
    static List<String> list = new Stack<>();

    static int [] arr = new int[] {
        23,34,54
    };
    


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
        System.out.println("stack peek  ; " + stack.peek());

        stack.pop();
        stack.pop();
        System.out.println(stack);

        // queue

        queue.add("aniket ");
        queue.add("bro ");
        System.out.println(queue);
        System.out.println(queue.peek());

        String arrString =  Arrays.toString(arr);
        System.out.println(arrString);

        // int[] numbers = new int [numbers.length];
        // System.out.println(arrString.length());

        // for (int i = 0; i < arrString.length(); i++) {
        //     numbers[i] = Integer.parseInt(arrString[i]);
        // }

        list.add("hello");
        list.add("there");

        System.out.println(list);
        System.out.println(stack);
        for(String fruit : list) System.out.println(fruit);


        queue.add("sis");
        System.out.println(queue);
        



    }
}
