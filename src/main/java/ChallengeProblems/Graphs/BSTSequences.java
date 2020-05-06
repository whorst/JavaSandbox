package ChallengeProblems.Graphs;

import ChallengeProblems.HelperFunctions.BinarySearchTree.BSTNode;
import ChallengeProblems.HelperFunctions.BinarySearchTree.BinarySearchTree;

import java.util.ArrayList;
import java.util.HashMap;

public class BSTSequences{
    //Based off of Cracking the Coding Interview 4.9
    public static void doTheThing(){
        BinarySearchTree bst = new BinarySearchTree(12);
        bst.add(10);
        bst.add(14);
        bst.add(9);
        bst.add(11);
        bst.add(13);
        bst.add(15); //6 index

        HashMap<Integer, ArrayList<ArrayList<Integer>>> map = new HashMap<>();

        getBSTSequences(bst.root, map, 1);
    }

    public static void getBSTSequences(BSTNode bstNode, HashMap<Integer, ArrayList<ArrayList<Integer>>> map, int depth){
//        map.put(depth+1, )
    }
}
