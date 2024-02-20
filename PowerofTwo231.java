public class PowerofTwo231 {

    public static boolean isPowerOfTwo(int n) {

        for (int i = 0; i < 20; i++) {
            int ans = (int) Math.pow(2, i);

            if (ans == n) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 16;

        System.out.println(isPowerOfTwo(n));
    }
}
