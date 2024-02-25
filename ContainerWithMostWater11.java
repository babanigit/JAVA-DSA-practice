public class ContainerWithMostWater11 {

    public static int maxArea(int[] height) {

        int left= 0;
        int right= height.length-1;
        int maxArea=0;

        while (left<right) { //0 8, 1 8, ...
            int currentArea= Math.min(height[left],height[right]) * (right-left); //1*8=8 ,7*7=49 , ...
            // System.out.println("the currentArea is : "+ currentArea);
            maxArea = Math.max(maxArea, currentArea); //8 , 49 , ...
            // System.out.println("the maxArea is : "+ maxArea);

            // increment or decrement
            if (height[left]<height[right]) {
                left++;
            }else{ // if height[left]  >  height[right]
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int [] arr = new int[] {
            1,8,6,2,5,4,8,3,7
        };
        System.out.println(maxArea(arr));
    }
    
}
