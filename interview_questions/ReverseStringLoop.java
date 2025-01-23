public class ReverseStringLoop {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversed = "";

        System.out.println("string length : " + str.length());

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}
