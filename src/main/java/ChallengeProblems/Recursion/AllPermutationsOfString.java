package ChallengeProblems.Recursion;

import java.util.ArrayList;
import java.util.Stack;

public class AllPermutationsOfString {
    //Based off of Cracking the coding Interview 8.7
    public static ArrayList permArray = new ArrayList();

    public static void getPermutations(String ppermString) {
        String permString = ppermString;

        char leftOver[] = permString.toCharArray();
        ArrayList<String> characters = new ArrayList<>();
        for (char perm : leftOver) {
            characters.add(String.valueOf(perm));
        }

        calculatePermutations(characters, "");
        System.out.println(permArray.size());
    }

    public static String calculatePermutations(ArrayList<String> leftOver, String theString) {
        {
            if(leftOver.size()==0){
                permArray.add(theString);
                return "";
            }
            for (int i = 0; i < leftOver.size(); i++) {
               String myString = theString + leftOver.get(i);
                ArrayList<String> newArrayList = (ArrayList<String>) leftOver.clone();
                newArrayList.remove(i);
                calculatePermutations(newArrayList, myString);
            }
            return "";
        }
    }
}
