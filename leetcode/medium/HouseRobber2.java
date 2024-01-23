public class HouseRobber2 {

    public static int rob(int[] numbs) {

        int pre = 0, curr = 0;

        for (int i = 0; i < numbs.length; i++) {

            int temp = Math.max(pre + numbs[i], curr);

            pre = curr;
            System.out.println(pre);
            
            curr = temp;
            System.out.println(curr);
        }
        return curr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 3, 5, 15 ,4};
        System.out.println(rob(arr));
    }
}
