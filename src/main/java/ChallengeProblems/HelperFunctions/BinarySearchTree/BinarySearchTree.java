package ChallengeProblems.HelperFunctions.BinarySearchTree;

import ChallengeProblems.HelperFunctions.LookAtThisGraph.GraphNode;

import java.util.ArrayList;

public class BinarySearchTree {
    public BSTNode root;
    public ArrayList<BSTNode> nodeHelperList = new ArrayList<>();

    public BinarySearchTree(int rootInt) {
        this.root = new BSTNode(rootInt);
        nodeHelperList.add(this.root);
    }

    public void add(int numberToAdd) {
        BSTNode nodeToAdd = new BSTNode(numberToAdd);
        BSTNode nodeToAppendTo = root;
        while (nodeToAppendTo != null) {

            if (nodeToAdd.value > nodeToAppendTo.value) {  //Add to the right
                if (nodeToAppendTo.right == null) {
                    nodeToAppendTo.right = nodeToAdd;
                    nodeToAdd.parent = nodeToAppendTo;
                    nodeHelperList.add(nodeToAdd);
                    return;
                }
                nodeToAppendTo = nodeToAppendTo.right;
            }
            if (nodeToAdd.value < nodeToAppendTo.value) { //Add to the left
                if (nodeToAppendTo.left == null) {
                    nodeToAppendTo.left = nodeToAdd;
                    nodeToAdd.parent = nodeToAppendTo;
                    nodeHelperList.add(nodeToAdd);
                    return;
                }
                nodeToAppendTo = nodeToAppendTo.left;
            }
            if (nodeToAdd.value == nodeToAppendTo.value) {
                System.out.println("You are adding a duplicate");
                return;
            }
        }
    }
}
