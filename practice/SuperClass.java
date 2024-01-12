package practice;
 class A {



    private int a,b;

    A (int x,int y) {

        a=x;
        b=y;
    }

    String hello() {
         System.out.println("this is hello function"+ a +b );

        return "returning string from hello fun";
    }
}

public class SuperClass extends A {
    SuperClass(int x, int y) {
        super(x, y);
            // a =x;
            // b =y;
        
    }

    public static void main(String[] args) {

        A a = new A(3,5);
        SuperClass b = new SuperClass(10, 10);

        System.err.println(a.hello());
        System.out.println(b.hello());
    }
}
