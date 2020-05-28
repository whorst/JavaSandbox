package ChallengeProblems.SearchingAndSorting.Helpers;

public class ArrayWithNoSize {
    int [] array;

    public ArrayWithNoSize(int[] numArray){
       this.array = numArray;
   }

   public int getElement(int index){
        if(this.array.length <= index){
            return -1;
        }
        return this.array[index];
   }

}
