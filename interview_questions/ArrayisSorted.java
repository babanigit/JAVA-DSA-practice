
class CheckIfSorted {
	public static boolean CheckIfSortedFun(int[] arr){

		int sort=0;
		int unSort=0;

		for (int i=0;i < arr.length -1 ; i++ ) {
			
			if (arr[i] < arr[i+1]) {
				sort=1;
			}else{
				unSort=1;
			}
		}

		if (sort == 1) {
			return true;
		}else {
			return false;
		}

	}
}


public class ArrayisSorted {

	public static void main(String[] args) {
		
		int[] arr =new int[]{
			1,3,5,6,8
		};


		System.out.println("hello :- "+ CheckIfSorted.CheckIfSortedFun(arr));
	}

}