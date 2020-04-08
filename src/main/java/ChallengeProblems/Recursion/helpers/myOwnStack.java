package ChallengeProblems.Recursion.helpers;

import java.util.Stack;

public class myOwnStack extends Stack {
    String label;

    public myOwnStack(String myLabel) {
        this.label = myLabel;
    }

    public String getElement(int n) {

        try {
            return (String) this.elementAt(n);
        }catch(Exception e){
            return " ";
        }
    }

    @Override
    public synchronized String toString() {
        return String.format("|%s|\n|%s|\n|%s|\n|%s|\n%s",
                this.getElement(3),
                this.getElement(2),
                this.getElement(1),
                this.getElement(0),
                this.label);
    }
}
