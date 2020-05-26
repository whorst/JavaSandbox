package ChallengeProblems.SearchingAndSorting;

public class SortedMerge {
    /*
     *Based off of Cracking the Coding Interview 10.1
     */

    public static void doTheThing() {
        int[] firstArray = new int[10];
        int[] secondArray = new int[3];

        firstArray[0] = 2;
        firstArray[1] = 3;
        firstArray[2] = 4;
        firstArray[3] = 5;
        firstArray[4] = 7;
        firstArray[5] = 9;
        firstArray[6] = 10;

        secondArray[0] = 1;
        secondArray[1] = 11;
        secondArray[2] = 12;

        sortedMerge(firstArray, secondArray);
    }

    public static void sortedMerge(int[] firstArray, int[] secondArray) {
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;

        if (secondArray[secondArrayIndex] < firstArray[firstArrayIndex]) {
            merge(firstArray, secondArray[secondArrayIndex], firstArrayIndex);
            secondArrayIndex++;
        }

        firstArrayIndex++;

        for (int i = firstArrayIndex; i < firstArray.length; i++) {
            if (firstArray[i] < secondArray[secondArrayIndex] && secondArray[secondArrayIndex] < firstArray[i + 1]) {
                merge(firstArray, secondArray[secondArrayIndex], i + 1);
                secondArrayIndex++;
            }
        }
//        if(secondArrayIndex != secondArray.length-1){
//            while(secondArrayIndex<=secondArray.length-1){
//                firstArray[]
//            }
//        }
    }
    public static void merge(int[] myArray, int number, int index){
        int tempLength = myArray.length-index;
        int[] tempArray = new int [tempLength];
        System.arraycopy(myArray, index, tempArray, 0, myArray.length-index);
        myArray[index] = number;
        System.arraycopy(tempArray, 0, myArray, index+1, tempArray.length-1);
//        System.arraycopy(tempArray, 0, myArray, index+1, tempArray.length);
    }
}


