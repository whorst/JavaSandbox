package ChallengeProblems.HelperFunctions;

import java.util.ArrayList;

public class MakeMeAGraph {

    public static Node giveMeADirectedGraph(){
        /*
        * a ----->d
        * |       |
        * |       |
        * V       V
        * c ----> b---> e
        *
        * */

        Node A = new Node();   Node B = new Node();    Node C = new Node();    Node D = new Node();     Node E = new Node();
        A.value = "A";         B.value = "B";          C.value = "C";          D.value = "D";           E.value = "E";
        A.visited=true;        B.visited=false;        C.visited=false;        D.visited=false;         E.visited=false;

        A.adjList.add(C);
        A.adjList.add(D);

        B.adjList.add(E);

        C.adjList.add(B);
        D.adjList.add(B);

        return A;
    }

    public static class Node {
        public String value;
        public ArrayList<Node> adjList = new ArrayList<>();
        public boolean visited;
    }
}
