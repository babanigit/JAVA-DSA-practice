public class HouseRobber {

    public static int rob(int[] nums) {

        int rob = 0;
        int noRob = 0;

        for (int i = 0; i < nums.length; i++) {

            int newRob = noRob + nums[i];
            System.out.println("value of newRob is : " + newRob);

            int newNoRob = Math.max(noRob, rob);
            System.out.println("value of newNoRob is : " + newNoRob);

            rob = newRob;
            System.out.println(rob);
            
            noRob = newNoRob;
            System.out.println(noRob);

        }

        return Math.max(rob, noRob);
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 2, 7, 9, 3, 1 };

        System.out.println(rob(arr));
    }
}
