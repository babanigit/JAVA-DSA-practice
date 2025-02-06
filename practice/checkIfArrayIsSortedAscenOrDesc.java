public class checkIfArrayIsSortedAscenOrDesc {

    public static void main(String[] args) {

        int numArr[] = { 6, 3, 2, 1 };
        boolean isAscen = true, isDescen = true;

        for (int i = 0; i < numArr.length - 1; i++) {
            if (numArr[i] > numArr[i + 1]) {
                isAscen = false;
            } else if (numArr[i] < numArr[i + 1]) {
                isDescen = false;
            }
        }

        if (isAscen) {
            System.out.println("is ascending ");
        }
        if (isDescen) {
            System.out.println("is descending ");
        }
        if (!isAscen && !isDescen) {
            System.out.println("not sorted ");
        }
    }
}
