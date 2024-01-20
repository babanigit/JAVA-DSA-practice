package easy;


public class RemoveElement {


    public static int removeElement(int [] arr, int val) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[0]!= val ) {
                arr[index]= arr[i];

                index++;
            }
            

            // System.out.println(arr[i]);


        }
        return index;
    }

    public static void main(String[] args) {

        int arr[] = new int[]{3,2,2,2,3,2};

        System.out.println(removeElement(arr, 2));
    }

}


// arr = [3,2,2,2,3]
// val =3 so we have to remove the 3
