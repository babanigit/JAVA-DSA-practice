public class MoveZerosToLeft {

    public static void main(String[] args) {

        int[] arr = new int[] {
                1, 0, 2, 5, 0, 0, 3, 0, 0, 0, 2
        };
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
