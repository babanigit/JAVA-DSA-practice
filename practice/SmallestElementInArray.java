public class SmallestElementInArray {
    public static void main(String[] args) {

        int[] numArr = { 6, 3, 8, 5, 7, 2, 9 };
        int minVal = Integer.MAX_VALUE;

        for (int num : numArr) {
            if (num < minVal) {
                minVal = num;
            }
        }
        
        System.out.println(" the min value:- " + minVal);
    }
}
