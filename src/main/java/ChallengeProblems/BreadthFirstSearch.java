package ChallengeProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public static void doTheThing(){
        Node A = new Node();   Node B = new Node();    Node C = new Node();    Node D = new Node();     Node E = new Node();
        A.value = "A";         B.value = "B";          C.value = "C";          D.value = "D";           E.value = "E";
        A.visited=true;        B.visited=false;        C.visited=false;        D.visited=false;         E.visited=false;

        A.adjList.add(C);
        A.adjList.add(D);

        B.adjList.add(E);

        C.adjList.add(B);
        D.adjList.add(B);

        Queue<Node> q = new LinkedList();
        q.add(A); //Root node
    }

    public static void BFS(Queue<Node> q){
        Node node = q.remove();
        node.visited = true;
        for(Node n : node.adjList){
            if(n.visited == false){
                n.visited = true;
                q.add(n);
            }
        }

    }

    public static class Node {
        String value;
        ArrayList<Node> adjList = new ArrayList<>();
        boolean visited;
    }
}
