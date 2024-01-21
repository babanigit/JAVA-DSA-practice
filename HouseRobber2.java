public class HouseRobber2 {

    public static int rob(int[] numbs) {

        int pre = 0, curr = 0;

        for (int i = 0; i < numbs.length; i++) {
            int temp = Math.max(pre + numbs[i], curr);

            pre = curr;
            curr = temp;
        }

        return curr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 3, 5, 15 ,4};
        System.out.println(rob(arr));
    }
}
