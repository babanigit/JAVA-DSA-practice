
public class SecondGreatest {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 5, 7, 30, 25 };

        // Check if array has at least 2 elements
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Initialize first and second greatest
        int firstGreatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstGreatest) {
                // Update both first and second greatest
                secondGreatest = firstGreatest;
                firstGreatest = num;
            } else if (num > secondGreatest && num != firstGreatest) {
                // Update second greatest if it's less than num and not equal to first greatest
                secondGreatest = num;
            }
        }

        // Check if a second greatest was found
        if (secondGreatest == Integer.MIN_VALUE) {
            System.out.println("No second greatest element found.");
        } else {
            System.out.println("The second greatest element is: " + secondGreatest);
        }
    }
}
