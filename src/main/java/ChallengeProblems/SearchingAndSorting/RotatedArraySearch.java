package ChallengeProblems.SearchingAndSorting;

public class RotatedArraySearch {
    //Based off of cracking the coding interview 10.3
    public static void doTheThing(){
        int elementToFind = 5;
        int[] intArray = {15,16,19,20,25,1,3,4,5,7,10,14};
        System.out.println(getRotated(elementToFind, intArray, 0, 11));
    }
    public static int getRotated(int elem, int[] elementArray, int lowIndex, int highIndex){
        if((lowIndex<highIndex-1) !=true){
            return Integer.MIN_VALUE;
        }
        int middleIndex = ((highIndex+lowIndex)/2); //This was a problem
        if(elementArray[middleIndex]!=elem) {
            int left = getRotated(elem, elementArray, lowIndex, middleIndex-1); //search left
            int right = getRotated(elem, elementArray, middleIndex, highIndex); //search right

            if(left!=Integer.MIN_VALUE)
                return left;
            if(right!=Integer.MIN_VALUE)
                return right;
        } else{
            return middleIndex;
        }

        return Integer.MIN_VALUE;
    }
}
