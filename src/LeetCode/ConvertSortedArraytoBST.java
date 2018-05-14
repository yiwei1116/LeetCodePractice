package LeetCode;

/**
 * Created by yiwei on 2018/5/14.
 */
public class ConvertSortedArraytoBST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public  TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0 )return null;

        TreeNode Head = Helper(nums,0,nums.length-1);
        return Head;

    }
    public  TreeNode Helper(int[] nums, int str, int end){

        if (str > end)
            return null;
        int mid = (end + str)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = Helper(nums, str, mid-1);
        node.right = Helper(nums, mid+1 , end);

        return node;




    }
}
