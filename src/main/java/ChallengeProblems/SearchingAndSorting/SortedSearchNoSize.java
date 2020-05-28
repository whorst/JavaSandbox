package ChallengeProblems.SearchingAndSorting;

import ChallengeProblems.SearchingAndSorting.Helpers.ArrayWithNoSize;

public class SortedSearchNoSize {
    //Based off of Cracking the Coding Interview 10.4
    public static void doTheThing(){
        int[] myArr = {0,2,4,5,20,28,200,213,215};
        int elementToFind = 213;
        int index = elementToFind;
        ArrayWithNoSize noSizeArray = new ArrayWithNoSize(myArr);
        int foundIndex = sortedSearchNoSize(noSizeArray, elementToFind);
        System.out.println(foundIndex);
    }

    public static int sortedSearchNoSize(ArrayWithNoSize noSizeArray, int elementToFind){
        //We can search by
        int index = 1;
        while(noSizeArray.getElement(index) != -1 && noSizeArray.getElement(index) < elementToFind) {
            index *=2;
        }
        return binarySearch(noSizeArray, elementToFind, index/2, index);
    }

    public static int binarySearch(ArrayWithNoSize arr, int value, int low, int high){
        int mid;

        while(low <= high ){
            mid = (low + high) / 2;
            int middle = arr.getElement(mid);
            if(middle > value || middle == -1){
                high = mid -1;
            }else if (middle < value) {
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
