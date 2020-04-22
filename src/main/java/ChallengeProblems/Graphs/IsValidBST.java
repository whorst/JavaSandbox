package ChallengeProblems.Graphs;

import ChallengeProblems.HelperFunctions.BinarySearchTree.BSTNode;
import ChallengeProblems.HelperFunctions.BinarySearchTree.BinarySearchTree;

public class IsValidBST {
    //Based on Cracking the coding interview 4.5
    public static void doTheThing() {
        BinarySearchTree bst = new BinarySearchTree(50);
        BSTNode k = new BSTNode(49);
        bst.root.right = k;
        bst.add(53);
        bst.add(32);
        bst.add(1);
        bst.add(99);
        bst.add(63);
        bst.add(27);
        bst.add(45);

        try {
            System.out.println(isValidBST(bst.root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isValidBST(BSTNode bstNode) throws Exception {
        //Do an in order traversal
        if (bstNode.left != null) {
            if (bstNode.left.value < bstNode.value) {
                isValidBST(bstNode.left);
            } else {
                throw new Exception("Not Valid BST");
            }
        }
        if (bstNode.right != null) {
            if (bstNode.right.value > bstNode.value) {
                isValidBST(bstNode.right);
            } else {
                throw new Exception("Not Valid BST");
            }
        }
        return true;
    }
}
