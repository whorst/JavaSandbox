package ChallengeProblems.ArraysAndStrings;

public class StringCompression {

    public static void doTheThing(){
        System.out.println(compressionString("aaaaabbbbbbbccdddde"));
    }
    public static String compressionString(String compressionString){

        String toReturn = "";


        char next = compressionString.charAt(1);
        char curr = compressionString.charAt(0);
        int nextIterator = 1;
        String newString = "";
        int charCounter = 1;

        for(int i=0; i<compressionString.length(); i++){
            curr = compressionString.charAt(i);
            if(nextIterator==compressionString.length()-1){
                if(next == curr){
                    charCounter+=1;
                    newString+=curr;
                    newString+=charCounter;
                } else{
                    newString+=curr;
                    newString+="1";
                }
                    continue;
            }

            next = compressionString.charAt((i+1));
            if(next == curr){
                charCounter+=1;
            } else{
                newString+=curr;
                if(charCounter>1){
                    newString+=charCounter;
                }
                charCounter=1;
            }
            nextIterator += 1;
        }
        return newString;
    }
}
