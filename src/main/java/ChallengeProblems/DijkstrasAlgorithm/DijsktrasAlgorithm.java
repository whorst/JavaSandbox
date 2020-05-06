package ChallengeProblems.DijkstrasAlgorithm;

import ChallengeProblems.HelperFunctions.LookAtThisWeightedGraph.*;

import java.util.ArrayList;

public class DijsktrasAlgorithm {
    public static void doTheThing() {
        WeightedGraph graph = new WeightedGraph();
        doDijsktrasAlgorithm(graph);
    }

    public static void doDijsktrasAlgorithm(WeightedGraph graph) {
        ArrayList<Integer> order = new ArrayList();
        order.add(0);
        int weightSoFar = 0;
        for (int source = 0; source < graph.vertexArray.length; source++) {
            graph.setAlreadyvisited(source);
            int tempWeight[] = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
            for (int destination = 0; destination < graph.vertexArray.length; destination++) {
                if (graph.weightArray[source][destination] != Integer.MAX_VALUE) {
                    if (!graph.isAlreadyvisited(destination)) {
                        tempWeight[destination] = graph.weightArray[source][destination];
                    }
                }
            }
            int lowestNeighborWeight = Integer.MAX_VALUE;
            int lowestNeighborWeightIndex = Integer.MAX_VALUE;

            for (int tempWeightIterator = 0; tempWeightIterator < 5; tempWeightIterator++) {
                if (tempWeight[tempWeightIterator] != Integer.MAX_VALUE) {
                    int currentlyTrackedWeight = graph.distanceFromOrigin[tempWeightIterator];
                    int newWeight = tempWeight[tempWeightIterator] + weightSoFar;
                    if(newWeight < lowestNeighborWeight){
                            lowestNeighborWeight = newWeight;
                            lowestNeighborWeightIndex = tempWeightIterator;
                    }
                    if(newWeight<currentlyTrackedWeight){
                        graph.distanceFromOrigin[tempWeightIterator] = newWeight;
                    }
                }
            }

            if(lowestNeighborWeightIndex != Integer.MAX_VALUE){
                weightSoFar += lowestNeighborWeight;
                order.add(lowestNeighborWeightIndex);
                source = lowestNeighborWeightIndex -1; //This will iterate over the neighbor node's connections
            }
        }
        System.out.println(order);
        System.out.println(graph.distanceFromOrigin);
    }
}
