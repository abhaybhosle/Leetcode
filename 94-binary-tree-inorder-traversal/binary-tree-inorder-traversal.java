/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> Traversal(TreeNode root, ArrayList<Integer> arr) {
        if (root != null) {
            Traversal(root.left, arr);
            int currNode = root.val;
            arr.add(currNode);
            Traversal(root.right, arr);
        }
        return arr;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        return Traversal(root, arr);
    }
}