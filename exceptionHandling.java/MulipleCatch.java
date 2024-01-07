


public class MulipleCatch {

    public static void main(String[] args) {
        System.out.println(args.length);

        try {
            int a = args.length;
            System.out.println("a= "+ a);
            int b = 2/a;
            int c[] = {1};
            c[10] = 25;
        } 
        
        // catch (ArithmeticException e) {
        //     System.out.println("division by zero:" +e+ "\n");
        // }

         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index out of bounds : " + e);
        }

        System.err.println("after try/catch block");
    }
}
