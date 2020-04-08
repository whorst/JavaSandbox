package ChallengeProblems.Recursion;

import java.util.Stack;

public class Parenthesis {
    public static void allParens(int pairs) {
        Stack<String> leftSide = new Stack<>();
        Stack<String> rightSide = new Stack<>();
        for (int i = 0; i < pairs; i++) {
            leftSide.push("(");
            rightSide.push(")");
        }
        getTheParensPairs(leftSide, rightSide, "");
    }

    public static void getTheParensPairs(Stack<String> leftSide, Stack<String> rightSide, String newString) {
        if (leftSide.empty() && rightSide.empty()) {
            System.out.println(newString);
            return;
        }
        if (leftSide.capacity() > rightSide.capacity()) {
            return;
        }
        if (!leftSide.empty()) {
            Stack<String> newLeft = (Stack<String>) leftSide.clone();
            getTheParensPairs(newLeft, rightSide, newString + newLeft.pop());
        }
        if (!rightSide.empty()) {
            Stack<String> newRight = (Stack<String>) rightSide.clone();
            getTheParensPairs(leftSide, newRight, newString + newRight.pop());
        }
    }
}
