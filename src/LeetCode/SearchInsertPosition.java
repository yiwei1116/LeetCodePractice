package LeetCode;

public class SearchInsertPosition {
    /***
     * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     *
     * You may assume no duplicates in the array.
     *
     *Example 1:
     * Input: [1,3,5,6], 5
     * Output: 2
     *
     * Example 2:
     * Input: [1,3,5,6], 2
     * Output: 1
     *
     * Example 3:
     * Input: [1,3,5,6], 7
     * Output: 4
     *
     * Example 4:
     *
     * Input: [1,3,5,6], 0
     * Output: 0
     *
     *
     * @param num
     * @param target
     * @return
     */
    public static int searchInsertV1(int num[], int target) {

        int temp;
        int i = 0;
        while (i < num.length) {

            if (target == num[i]) {
                return i;
            }
            if (target < num[i]) {

                return i;
            }

            i++;
        }
        return i;
    }
    //先確



    public static int searchInsertV2(int num[], int target){
        int low = 0, high = num.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(num[mid] == target) return mid;
            else if(num[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;


    }

}
