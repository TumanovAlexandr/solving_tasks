package algorithms.tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySubTree {
    public static void main(String[] args) {
        /*
         * 			1
         * 		   / \
         * 		  2   3
         * 		 / \ / \
         * 		4  5 6  7
         */

        //that's the tree, that we are constructing here.
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
         * 			4
         * 		   / \
         * 		  5   6
         */
        Node root2 = new Node(4);
        root2.left = new Node(5);
        root2.right = new Node(6);

        System.out.println(checkSubtree(root,root.left));	//true
        System.out.println(checkSubtree(root,root2));	//false
    }

    public static boolean checkSubtree(Node tree, Node sub) {

        if (sub == null) return true;

        if (tree == null) return false;

        ArrayList<Integer> first = new ArrayList<>();
        inOrder(tree, first);

        ArrayList<Integer> second = new ArrayList<>();
        inOrder(sub, second);

        if (!listToString(first).contains(listToString(second))) return false;

        first.clear();
        second.clear();

        preOrder(tree, first);
        preOrder(sub, second);

        return listToString(first).contains(listToString(second));
    }

    private static String listToString(List<Integer> list) {
        return list.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
    }

    public static void inOrder(Node root, List<Integer> list) {

        if (root == null) return;

        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }

    public static void preOrder(Node root, List<Integer> list) {

        if (root == null) return;

        list.add(root.data);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}
