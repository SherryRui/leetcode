/**

 * Definition for a binary tree node.

 * public class TreeNode {

 *     int val;

 *     TreeNode left;

 *     TreeNode right;

 *     TreeNode(int x) { val = x; }

 * }

 */

public class Solution {

    public boolean isSymmetric(TreeNode root) {

        return isSymmetric(root,root);

    }
   /*
    *一棵树，如果和自己本身对称，那么这棵树本身也是对称的
    */
    public boolean isSymmetric(TreeNode p,TreeNode q)  {

        if(p == null && q == null)

            return true;

        if(p == null || q == null)

            return false;    

        return p.val == q.val && isSymmetric(p.left,q.right) && isSymmetric(p.right,q.left);

    }

}
