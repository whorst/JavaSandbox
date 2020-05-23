package ChallengeProblems.SearchingAndSorting;

public class MergeSort {
    public static void doTheThing() {
        int[] theArray = {8, 3, 9, 2, 6, 10, 5, 11, 0, 7, 1};
        int[] helper = new int[theArray.length];
        mergeSort(theArray, 0, theArray.length - 1 );
        System.out.println(theArray[1]);
        System.out.println(theArray[11]);
    }

    public static void mergeSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int middle = (highIndex + lowIndex) / 2;
            mergeSort(array, lowIndex, middle);
            mergeSort(array, middle + 1, highIndex);
            merge(array, lowIndex, middle, highIndex);
        }
    }

    public static void merge(int[] array, int lowIndex, int middleIndex, int highIndex) {
        int helper[] = new int[highIndex-lowIndex+1];

        int helperLeft = lowIndex;
        int helperRight = middleIndex + 1;
        int current = 0;

        while (helperLeft <= middleIndex && helperRight <= highIndex) {
            if(array[helperLeft] <= array[helperRight]) {
                helper[current] = array[helperLeft];
                helperLeft++;
                current++;
            }else{
                helper[current] = array[helperRight];
                helperRight++;
                current++;
            }
        }

        while(helperLeft<=middleIndex){
            helper[current] = array[helperLeft];
            current+=1;
            helperLeft+=1;
        }
        while(helperRight<=highIndex){
            helper[current] = array[helperRight];
            current+=1;
            helperRight+=1;
        }

        for(int i=lowIndex; i<=highIndex; i+=1){
            array[i] = helper[i-lowIndex];
        }

    }
}
