
public class recursion {

  public static int sum(int k) { // 10,9,8,7,6,..
    if (k > 0) {

      System.out.println(k);

      int j = sum(k-1);


      System.out.println("the value or j is : "+ j + " and K :" + k );
      return k + j;
  
    } else {
      return 0;

    }

  }

  public static void main(String[] args) {

    System.out.println(sum(10));
    System.out.println("main is running");

  }
}
