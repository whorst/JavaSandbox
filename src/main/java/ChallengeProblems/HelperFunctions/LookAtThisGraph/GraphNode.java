package ChallengeProblems.HelperFunctions.LookAtThisGraph;

import java.util.ArrayList;

public class GraphNode {
    public String value;
    public ArrayList<GraphNode> attachedNodes = new ArrayList();
    public ArrayList<GraphNode> nodesThatDependOn = new ArrayList();
    public boolean visited = false;

    public GraphNode(String myVal) {
        this.value = myVal;
    }

    public void add(GraphNode graphNodeToAdd) {
        attachedNodes.add(graphNodeToAdd);
    }
}
