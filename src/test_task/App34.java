package test_task;

public class App34 {
    int nodeIndex = 0;

    public static void main(String[] args) {
        int[] arr = {8, 5, 1, 7, 10, 12};
        App34 app = new App34();
        TreeNode node = app.bstFromPreorder(arr);
        app.printTree(node);
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null) return null;
        return helper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode helper(int[] preorder, int start, int end) {
        if (nodeIndex == preorder.length || preorder[nodeIndex] < start ||
                preorder[nodeIndex] > end) {
            return null;
        }
        int val = preorder[nodeIndex++];
        TreeNode node = new TreeNode(val);
        node.left = helper(preorder, start, val);
        node.right = helper(preorder, val, end);
        return node;
    }

    private void printTree(TreeNode node) {
        if (node == null) return;
        printTree(node.left);
        System.out.println(node.val);
        printTree(node.right);
    }
}
