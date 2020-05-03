package ChallengeProblems.HelperFunctions.LookAtThisWeightedGraph;

import java.util.LinkedList;

public class WeightedGraph {
    int vertices;
    LinkedList<Edge>[] adjacencylist;

    public WeightedGraph(int vertices) {
        this.vertices = vertices;
        adjacencylist = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjacencylist[i] = new LinkedList<>();
        }
    }


    public void addEdge(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        adjacencylist[source].addFirst(edge); //for directed graph
    }

    public void printGraph(){
        for (int i = 0; i <vertices ; i++) {
            LinkedList<Edge> list = adjacencylist[i];
            for (int j = 0; j <list.size() ; j++) {
                System.out.println("vertex-" + i + " is connected to " +
                        list.get(j).destination + " with weight " +  list.get(j).weight);
            }
        }
    }
}
