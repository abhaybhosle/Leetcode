/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateDiameter(root);
        return diameter;
    }

    private int calculateDiameter(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = calculateDiameter(root.left);
        int rightHeight = calculateDiameter(root.right);

        // Update diameter if the sum of leftHeight and rightHeight is greater
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return the height of the current subtree
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
