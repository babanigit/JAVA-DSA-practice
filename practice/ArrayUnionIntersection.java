import java.util.*;

public class ArrayUnionIntersection {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5, 7 };
        int[] arr2 = { 2, 3, 5, 6 };

        // Find Union
        Set<Integer> unionSet = new HashSet<>();
        for (int num : arr1) {
            unionSet.add(num);
        }
        for (int num : arr2) {
            unionSet.add(num);
        }

        // Find Intersection
        Set<Integer> intersectionSet = new HashSet<>();
        Set<Integer> tempSet = new HashSet<>();
        for (int num : arr1) {
            tempSet.add(num);
        }
        for (int num : arr2) {
            if (tempSet.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Display Results
        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }
}
