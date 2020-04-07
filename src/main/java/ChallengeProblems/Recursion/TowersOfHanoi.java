package ChallengeProblems.Recursion;

import java.util.ArrayList;
import java.util.Stack;

import ChallengeProblems.Recursion.helpers.disk;

public class TowersOfHanoi {
    public static void towersOfHanoi() {
        disk diskOne = new disk(1);
        disk diskTwo = new disk(2);
        disk diskThree = new disk(3);
        disk diskFour = new disk(4);

        Stack stackOne = new Stack();
        Stack stackTwo = new Stack();
        Stack stackThree = new Stack();

        stackOne.push(diskFour);
        stackOne.push(diskThree);
        stackOne.push(diskTwo);
        stackOne.push(diskOne);

        startStacking(4, stackOne, stackTwo, stackThree);
    }
        public static void startStacking(int disks, Stack<disk> from, Stack aux, Stack<disk> to){
            if(disks==1){
                if(!from.empty()){
                    disk x = from.pop();
                    to.push(x);
                }
                return;
            }
            startStacking(disks-1, from, to, aux);
            startStacking(1,       from, aux, to);
            startStacking(disks-1, aux, from, to);
            return;
        }
}
