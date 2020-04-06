package ChallengeProblems.Recursion;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.ArrayList;

public class AllPermutationsOfStringWithDupes {
    //Based off of Cracking the coding Interview 8.7
    public static ArrayList permArray = new ArrayList();

    public static void getPermutations(String ppermString) {
        String permString = ppermString;

        char leftOver[] = permString.toCharArray();
        ArrayList<String> characters = new ArrayList<>();
        for (char perm : leftOver) {
            characters.add(String.valueOf(perm));
        }

        calculatePermutations(characters, "", new ArrayList<String>());
        System.out.println(permArray);
    }

    public static String calculatePermutations(ArrayList<String> leftOver, String theString, ArrayList<String> alreadyVisited) {
        {
            if (theString.length() == 4 && !(permArray.contains(theString))) {
                permArray.add(theString);
                return "";
            }
            for (int i = 0; i < leftOver.size(); i++) {
                String myChar = leftOver.get(i);
                ArrayList<String> newArrayList = (ArrayList<String>) leftOver.clone();

                if (!alreadyVisited.contains(myChar)) {
                    String myString = theString + myChar;
                    ArrayList <String> alreadyVisitedClone = (ArrayList<String>) alreadyVisited.clone();
                    alreadyVisitedClone.add(myChar);
                    newArrayList.remove(i);
                    calculatePermutations(newArrayList, myString, alreadyVisitedClone);
                }else{
                    ArrayList <String> alreadyVisitedClone = (ArrayList<String>) alreadyVisited.clone();
                    newArrayList.remove(i);
                    calculatePermutations(newArrayList, theString, alreadyVisitedClone);
                }
            }
            return "";
        }
    }
}
