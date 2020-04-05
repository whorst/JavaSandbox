package ChallengeProblems.Recursion;
//Cracking Coding Interview, 8.1
public class Stairs {

    public int counter = 0;

    public static void stairs(int n){
        System.out.println(getStairs(n));
    }

    public static int getStairs(int n) {
        if(n<0){
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        return getStairs(n-3) + getStairs(n-2) + getStairs(n-1);
    }

}
