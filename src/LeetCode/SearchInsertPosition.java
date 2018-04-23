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
    public static int searchInsert(int num[], int target) {

        int temp;
        int i;
        for (i = 0; i < num.length; i++) {

            if (target == num[i]) {
                return i;
            }
            if (target < num[i]) {
                    temp  =  num[i];
                    num[i++] = target;
                for (; i < num.length+1 ; i++) {
                    num[i] = temp;
                    

                }
                return i;
            }


        }
        return i;
    }

}
