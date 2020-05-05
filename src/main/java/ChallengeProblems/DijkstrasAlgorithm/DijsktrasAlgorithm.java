package ChallengeProblems.DijkstrasAlgorithm;

import ChallengeProblems.HelperFunctions.LookAtThisWeightedGraph.*;

public class DijsktrasAlgorithm {
    public static void doTheThing(){
        int vertices = 6;
        WeightedGraph graph = new WeightedGraph(vertices);
        graph.addEdge(0, 1, 6); //A to B
        graph.addEdge(1, 2, 5); //B to C
        graph.addEdge(3, 4, 1); //D to E
        graph.addEdge(4, 2, 5); //E to C
        graph.addEdge(0, 3, 1); //A to D
        graph.addEdge(1, 4, 2); //B to E
        graph.addEdge(3, 1, 2); //D to B
        graph.printGraph();
    }
}
