package ChallengeProblems.HelperFunctions.LookAtThisGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphNode {
    public String value;
    public ArrayList<GraphNode> parents = new ArrayList();
    public ArrayList<GraphNode> children = new ArrayList();
    public boolean visited = false;

    public GraphNode(String myVal) {
        this.value = myVal;
    }

    public void add(GraphNode graphNodeToAdd) {
        children.add(graphNodeToAdd);
    }
}
