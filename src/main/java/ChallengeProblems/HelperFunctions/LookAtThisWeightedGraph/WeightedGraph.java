package ChallengeProblems.HelperFunctions.LookAtThisWeightedGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
//F
//1
/*|
* A---6---B --5
* |      /|    \
* |     / |     \
  2    /  2      C
  |   2   |     /
* | /     |    /
* D---1---E --5
* */

public class WeightedGraph {
//                            0   1   2   3   4
//
//    HashMap<String, ArrayList<Edge>> adjacencyMap = new HashMap<>();
//    ArrayList<Integer> alreadyVisited = new ArrayList<>();

    public boolean[] alreadyVisited = {false, false, false, false, false, false};
    public int[] distanceFromOrigin = {0,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
    public char [] vertexArray = {'A','B','C','D','E','F'};
    public int[][] weightArray;


    public WeightedGraph() {
        this.weightArray = new int[6][6];
        for (int i = 0; i < vertexArray.length; i++) {
            for (int j = 0; j < vertexArray.length; j++) {
                weightArray[i][j] = Integer.MAX_VALUE;
            }
        }

        createEdge('A', 'B', 6);
        createEdge('A', 'F', 1);
        createEdge('A', 'B', 6);
        createEdge('A', 'D', 2);
        createEdge('D', 'B', 2);
        createEdge('D', 'E', 1);
        createEdge('B', 'E', 2);
        createEdge('B', 'C', 5);
        createEdge('E', 'C', 5);
        createEdge('E', 'B', 2);
//        System.out.println(this.weightArray[0][1]);
    }


    public void setAlreadyvisited(int index) {
//        int myIndex = convertToInteger(index);
        this.alreadyVisited[index] = true;
    }

    public boolean isAlreadyvisited(int index) {
//        int myIndex = convertToInteger(index);
        return this.alreadyVisited[index];
    }

    public void createEdge(char src, char dst, int weight) {
        int srcInt = (Character.getNumericValue(src)) - 10;
        int dstInt = (Character.getNumericValue(dst)) - 10;

        this.weightArray[srcInt][dstInt] = weight;
    }



}
