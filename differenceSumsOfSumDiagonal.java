
// JAVA Code for Find difference between sums
// of two diagonals
import java.io.*;

class differenceSumsOfSumDiagonal {

	public static int difference(int arr[][]) {
		// Initialize sums of diagonals
		int d1 = 0, d2 = 0;
		int n = arr.length;

		// rows 
		for (int i = 0; i < n; i++) {
			// columns 
			for (int j = 0; j < n; j++) {
				// finding sum of primary diagonal, from left to right \
				if (i == j) {
					d1 += arr[i][j];
					System.out.println(arr[i][j]);
				}
				// finding sum of secondary diagonal, from right to left /
				if (i == n - j - 1) {
					d2 += arr[i][j];
				}
			}
		}
		// System.out.println(d1);

		// // rows 
		// for (int i = 0; i < n; i++) { //int j = 0; j < n; j++
		// 	// columns 
		// 	for (int j = 2; j >= 0; j--) {//int i = 2; i >= 0; i--
		// 		// finding sum of primary diagonal, from left to right \
		// 		if (i == j) {
		// 			d2 += arr[i][j];
		// 			System.out.println(arr[i][j]);
		// 		}
		// 		// finding sum of secondary diagonal, from right to left /
		// 		// if (i == n - j - 1)
		// 		// System.out.println(n-j-1);
		// 		// 	d2 += arr[i][j];
		// 	}
		// }
		// System.out.println(d2);

		// Absolute difference of the sums
		// across the diagonals
		return Math.abs(d1 - d2);
	}

	/* Driver program to test above function */
	public static void main(String[] args) {

		int arr[][] = {
				{ 11, 2, 4 },
				{ 4, 5, 6 },
				{ 10, 8, -12 }
		};

		System.out.print(difference(arr));

	}
}
// This code is contributed by Arnav Kr. Mandal.
