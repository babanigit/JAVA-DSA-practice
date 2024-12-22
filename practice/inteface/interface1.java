
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B");
    }
}

public class interface1 {

    public static void main(String[] args) {
        C obj = new C();
        obj.methodA(); // Output: Method A
        obj.methodB(); // Output: Method B
    }

}
