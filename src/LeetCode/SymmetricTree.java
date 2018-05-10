package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
        public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
      }
        public static boolean isSymmetric(TreeNode root){
            if (root == null) return true;
            return isMirror(root.left,root.right);



        }
        private static boolean isMirror(TreeNode t1, TreeNode t2){

            if ( t1 == null && t2 == null ) return true;
            if ( t1 == null || t2 == null ) return false;
            return (t1.val == t2.val)
                    && isMirror(t1.left , t2.right)
                    && isMirror(t1.right , t2.left);




        }


    /**
     *  Iterative
     */
        public static boolean isSymmetricV2(TreeNode root){

            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            q.add(root);

            while (!q.isEmpty()){


                TreeNode t1 = q.poll();
                TreeNode t2 = q.poll();

                if (t1 == null && t2 == null) continue;
                if (t1 == null || t2 ==null )return false;
                q.add(t1.left);
                q.add(t2.right);
                q.add(t1.right);
                q.add(t2.left);


            }

            return true;









        }

}
