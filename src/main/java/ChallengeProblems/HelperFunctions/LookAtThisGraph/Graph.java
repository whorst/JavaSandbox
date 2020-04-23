package ChallengeProblems.HelperFunctions.LookAtThisGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    public ArrayList<GraphNode> nodeList;

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public GraphNode getNodeFromList(String value) {
        for (GraphNode node : this.nodeList) {
            if (node.value == value) {
                return node;
            }
        }
        return null;
    }

    public void breadthFirstSearch(GraphNode nodeToBfs) {
        Queue<GraphNode> q = new LinkedList();
        q.add(nodeToBfs);
        while (!q.isEmpty()) {
            GraphNode child = q.remove();
            child.visited = true;
            for (GraphNode childNode : child.children) {
                if (childNode.visited != true) {
                    System.out.println(">>>>>>>>>>>>> " + childNode.value);
                    childNode.visited = true;
                    q.add(childNode);
                }
            }
        }
    }
}
