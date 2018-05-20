package LeetCode;

public class SingleValue {
    /**
     * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
     *
     * Note:
     * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
     *
     * Example 1:
     * Input: [2,2,1]
     * Output: 1
     *
     * Example 2:
     * Input: [4,1,2,1,2]
     * Output: 4
     */
    public static int singleNumber(int[] num){

        int result = 0;
        for (int i = 0 ; i < num.length ; i++){
        /* XOR  wi cvll return 1 only on two different bit
          So if two numbers are the same, XOR will return 0
           Finally only one left

           A ^ A = 0
           0 ^ B = B
            */
        result = result ^ num[i];

        }

        return result;




    }
}
