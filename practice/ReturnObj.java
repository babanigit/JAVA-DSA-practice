package practice;
class One {
    int a, b;

    One(int i, int j) {
        a = i;
        b = j;
    }

    One method1() {
        System.out.println("hello method1");

        One temp = new One(a, b);
        temp.a *= 2;
        temp.b /= 2;

        return temp;
    }

}

public class ReturnObj {
    public static void main(String[] args) {

        One obj = new One(10, 20);
        obj.method1();
    }
}
