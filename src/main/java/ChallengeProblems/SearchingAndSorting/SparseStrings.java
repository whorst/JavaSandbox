package ChallengeProblems.SearchingAndSorting;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class SparseStrings {
    public static void doTheThing() {
        String[] myArray = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        sparseSearch(myArray);
    }

    public static void sparseSearch(String[] arr) {
        int low = 0;
        int high = arr.length-1;
        System.out.println(binarySearch(arr, low, high, "dad"));
    }

    public static int binarySearch(String[] arr, int low, int high, String stringToFind) {
        int middle = ((high-low)/2)+low;
        int middleHigh = middle;
        int middleLow = middle;
        while(arr[middleHigh].equals("") && arr[middleLow].equals("")){
            if(middleHigh<high)
                middleHigh++;
            if(!arr[middleHigh].equals("")){
                middle=middleHigh;
                break;
            }
            if(middleLow>low)
                middleLow--;
            if(!arr[middleLow].equals("")){
                middle=middleLow;
                break;
            }
        }
        String middleString = arr[middle];
        if(middleString.equals(stringToFind)){
            return middle;
        }
        if(middleString.charAt(0) > stringToFind.charAt(0)){
          return binarySearch(arr, low, middle-1, stringToFind);
        }
        if(middleString.charAt(0) < stringToFind.charAt(0)){
           return binarySearch(arr, middle, high, stringToFind);
        }
        return -1;
    }
}
