package ChallengeProblems.CheckSubtree;

import ChallengeProblems.HelperFunctions.BinarySearchTree.BSTNode;
import ChallengeProblems.HelperFunctions.BinarySearchTree.BinarySearchTree;

public class CheckSubtree {
//Based off of Cracking the coding interview 4.10
    public static void doTheThing() {
        BinarySearchTree bigBst = new BinarySearchTree(23);
        bigBst.add(21);
        bigBst.add(39);
        bigBst.add(52);
        bigBst.add(83);
        bigBst.add(66);
        bigBst.add(9);
        bigBst.add(4);
        bigBst.add(32);
        bigBst.add(53);
        bigBst.add(22);
        bigBst.add(16);
        bigBst.add(79);
        bigBst.add(80);
        bigBst.add(31);

        BinarySearchTree smallBst = new BinarySearchTree(39);
        smallBst.add(32);
        smallBst.add(31);
        smallBst.add(52);
        smallBst.add(83);
        smallBst.add(66);
        smallBst.add(53);
        smallBst.add(79);

        System.out.println(isSubtree(smallBst, bigBst));
    }

    public static boolean isSubtree(BinarySearchTree small, BinarySearchTree big) {
        //This is the solution if there isnt a parent
        //First we have to find the root of the smaller tree in the bigger tree
        int smallRootValue = small.root.value;
        BSTNode pointer = big.root;

        while (pointer.value != smallRootValue) {
            if (smallRootValue < pointer.value)
                pointer = pointer.left;
            else if (smallRootValue > pointer.value) {
                pointer = pointer.right;
            }
            if (pointer == null) {
                return false;
            }
        }

        return isEveryNodeSame(small.root, pointer);
    }

    public static boolean isEveryNodeSame(BSTNode smallNode, BSTNode bigNode) {
        BSTNode bigLeft = bigNode.left;
        BSTNode bigRight = bigNode.right;
        BSTNode smallLeft = smallNode.left;
        BSTNode smallRight = smallNode.right;

        if (bigLeft == null && bigRight == null && smallLeft == null && smallRight == null) {
            return true;
        }

        boolean leftIsEqual;
        boolean rightIsEqual;

        if (bigLeft != null && smallLeft != null) {
            if (bigLeft.value == smallLeft.value)
                leftIsEqual = isEveryNodeSame(bigLeft, smallLeft);
            else {
                leftIsEqual = false;
            }
        } else {
            leftIsEqual = bigLeft == smallLeft;
        }

        if (bigRight != null && smallRight != null) {
            if (bigRight.value == smallRight.value)
                rightIsEqual = isEveryNodeSame(bigRight, smallRight);
            else {
                rightIsEqual = false;
            }
        } else {
            rightIsEqual = bigRight == smallRight;
        }

        if(leftIsEqual==false || rightIsEqual==false)
            return false;
        else{
            return true;
        }
    }
}
