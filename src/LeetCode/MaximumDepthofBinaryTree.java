package LeetCode;

/**
 * Created by yiwei on 2018/5/10.
 */




public class MaximumDepthofBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static int maxDepth(TreeNode root){

        if(root==null)return 0;



        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));




    }


}
