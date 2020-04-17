package ChallengeProblems.Recursion;

import java.util.Arrays;

public class PaintFill {

    //Based on Cracking the Coding Interview 8.10
    //This is actually the correct solution first time lmao
    public static void start() {

        int[][] myArr = new int[4][4];
        myArr[0][0] = 2;
        myArr[0][1] = 0;
        myArr[0][2] = 0;
        myArr[0][3] = 0;
        myArr[1][0] = 2;
        myArr[1][1] = 3;
        myArr[1][2] = 3;
        myArr[1][3] = 3;
        myArr[2][0] = 2;
        myArr[2][1] = 0;
        myArr[2][2] = 0;
        myArr[2][3] = 0;
        myArr[3][0] = 0;
        myArr[3][1] = 0;
        myArr[3][2] = 0;
        myArr[3][3] = 0;


        paintFill(2,2, 1,null,4,4, myArr);

        for(int[] x: myArr)
            System.out.println(Arrays.toString(x));
    }

    public static void paintFill(int row, int col, int newColor, Integer oldColor, int rowSize, int colSize, int [][] myArr) {

        if(oldColor == null){
            oldColor = myArr[row][col];
        }

        if(row > rowSize-1 || row<0)
            return;
        if(col > colSize-1 || col<0)
            return;

        if(myArr[row][col] != oldColor){
            return;
        }

        if(myArr[row][col] == oldColor){
            myArr[row][col] = newColor;
        }

        paintFill(row+1, col, newColor, oldColor, rowSize, colSize, myArr); //up
        paintFill(row-1, col, newColor, oldColor, rowSize, colSize, myArr); //down
        paintFill(row, col-1, newColor, oldColor, rowSize, colSize, myArr); //left
        paintFill(row, col+1, newColor, oldColor, rowSize, colSize, myArr); //right

    }

}
