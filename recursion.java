public class recursion {

  public static int sum(int k) { // 10,9,8,7,6,..
    if (k > 0) {

      System.out.println(k);

      return k + sum(k - 1);

    } else {
      return 0;
      
    }

  }

  public static void main(String[] args) {
    int result = sum(10);
    System.out.println("main is running");
    System.out.println(result);
  }
}
