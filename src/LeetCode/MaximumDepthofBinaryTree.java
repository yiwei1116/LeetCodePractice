package LeetCode;

import java.util.Stack;

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


    /**
     *          DFS  : Two stack to record  => 1. Node
     *                                                      2. level
     *
     *
     */
      public static int maxDepthV2(TreeNode root) {

          Stack <TreeNode> stack = new Stack<>();
          Stack <Integer> value = new Stack<>();
          stack.push(root);
          value.push(1);
          int max = 0;
          while (!stack.isEmpty()) {

              TreeNode node = stack.pop();
              int temp = value.pop();
              max = Math.max(temp, max);
              if (node.left != null) {

                  stack.push(node.left);
                  value.push(temp + 1);
              }
              if (node.right != null) {

                  stack.push(node.right);
                  value.push(temp + 1);
              }

          }

          return max;
      }


          }









