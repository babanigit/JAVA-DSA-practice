class TwoSum {

    static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            System.out.println(i);

            for (int j = i + 1; j < nums.length; j++) {
                System.out.println(j);
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] x = { 2, 7, 11, 15, 2, 10, 7 };

        int[] data = twoSum(x, 9);

        for (int element : data) {

            System.out.print(element);
        }
    }

    /*
     * {5,2,4}
     * 6
     */
}