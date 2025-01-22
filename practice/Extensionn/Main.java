
public class Main {

    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Middle Element: " + list.getMiddleElement()); // C
    }
}
