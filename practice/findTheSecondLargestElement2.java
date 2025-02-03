public class findTheSecondLargestElement2 {

    public static void main(String[] args) {

        int[] arr = { 12, 13, 1, 11, 5, 6, 7 };

        int fle = Integer.MIN_VALUE;
        int sle = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
        	
            if (arr[i] > fle) {
                sle = fle;
                fle = arr[i];
            } else if (arr[i] > sle && arr[i] != fle) {
                sle = arr[i];
            }

        }
        System.out.println("the second largest element is:- " + sle);

    }
}