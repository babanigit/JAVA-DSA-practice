public class StringToCharArray {

    public static void main(String[] args) {

        String str = "aniket";
        Character charArr[] = new Character[str.length()];

        int i = 0;
        for (char ch : str.toCharArray()) {
            charArr[i] = ch;
            i++;
        }

        // Printing using loop
        System.out.print("Character Array using loop: ");
        for (char ch : charArr) {
            System.out.print(ch + "");
        }

    }
}
