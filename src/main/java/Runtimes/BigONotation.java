package Runtimes;

public class BigONotation {
    static void O_Log_N(){
        System.out.println("Halving the data set for every iteration (binary search)");
    }
    static void O_N(){
        System.out.println("Algorithm Runtime increases as the size of the elements of interest increase");
    }

    static void O_N_Log_N(){
        System.out.println("For every element, half the data set for every iteration");
        System.out.println("For each element, you look at less than 50% of the other elements");
    }

    static void O_N_Squared(){
        System.out.println("For every element, visit every single other element");
    }
    static void O_N_Factorial(){
        System.out.println("For each additional element in the list, you'd have to do the entire amount of processing" +
                " you've done so far, for each element.");
    }

    static void O_Branches_To_Depth(){
        System.out.println("A recursive function with multiple branches");
        System.out.println("Two branches at each call is 2^Depth");
    }

    /*
    * A constant is any number that doesnt change, one that doesnt have an indeterminate size. Iterating 1000 times is still
    * O(1)
    *
    * */
}
