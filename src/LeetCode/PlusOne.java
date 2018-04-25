package LeetCode;

public class PlusOne {
    public static int[] plusOne(int digit[]){
        /**
         * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
         * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
         * You may assume the integer does not contain any leading zero, except the number 0 itself.
         *
         * case 1011 1012
         *case  1099 1100
         * case 9999 10000
         */
        if (digit == null || digit.length == 0 ) return digit;

        for ( int i = digit.length - 1 ; i  >= 0 ; i--){

        if ( digit[i] <  9 ){

            digit[i]++;
            return digit;
        }
        digit[i] = 0 ;


        }

        int newDigit[] = new int[digit.length + 1];
        newDigit[0] = 1 ;

       /* for(int j = 1 ; j < newDigit.length ; j++){
           newDigit[j] = 0;
        }*/
        return newDigit;







    }
}
