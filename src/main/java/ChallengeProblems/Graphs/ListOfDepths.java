package ChallengeProblems.Graphs;

import ChallengeProblems.HelperFunctions.BinarySearchTree.BSTNode;
import ChallengeProblems.HelperFunctions.BinarySearchTree.BinarySearchTree;

import java.util.ArrayList;
import java.util.HashMap;

public class ListOfDepths {
    //Based off of problem 4.3 in Cracking the Coding Interview
    public static void doTheThing() {
        int depthToGet = 5;
        BinarySearchTree bst = new BinarySearchTree(50);
        bst.add(23);
        bst.add(21);
        bst.add(39);
        bst.add(52);
        bst.add(83);
//        bst.add(63);
//        bst.add(68);
        bst.add(66);
//        bst.add(38);
//        bst.add(62);
//        bst.add(37);
        bst.add(9);
        bst.add(4);
        bst.add(32);
        bst.add(53);
        bst.add(22);
        bst.add(16);
//        bst.add(8);
        bst.add(79);
//        bst.add(91);
//        bst.add(13);
        bst.add(31);
//        bst.add(3);
//        bst.add(64);
//        bst.add(1);
//        bst.add(10);
//        bst.add(19);
//        bst.add(93);
//        bst.add(4);

        HashMap<Integer, ArrayList<BSTNode>> hm = new HashMap<>();


        ArrayList<BSTNode> init = new ArrayList<>();
        init.add(bst.root);
        //The first level will be the root node
        hm.put(1, init);
        getTheBstDepth(2, depthToGet, hm);
        for(BSTNode n : hm.get(depthToGet)){
            System.out.println(n.value);
        }
    }

    public static HashMap<Integer, ArrayList<BSTNode>> getTheBstDepth(int curr_depth, int depth, HashMap<Integer, ArrayList<BSTNode>> myHashMap) {
        if (curr_depth > depth) {
            return myHashMap;
        }
        ArrayList<BSTNode> previousArrayList = myHashMap.get(curr_depth - 1);
        ArrayList<BSTNode> newArrayList = new ArrayList<>();

        for (BSTNode previousNode : previousArrayList) {
            getAndAddChildren(previousNode, newArrayList);
        }

        myHashMap.put(curr_depth, newArrayList);
        getTheBstDepth(curr_depth + 1, depth, myHashMap);

        return myHashMap;
    }

    public static void getAndAddChildren(BSTNode myNode, ArrayList<BSTNode> newArrayList) {
        if (myNode.left != null)
            newArrayList.add(myNode.left);
        if (myNode.right != null)
            newArrayList.add(myNode.right);
    }
}
