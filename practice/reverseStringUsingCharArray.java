public class reverseStringUsingCharArray {

    public static void main(String[] args) {
        
        String str = "aniket";
        char[] char1 = str.toCharArray();
        
        // Initialize char2 with the same length as char1
        char[] char2 = new char[char1.length];

        System.out.println("the length of char2 :- " + char2.length);

// method1
        int i =0;
        for (int j = char1.length - 1; j >= 0 ; j--) {
            char2[i] = char1[j]; // Reverse order assignment
            i++;
        }

// // method2
//         for (int j = 0; j < char1.length;  j++) {
//             char2[char1.length -1 - j] = char1[j]; // Reverse order assignment
//         }


        System.out.println("Reversed string is: " + new String(char2));
    }
}
