/*
100. Same Tree: https://leetcode.com/problems/same-tree/
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
*/




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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: both nodes are null, meaning we reached the end of identical paths
        if (p == null && q == null) {
            return true;
        }
        
        // Base case: one node is null and the other is not, meaning structural difference
        if (p == null || q == null) {
            return false;
        }
        
        // Base case: the values of the current nodes do not match
        if (p.val != q.val) {
            return false;
        }
        
        // Recursively check if the left subtrees and right subtrees match
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
