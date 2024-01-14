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

    public ArrayList<Integer> Traversal(TreeNode root, ArrayList<Integer> arr) {
        if (root != null) {
            Traversal(root.left, arr);
            Traversal(root.right, arr);
            int currNode = root.val;
            arr.add(currNode);
        }
        return arr;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        return Traversal(root, arr);
    }
}