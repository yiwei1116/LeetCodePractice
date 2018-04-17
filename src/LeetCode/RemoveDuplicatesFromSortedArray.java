package LeetCode;



/**
 * Created by yiwei on 2018/4/16.
 */
public class RemoveDuplicatesFromSortedArray {



    public static int removeDuplicates(int[] nums) {


/*        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums)
            if (n > nums[i - 1])
                nums[i++] = n;
        return i;
    }*/

        if(nums.length==0 )return 0;
        int i=0 ;

        for (int j = 1 ; j < nums.length ; j++){

            if ( nums[i] != nums[j] ){

                    i++;
                nums[i] = nums[j];

            }

        }

        return i+1 ;

    }
}
