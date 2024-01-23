package recursion;
public class recursion {

  public static int sum(int k) { // 10,9,8,7,6,..
    if (k > 0) {

      System.out.println(k);

      System.out.println("running before return");
      return k + sum(k - 1);

    } else {
      return 0;

    }

  }

  public static void main(String[] args) {

    System.out.println(sum(10));
    System.out.println("main is running");

  }
}
