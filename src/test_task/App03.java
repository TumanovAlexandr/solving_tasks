package test_task;

import java.util.Stack;

public class App03 {

//    Given the root of a binary tree, determine if it is a valid binary search tree (BST).
//
//    A valid BST is defined as follows:
//
//    The left subtree of a node contains only nodes with keys less than the node's key.
//    The right subtree of a node contains only nodes with keys greater than the node's key.
//    Both the left and right subtrees must also be binary search trees.

    public static void main(String[] args) {
//        TreeNode treeNode = new TreeNode(2, new TreeNode(1), new TreeNode(3));
//        TreeNode treeNode = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        TreeNode treeNode = new TreeNode(5, new TreeNode(4),
                new TreeNode(6, new TreeNode(3), new TreeNode(7)));
        System.out.println(isValidBST(treeNode));
    }

    //     5
    //  4     6
    //      3   7

    public static boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (prev != null && root.val <= prev.val) return false;
            prev = root;
            root = root.right;
        }
        return true;
    }
}
