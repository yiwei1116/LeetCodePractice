package LeetCode;

public class ＭaxSubArray {
    public static int maxSubArray(int[] nums) {


        int max = nums[0];
        int Lsum = 0;
        int Rsum = 0;
        int LL = 0 ;
        int RR = 0 ;
        int flag = 0;
        if (nums == null || nums.length == 0 ) return 0;
        for (int i = 1 ; i < nums.length ; i++ ){

            if (max < nums[i])
                max = nums [i];
                flag = i ;
        }
        int left = flag - 1;
        int right = flag + 1 ;
        for (;left >= 0 ; left-- ){

            if (Lsum+nums[left]>Lsum ) {
                Lsum = Lsum + nums[left];
                LL = left;
            }
        }
        for ( ; right < nums.length ; right++){

            if (Rsum+nums[right] >Rsum ) {
                Rsum = Rsum + nums[right];
                RR = right;
            }

        }
        if (Rsum < 0 && Lsum < 0 )
            return max;
        else if (Rsum < 0)
            return max + Lsum;
        else return max + Rsum;




    }
}
