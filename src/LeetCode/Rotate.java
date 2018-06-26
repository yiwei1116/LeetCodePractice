package LeetCode;

public class Rotate {


    public static void rotate(int[] nums, int k ){

        int[] temp = new int[nums.length];

        for (int i = 0 ; i < nums.length; i++){

            temp[(i+k) % nums.length] = nums[i];

        }

            nums =temp;


    }





        public static void rotateV2(int[] nums , int k){

            k = k % nums.length;

            reverse(nums, 0, nums.length-1);
            reverse(nums, 0, k-1);
            reverse(nums, k, nums.length-1);





        }
        public static void  reverse(int[] nums, int start, int end){

        int temp;
        while (end > start){

            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }





    }


}
