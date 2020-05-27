package ChallengeProblems.SearchingAndSorting;

public class AnagramSort {
    //Based off of 10.2 of cracking the coding interview
    public static void doTheThing() {
        String[] stringArray = {"abc", "sfd", "cab", "nom", "qrs", "mno", "dfs", "dsf", "rsq", "mon", "srq", "bac"};
        anagramSort(stringArray);
        System.out.println("Done");
    }

    public static void anagramSort(String[] anagramArray) {
        quickSort(0, anagramArray.length - 1, anagramArray);
    }

    public static void quickSort(int left, int right, String[] array) {
        int pivot = partition(left, right, array);
        if (left < pivot - 1) {
            quickSort(left, pivot - 1, array);
        }
        if (right > pivot) {
            quickSort(pivot, right, array);
        }
    }


    public static int getNumericValueFromString(String myString) {
        char[] arr = myString.toCharArray();
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            x += Character.getNumericValue(arr[i]);
        }
        return x;
    }

    public static int partition(int left, int right, String[] array) {
        int numericPivotValue = getNumericValueFromString(array[(left+right)/2]); //Dont forget this
        while (left <= right) {   //or the <=

            while (getNumericValueFromString(array[left]) < numericPivotValue) {
                left++;
            }
            while (getNumericValueFromString(array[right]) > numericPivotValue) {
                right--;
            }
            if (getNumericValueFromString(array[left]) >= getNumericValueFromString(array[right])) {
                String temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        return left;
    }
}
