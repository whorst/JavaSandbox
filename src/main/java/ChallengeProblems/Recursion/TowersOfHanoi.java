package ChallengeProblems.Recursion;

import java.util.ArrayList;
import java.util.Stack;

import ChallengeProblems.Recursion.helpers.disk;

public class TowersOfHanoi {
    public static void towersOfHanoi() {
        disk diskOne = new disk(1);
        disk diskTwo = new disk(2);
        disk diskThree = new disk(3);

        Stack stackOne = new Stack();
        Stack stackTwo = new Stack();
        Stack stackThree = new Stack();

        stackOne.push(diskThree);
        stackOne.push(diskTwo);
        stackOne.push(diskOne);

        ArrayList <Stack> stackArrayList = new ArrayList();
        stackArrayList.add(stackOne);
        stackArrayList.add(stackTwo);
        stackArrayList.add(stackThree);

        startStacking(stackArrayList);
    }
        public static ArrayList<Stack> startStacking(ArrayList<Stack> stackArrayList){
            Stack stackOne = stackArrayList.get(0);
            Stack stackTwo = stackArrayList.get(1);
            Stack stackThree = stackArrayList.get(2);

            if(stackThree.size() == 3){
                return stackArrayList;
            }

            return stackArrayList;
        }
}
