public class reversTheArray {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("reversed :- " + arr[i]);
        }

    }

}
