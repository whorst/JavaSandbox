package ChallengeProblems.Recursion;
//Cracking the Coding Interview, 8.3
public class MagicIndex {

    static int[] numbers = {3, 2, 5, 5, 8, 9, 1, 4, 8, 5, 6};

    public static void findMid(){

        System.out.println(findMidRecursive(0, numbers.length, numbers));
    }

    private static int findMidRecursive(int start, int end, int[] arr) {

        int midIndex = end/2;
        if(midIndex<=0){
            return -1;
        }
        int midVal = arr[midIndex];
        if(midIndex==midVal){
            return midIndex;
        }

        //left
        int leftStart = start;
        int leftEnd = midIndex-1;
        int leftRes = findMidRecursive(leftStart, leftEnd, arr);
        if (leftRes != -1)
            return leftRes;

        midIndex = arr.length/2;

        int rightStart = midIndex+1;
        int rightEnd = arr.length-1;
        int rightRes = findMidRecursive(rightStart, rightEnd, arr);
        return rightRes;
    }
}
