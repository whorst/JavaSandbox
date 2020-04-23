package ChallengeProblems.Graphs;

import ChallengeProblems.HelperFunctions.LookAtThisGraph.Graph;
import ChallengeProblems.HelperFunctions.LookAtThisGraph.GraphNode;

import java.util.ArrayList;

public class BuildOrder {
    public static void doTheThing() {
        ArrayList<ArrayList<String>> pairAl = new ArrayList();
        ArrayList<String> nodeValueList = new ArrayList();

        ArrayList pairOne = new ArrayList();
        ArrayList pairTwo = new ArrayList();
        ArrayList pairThree = new ArrayList();
        pairOne.add("A");
        pairOne.add("D");
        pairTwo.add("F");
        pairTwo.add("B");
        pairThree.add("B");
        pairThree.add("D");

        ArrayList pairFour = new ArrayList();
        ArrayList pairFive = new ArrayList();
        pairFour.add("F");
        pairFour.add("A");
        pairFive.add("D");
        pairFive.add("C");

        pairAl.add(pairOne);
        pairAl.add(pairTwo);
        pairAl.add(pairThree);
        pairAl.add(pairFour);
        pairAl.add(pairFive);

        nodeValueList.add("A");
        nodeValueList.add("B");
        nodeValueList.add("C");
        nodeValueList.add("D");
        nodeValueList.add("E");
        nodeValueList.add("F");

        Graph graphOfNodes = buildGraph(nodeValueList, pairAl);
        findBuildOrder(graphOfNodes);

    }

    public static Graph buildGraph(ArrayList<String> projectList, ArrayList<ArrayList<String>> pairList) {
        ArrayList<GraphNode> graphNodes = new ArrayList<>();
        for (String alph : projectList) {
            graphNodes.add(new GraphNode(alph));
        }

        Graph graph = new Graph(graphNodes);

        for (ArrayList<String> pair : pairList) {
            GraphNode dependentNode = graph.getNodeFromList(pair.get(1));
            GraphNode node = graph.getNodeFromList(pair.get(0));
            dependentNode.parents.add(node);
            node.children.add(dependentNode);
        }
        return graph;
    }

    public static void findBuildOrder(Graph graph) {
        ArrayList<GraphNode> dependents = new ArrayList();
        for (GraphNode node : graph.nodeList) {         //First, find the node with no dependencies
            if(node.parents.isEmpty()){
                System.out.println(">>>>"+node.value);
                dependents.add(node);
            }
        }
        for(GraphNode node : dependents){
            graph.breadthFirstSearch(node);//BFS
        }
    }
}
