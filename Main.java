import java.util.Scanner;

public class Main {

    static Scanner myObj = new Scanner(System.in);

    static String myMethod(String x) {
        System.out.println("myMethod called ");

        return ("this String " + x + " have came through the return statement of my method");
    }

    public static void main(String[] args) {

        String[] strData = {"name","age","location"};

        System.out.println(strData);

        System.out.println("enter your name");

        String nameData = myObj.nextLine();
        String data = myMethod(nameData);

        System.out.println(data);
    }
}
