package ChallengeProblems.Recursion.helpers;

public class disk {
    int diskSize;
    public disk(int numericalValue){
        this.diskSize = numericalValue;
    }

    @Override
    public String toString() {
        return String.valueOf(diskSize);
    }
}
