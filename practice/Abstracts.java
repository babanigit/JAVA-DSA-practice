package practice;
 class A {
    // abstract void meth();

    void meth1() {
        System.out.println("method in abstract class A");
    }
}

class B extends A {
    void meth() {
        System.out.println("implement the abstract method of superclass A");
    }
}

public class Abstracts {

    public static void main(String[] args) {
        B b = new B();
        b.meth();
        b.meth1();

    }
}
