package LeetCode;

public class ＭaxSubArray {
    public static int maxSubArray(int[] nums) {


        int max = nums[0];
        int Lsum = 0;
        int Rsum = 0;
        int LM = 0 ;
        int RM = 0 ;
        int flag = 0;
        if (nums == null || nums.length == 0 ) return 0;
        for (int i = 1 ; i < nums.length ; i++ ){

            if (max < nums[i]){
                max = nums [i];
                flag = i ;
            }
        }
        int left = flag - 1;
        int right = flag + 1 ;
        for (;left >= 0 ; left-- ){


            if (Lsum+nums[left]> LM ) {

                LM = Lsum + nums[left];
            }
            Lsum = Lsum + nums[left];
        }
        for ( ; right < nums.length ; right++){

            if (Rsum+nums[right] > RM ) {

                RM = Rsum + nums[right];
            }
            Rsum = Rsum + nums[right];

        }
        if (RM < 0 && LM < 0 )
            return max;
        else if (RM >= 0 && LM >= 0 )
            return max + RM + LM;
        else if (RM < 0)
            return max + RM;
        else return max + LM;




    }
}
