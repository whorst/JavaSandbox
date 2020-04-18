package ChallengeProblems.Graphs;

import ChallengeProblems.HelperFunctions.BinarySearchTree.BSTNode;
import ChallengeProblems.HelperFunctions.BinarySearchTree.BinarySearchTree;

import java.util.ArrayList;

public class MinimalTree {
    //Given a sorted array make a BST with minimal height
    public static void doTheThing() {
        ArrayList<Integer> myIntArray = new ArrayList<>();
         myIntArray.add(1); myIntArray.add(2); myIntArray.add(3); myIntArray.add(4);
         myIntArray.add(5); myIntArray.add(6); myIntArray.add(7); myIntArray.add(8); myIntArray.add(9);
         myIntArray.add(10); myIntArray.add(11); myIntArray.add(12);

         createMinimalHeightBST(myIntArray);
    }
    public static void createMinimalHeightBST(ArrayList bstArray){
        int arrLength = bstArray.size();
        int half = arrLength/2;

        int halfNumber = (int) bstArray.get(half);
        BinarySearchTree binarySearchTree = new BinarySearchTree(halfNumber);

        //Go backwards and get every other
        for(int i=half-2; i>=0; i-=2){
            int numberToAdd = (int) bstArray.get(i);
            binarySearchTree.add(numberToAdd);
        }
        for(int i=half-1; i>=0; i-=2){
            int numberToAdd = (int) bstArray.get(i);
            binarySearchTree.add(numberToAdd);
        }
        //GoForwards
        for(int i=half+2; i<arrLength; i+=2){
            int numberToAdd = (int) bstArray.get(i);
            binarySearchTree.add(numberToAdd);
        }
        for(int i=half+1; i<arrLength; i+=2){
            int numberToAdd = (int) bstArray.get(i);
            binarySearchTree.add(numberToAdd);
        }
        System.out.println(binarySearchTree.root.left.left.left.value);
        System.out.println(binarySearchTree.root.right.right.left.value);
    }
}
