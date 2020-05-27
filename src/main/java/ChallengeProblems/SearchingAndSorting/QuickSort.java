package ChallengeProblems.SearchingAndSorting;

public class QuickSort {
    public static void doTheThing() {

        int[] myArr = {2, 6, 5, 3, 8, 7, 1, 0};
        quickSort(myArr, 0, myArr.length - 1);
        System.out.println(myArr);

    }

    public static void quickSort(int[] arr, int left, int right) {
        /*
         * Pick a random element and partition the array, such that all numbers that are less than the partitioned element come
         * before and greater than come after.
         * */
        int index = partition(arr, left, right);
        if(left<index-1){
            quickSort(arr,left,index-1);
        }
        if(index<right){
            quickSort(arr,index,right);
        }

    }

    public static int partition(int[] arr, int left, int right) {
        //Find the pivot first
        int pivot = arr[(left + right) / 2];

        //Find the element on the left that should be on the right
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }

            //Find element on right tht should be on left
            while (arr[right] > pivot) {
                right--;
            }
            //swap those two elements
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap(int[] arr, int left, int right) {
        int placeholder = arr[left];
        arr[left] = arr[right];
        arr[right] = placeholder;
    }
}
