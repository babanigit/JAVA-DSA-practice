import java.util.Scanner;

public class main {
    static String myMethod() {
        System.out.println("myMethod called ");

        return " ";
    }

    public static void main(String[] args) {
        

        System.out.println("enter your name");
        
        String data = myMethod();

        System.out.println(data);
    }
}
