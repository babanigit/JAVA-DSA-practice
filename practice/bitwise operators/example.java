
public class example {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a << 1);
        System.out.println(a >> 1);
        System.out.println(a >>> 1);

        int arr[] = new int[] {
                4, 3, 2, 7, 8, 2, 3, 1
        };

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }

        System.out.println("the xor is :- " + result);

    }
}
