package ChallengeProblems.DijkstrasAlgorithm;

import ChallengeProblems.HelperFunctions.LookAtThisWeightedGraph.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class DijsktrasAlgorithm {
    public static void doTheThing() {
        WeightedGraph graph = new WeightedGraph();
//        doDijsktrasAlgorithm(graph);
//        doDijsktrasAlgorithmTwo(graph);
        doDijsktrasAlgorithmThree(graph);
    }

    public static void doDijsktrasAlgorithmThree(WeightedGraph graph) {
        int verticesVisited = 0;
        int source = 0;
        int weightSoFar = 0;
//        int destination = 0;
        HashMap<Integer, ArrayList> neighborMap = new HashMap<>();
        neighborMap.put(0, new ArrayList());
        neighborMap.put(1, new ArrayList());
        neighborMap.put(2, new ArrayList());
        neighborMap.put(3, new ArrayList());
        neighborMap.put(4, new ArrayList());
        neighborMap.put(5, new ArrayList());
        char[] vertexArray = {'A', 'B', 'C', 'D', 'E', 'F'};
        int[] visitedWeight = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        int[] visitedOrder = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};

        visitedWeight[0] = 0;
        visitedOrder[0] = source;

        while (verticesVisited < vertexArray.length - 1) {
            int[] tempArray = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
            int smallestWeight = Integer.MAX_VALUE;
            int smallestWeightIndex = Integer.MAX_VALUE;

            for (int destination = 0; destination < vertexArray.length; destination += 1) {
                if (graph.weightArray[source][destination] != Integer.MAX_VALUE && destination != source) {
                    if (visitedWeight[destination] == Integer.MAX_VALUE) {   //If not yet visits
                        neighborMap.get(source).add(destination);   //This is where you add to neighbor hashmap
                        tempArray[destination] = graph.weightArray[source][destination];
                        if (graph.weightArray[source][destination] < smallestWeight) {
                            smallestWeight = graph.weightArray[source][destination];
                            smallestWeightIndex = destination;
                        }
                    }
                }
            }
            if (smallestWeight != Integer.MAX_VALUE) {
                visitedWeight[smallestWeightIndex] = smallestWeight + visitedWeight[visitedOrder[verticesVisited]];
                source = smallestWeightIndex;
            }else{
                source = findPreviousNeighborToVisit(visitedOrder[verticesVisited-1], graph, visitedWeight, neighborMap); //vertices visited is pointing at the previous already, no need to do -1
            }
            verticesVisited += 1;
            visitedOrder[verticesVisited] = source;
        }
        System.out.println(visitedWeight);
    }

    private static int findPreviousNeighborToVisit(int previouslyVisitedSource, WeightedGraph graph, int[] visitedWeight, HashMap<Integer, ArrayList> neighborMap) {
//        neighborMap.get(previouslyVisitedSource);
        int indexToVisit = Integer.MAX_VALUE;
        int lowestWeight=Integer.MAX_VALUE;
        for(int i=0; i<neighborMap.get(previouslyVisitedSource).size(); i++){
            int currIndex = (int) neighborMap.get(previouslyVisitedSource).get(i);
            int x = graph.weightArray[previouslyVisitedSource][currIndex];
            if(x < lowestWeight && visitedWeight[currIndex]==Integer.MAX_VALUE){
                lowestWeight = x;
                indexToVisit = currIndex;
            }
        }
        visitedWeight[indexToVisit] = lowestWeight;
        return indexToVisit;
    }


    public static void doDijsktrasAlgorithmTwo(WeightedGraph graph) {
        int verticesVisited = 0;
        int source = 0;
        int destination = 0;
        int weightSoFar = 0;
        Stack<Integer> visitedStack = new Stack<>();
        ArrayList<Integer> order = new ArrayList();

        order.add(source);
        while (verticesVisited != graph.vertexArray.length) {
            graph.setAlreadyvisited(source);
            int tempWeight[] = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
            for (destination = 0; destination < graph.vertexArray.length; destination++) {
                if (graph.weightArray[source][destination] != Integer.MAX_VALUE) {
                    if (!graph.isAlreadyvisited(destination)) {
                        tempWeight[destination] = graph.weightArray[source][destination];
                    }
                }
            }
            int lowestNeighborWeight = Integer.MAX_VALUE;
            int lowestNeighborWeightIndex = Integer.MAX_VALUE;

            int hasNoEdges = 0;
            for (int tempWeightIterator = 0; tempWeightIterator < 6; tempWeightIterator++) {
                if (tempWeight[tempWeightIterator] != Integer.MAX_VALUE) {

                    visitedStack.push(tempWeightIterator);

                    int currentlyTrackedWeight = graph.distanceFromOrigin[tempWeightIterator];
                    int newWeight = tempWeight[tempWeightIterator] + weightSoFar;
                    if (newWeight < lowestNeighborWeight) {
                        lowestNeighborWeight = newWeight;
                        lowestNeighborWeightIndex = tempWeightIterator;
                    }
                    if (newWeight < currentlyTrackedWeight) {
                        graph.distanceFromOrigin[tempWeightIterator] = newWeight;
                    }
                } else {
                    hasNoEdges += 1; //The only way to reasonably do his is to keep a map of key nodes value neighbors and iterate over the previously visited nodes
                }
                if (hasNoEdges == graph.vertexArray.length - 1) {

                    //Check the queue
                }
            }
            if (lowestNeighborWeightIndex != Integer.MAX_VALUE) {
                weightSoFar += lowestNeighborWeight;
                order.add(lowestNeighborWeightIndex);
                source = lowestNeighborWeightIndex; //This will iterate over the neighbor node's connections
            }
            verticesVisited++;
        }
        System.out.println(order);
        System.out.println(graph.distanceFromOrigin);
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

            for (int tempWeightIterator = 0; tempWeightIterator < 6; tempWeightIterator++) {
                if (tempWeight[tempWeightIterator] != Integer.MAX_VALUE) {
                    int currentlyTrackedWeight = graph.distanceFromOrigin[tempWeightIterator];
                    int newWeight = tempWeight[tempWeightIterator] + weightSoFar;
                    if (newWeight < lowestNeighborWeight) {
                        lowestNeighborWeight = newWeight;
                        lowestNeighborWeightIndex = tempWeightIterator;
                    }
                    if (newWeight < currentlyTrackedWeight) {
                        graph.distanceFromOrigin[tempWeightIterator] = newWeight;
                    }
                }
            }

            if (lowestNeighborWeightIndex != Integer.MAX_VALUE) {
                weightSoFar += lowestNeighborWeight;
                order.add(lowestNeighborWeightIndex);
                source = lowestNeighborWeightIndex - 1; //This will iterate over the neighbor node's connections
            }
        }
        System.out.println(order);
        System.out.println(graph.distanceFromOrigin);
    }
}
