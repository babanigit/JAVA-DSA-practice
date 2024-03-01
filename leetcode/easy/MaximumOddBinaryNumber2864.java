

/**
 * MaximumOddBinaryNumber2864
 */
public class MaximumOddBinaryNumber2864 {


    public static String maximumOddBinaryNumber(String s) {

        int countOnces=0;
        StringBuilder resuBuilder=new StringBuilder();

        for(char ch:s.toCharArray()){
            if (ch=='1') {
                countOnces++;
            }
        }
        for(int i=0; i<s.length()-1; i++) {
            if (countOnces>1) {
                countOnces--;
                resuBuilder.append('1');
            }else {
                resuBuilder.append('0');
            }
        }
        resuBuilder.append('1');

        return resuBuilder.toString();
    }

    private static char[] getType(char[] charArray) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getType'");
    }

    private static char[] valueof() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'valueof'");
    }

    public static void main(String[] args) {
        
        System.out.println(maximumOddBinaryNumber("01001"));
    }
    
}