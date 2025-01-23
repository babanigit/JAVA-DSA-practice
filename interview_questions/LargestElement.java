public class LargestElement {
    

    public static void main(String[] args) {

        int[] arr = new int[]{
            10, 20, 5, 7, 30, 25
        };

        int large= Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > large) {
                large = arr[i];
            }
        }

        System.out.println("Largest element in the array is : " + large);
        
    }
}
