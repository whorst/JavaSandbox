package ChallengeProblems.ArraysAndStrings;

import java.util.HashMap;

public class PalindromePermutation {
    //A palindrome is a word that is spelt the same forward and backwards.
    //Input is a permutation of a palindrome
    //Based on 1.5

    public static void doTheThing() {
        System.out.println(isPalindromePermutation("toac cat"));
        //Check the bit shift problem for this
    }

    private static boolean isPalindromePermutation(String theString) {
        //You dont know what the permutations are, you just need to know that there are permutations. This is one way to do it, less runtime
        theString = theString.replaceAll("\\s", "");

        int[] occurrences = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < theString.length(); i++) {
            int charNumValue = Character.getNumericValue(theString.charAt(i));
            occurrences[charNumValue] += 1;
        }

        char theMiddle = (char) -1;

        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] % 2 != 0) {
                if (theMiddle == (char) -1) {
                    theMiddle = (char) (i + 87);
                }else{
                    return false;
                }
            }
        }

        return true;
    }
}
