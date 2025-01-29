
public class checkNumberOfVowelsandConsonants {

    public static void main(String[] args) {

        System.out.println("hello there");
        String str = "aniketaeiofsfsffsf";

        int strL = str.toLowerCase().length();
        char[] chArr = str.toCharArray();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < strL; i++) {

            char ch = chArr[i];
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("the vowels and the consonants are respectively:- " + vowels + " and " + consonants );
    }
}