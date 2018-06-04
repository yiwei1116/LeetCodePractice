package LeetCode;

public class Rotate {


    public static void rotate(int[] nums, int k ){

        int[] temp = new int[nums.length];

        for (int i = 0 ; i < nums.length; i++){

            temp[(i+k) % nums.length] = nums[i];

        }

            nums =temp;


    }


}
