import java.util.Arrays;

public class RearrangeArrayElementsbySign2149 {

    public static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];

        int p =0,n=1;

        for (int i = 0; i < result.length; i++) {
            if (nums[i]>=0) {
                result[p]=nums[i];
                p+=2;
            }else {
                result[n] = nums[i];
                n+=2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        
        int[] arr = new int[]{
            3,1,-2,-5,2,-4
        };

        String store = Arrays.toString(rearrangeArray(arr));
            System.out.println(store);

            System.out.println(store.getClass().getSimpleName());

    }
}
