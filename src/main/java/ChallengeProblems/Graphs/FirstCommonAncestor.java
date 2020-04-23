package ChallengeProblems.Graphs;

import ChallengeProblems.HelperFunctions.BinarySearchTree.BSTNode;
import ChallengeProblems.HelperFunctions.BinarySearchTree.BinarySearchTree;
import ChallengeProblems.HelperFunctions.LookAtThisGraph.GraphNode;

public class FirstCommonAncestor {
    //Based off of cracking the coding interview 4.8
    public static void doTheThing() {
        BinarySearchTree bst = new BinarySearchTree(50);
        bst.add(23);
        bst.add(21);
        bst.add(91);
        bst.add(39);
        bst.add(64);
        bst.add(16); //6 index
        bst.add(52);
        bst.add(83);
        bst.add(32); //9 index
        bst.add(51); //10 index
        bst.add(98); //11 index
//        bst.add(63);
//        bst.add(68);
//        bst.add(66);
//        bst.add(38);
//        bst.add(62);
//        bst.add(37);
//        bst.add(9);
//        bst.add(4);
//        bst.add(53);
//        bst.add(22);
//        bst.add(8);
//        bst.add(79);
//        bst.add(13);
//        bst.add(31);
//        bst.add(3);
//        bst.add(1);
//        bst.add(10);
//        bst.add(19);
//        bst.add(93);

        BSTNode firstChild = bst.nodeHelperList.get(6);
        BSTNode secondChild = bst.nodeHelperList.get(3);

        BSTNode x = getCommonAncestor(firstChild, secondChild, bst);
        System.out.println(x.value);
    }

    public static BSTNode getCommonAncestor(BSTNode firstChild, BSTNode secondChild, BinarySearchTree bst) {
        //My thinking here is to find the depth of the two nodes, and then trace it back until we run into the node on the same level.
        int firstLevel = getNodeLevel(firstChild);//get level of first ancestor
        int secondLevel = getNodeLevel(secondChild);//get level of second ancestor

        if (firstLevel == secondLevel) {
            while (firstChild != secondChild) {
                firstChild = firstChild.parent;
                secondChild = secondChild.parent;
            }
        }

        else if(firstLevel>secondLevel) {
            while (firstLevel > secondLevel) {
                firstChild = firstChild.parent;
                firstLevel -= 1;
            }
            while (firstChild != secondChild) {
                firstChild = firstChild.parent;
                secondChild = secondChild.parent;
            }
        }

        else if (firstLevel<secondLevel) {
            while (firstLevel < secondLevel) {
                secondChild = secondChild.parent;
                secondLevel -= 1;
            }
            while (firstChild != secondChild) {
                firstChild = firstChild.parent;
                secondChild = secondChild.parent;
            }
        }

        return firstChild;
    }

    public static int getNodeLevel(BSTNode node) {
        int i = 1;
        while (node.parent != null) {
            node = node.parent;
            i += 1;
        }
        return i;
    }
}
