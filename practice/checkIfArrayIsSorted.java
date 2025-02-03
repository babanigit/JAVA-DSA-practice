public class checkIfArrayIsSorted {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i=0; i< arr.length ; i++ ) {

            System.out.println(arr[i]);

            if (arr[i]< arr[ arr.length - (arr.length - 1) ]) {
                System.out.println("dataFirst:- " + arr[i] + " dataSecond:- " + arr[ arr.length - (arr.length - 1) ] );
            }
            
        }

        
    }
}
