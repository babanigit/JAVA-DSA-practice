public class findTheLargestElement {

    public static void main(String[] args) {

        int arr[] = new int[] {
                2, 4, 7, 4, 6, 9, 1 // length = 7, but last element is on index 6
        };

        int val = 0;

        for (int i = 0; i < arr.length; i++) {

            System.out.println("the element " + i + " is :- " + arr[i]);

            if (arr[i] > val) {
                val = arr[i];
            }
        }

        System.out.println("the largest value is :- " + val);
        
    }
}