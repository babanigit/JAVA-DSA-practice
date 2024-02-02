import java.util.ArrayList;
import java.util.List;

/**
 * SequentialDigits1291
 */
public class SequentialDigits1291 {



    public static List<Integer> sequentialDigits(int low, int high) {

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i<=9; i++) {
            int num = i;

            for (int j = i+1; j <= 9; j++) {

                // main formula
                //i = 1,j = 2,3,4 num = 12,123,1234
                //i = 2,j = 3,4,5 num = 23, 234 ,345
                num = num * 10 + j;


                if (num >= low && num <= high){
                    list.add(num);
                }
            }
        }

        list.sort(null);


        return list ;
    }


    public static void main(String[] args) {
        int low = 100;
        int high = 300; 
        List<Integer> data = sequentialDigits(low,high);
        System.out.println(data);
    }
    

    // low = 100, high = 300
}