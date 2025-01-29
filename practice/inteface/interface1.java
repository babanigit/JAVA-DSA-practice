
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A {
    @Override
    public void methodA() {
        System.out.println("Method A");
    }

}

class D extends C implements B {

    public void methodB() {
        System.out.println("Method B");
    }
}

public class interface1 {

    public static void main(String[] args) {
        D obj = new D();
        obj.methodA(); // Output: Method A
        obj.methodB(); // Output: Method B
        // obj.methodD(); // Output: Method D

    }

}
