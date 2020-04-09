package ChallengeProblems.Recursion;
//Based off of Cracking the Coding Interview 8.11
public class Coins {
    public static int ways = 0;
    //Based off of 8.11 Cracking the coding interview
    public static void coins(int cents){
        getCents(cents);
        System.out.println(ways);
    }
    public static void getCents(int cents){
        if(cents< 0)
            return;
        if(cents==0){
            ways+=1;
        }
        getCents(cents-25);
        getCents(cents-10);
        getCents(cents-5);
        getCents(cents-1);
    }
}
