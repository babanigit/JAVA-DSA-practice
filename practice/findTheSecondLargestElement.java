
public class findTheSecondLargestElement {
    public static void main(String[] args) {

        System.out.println(" the second largest element ");

        int arr[] = new int[] {
                2, 4, 7, 4, 6, 9, 1
        };

        int firstLargestElement = Integer.MIN_VALUE, secondLargestElement = Integer.MIN_VALUE;

        // 0 to 6 is < 7
        for (int i = 0; i < arr.length; i++) {

            // System.out.println("the element " + i + " is :- " + arr[i] );

            if (arr[i] > firstLargestElement) {
                secondLargestElement = firstLargestElement;
                firstLargestElement = arr[i];
            } else if (arr[i] > secondLargestElement && arr[i] != firstLargestElement) {
                secondLargestElement = arr[i];
            } else {
                System.out.println("left over arr num:- " + arr[i]);
            }

        }

        System.out.println("the second largest element in the arr is :- " + secondLargestElement);

    }
}