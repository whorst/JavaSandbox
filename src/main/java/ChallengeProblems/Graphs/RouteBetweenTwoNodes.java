package ChallengeProblems.Graphs;

import ChallengeProblems.HelperFunctions.MakeMeAGraph;
import ChallengeProblems.HelperFunctions.MakeMeAGraph.*;

import java.util.LinkedList;
import java.util.Queue;

import static ChallengeProblems.HelperFunctions.MakeMeAGraph.giveMeADirectedGraph;

//Given a directed Graph, design an algorithm to find out whether there is a route between two nodes.
//Based off of 4.1
public class RouteBetweenTwoNodes {
    public static void startTheProgram() {
        Node rootNode = giveMeADirectedGraph();
        Queue<Node> bfsQ = new LinkedList();
        bfsQ.add(rootNode);

        System.out.println(BreadthFirstSearch(bfsQ));
    }

    public static Boolean BreadthFirstSearch(Queue q) {
        //Is there a link between A and D??
        while(!q.isEmpty()) {
            Node node = (Node) q.remove();
            if (node.value == "D") {
                return true;
            }
            for (Node n : node.adjList) {
                if(n.value=="D")
                    return true;
                if (n.visited == false) {
                    n.visited = true;
                    q.add(n);
                }
            }
        }
        return false;
    }
}
