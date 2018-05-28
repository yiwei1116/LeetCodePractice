package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ForkJoinPool;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 * Input: [3,2,3]
 * Output: 3
 *
 * Example 2:
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */

public class MajorityElement {


    public static int majorityElementV1(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length/2];

    }
        public static int majorityElementV2(int[] nums){

            HashMap countNum = new HashMap();
            int halfLength = nums.length/2;

            for (int i = 0 ; i < nums.length; i++){

                if (!countNum.containsKey(nums[i])){
                    countNum.put(nums[i],1);
                }
                else {

                    if ((int)countNum.get(nums[i]) >= halfLength)
                        return nums[i];

                    countNum.put(nums[i],(int)countNum.get(nums[i])+1);

                }

            }
            return nums[0];


        }







}
