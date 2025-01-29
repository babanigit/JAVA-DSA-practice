
public class reverseStringUsingSB {

    public static void main(String[] args) {

        String str = "aniket";

        StringBuilder sb = new StringBuilder(str);
        String Reversed = sb.reverse().toString();

        System.out.println(Reversed);
    }
}
