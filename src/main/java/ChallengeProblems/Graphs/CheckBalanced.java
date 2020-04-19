package ChallengeProblems.Graphs;

import ChallengeProblems.HelperFunctions.BinarySearchTree.BSTNode;
import ChallengeProblems.HelperFunctions.BinarySearchTree.BinarySearchTree;

public class CheckBalanced {
    //Based off of Cracking the Coding Interview 4.4
    public static void doTheThing() throws Exception {
        BinarySearchTree bst = new BinarySearchTree(50);
        bst.add(39);
        bst.add(40);
        bst.add(21);

        bst.add(52);
        bst.add(51);
        bst.add(83);
        bst.add(84);
        bst.add(85);

        int x = getSubTreeHeight(bst.root, 1);
        System.out.println(x);
        System.out.println(Integer.MIN_VALUE);
    }

    public static int getSubTreeHeight(BSTNode getHeight, int currHeight) throws Exception {
        int leftHeight=0;
        int rightHeight=0;

        if (getHeight.left == null && getHeight.right == null)
            return 1;

        if (getHeight.left != null) {
            leftHeight += getSubTreeHeight(getHeight.left, currHeight + 1); //left
        }
        if (getHeight.right != null) {
            rightHeight += getSubTreeHeight(getHeight.right, currHeight + 1); // right
        }
        if(leftHeight==rightHeight){
            return leftHeight+1;
        }
        if(leftHeight==-1 || rightHeight == -1)
            return -1;

        if(leftHeight!=rightHeight){
            if(leftHeight-1==rightHeight){
                return leftHeight+1;
            }
            if(rightHeight-1==leftHeight){
                return rightHeight+1;
            }
            if(leftHeight>rightHeight){
                throw new Exception("Uneven Tree"); //This is the key. You have to throw an exception to save a bit on
                // runtime
            }
            if(leftHeight<rightHeight){
                throw new Exception("Uneven Tree");
            }
        }
        return 0;
    }
}
