package practice;
public class callArray {


    static void call(int x[], String z) {

        for (int element:x){

            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] arr = {
                12, 23, 34, 3, 423, 12
        };

        call(arr,"aniket");


    }

}
