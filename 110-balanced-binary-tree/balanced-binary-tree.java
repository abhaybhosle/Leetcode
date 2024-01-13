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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is considered balanced
        }

        // Check if the left and right subtrees are balanced, and their heights differ by at most 1
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(height(root.left) - height(root.right)) <= 1;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0; // Height of an empty subtree is 0
        }

        // Recursively calculate the height of the left and right subtrees
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Return the height of the subtree rooted at this node (1 + maximum of left and right subtree heights)
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
