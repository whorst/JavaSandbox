package ChallengeProblems.Graphs;

import ChallengeProblems.HelperFunctions.LookAtThisGraph.GraphNode;

import java.util.ArrayList;

public class BuildOrder {
    public void doTheThing(){
        ArrayList<ArrayList<String>> pairAl = new ArrayList();

        ArrayList pairOne = new ArrayList();   ArrayList pairTwo = new ArrayList();  ArrayList pairThree = new ArrayList();
        pairOne.add("A"); pairOne.add("D");   pairTwo.add("F"); pairTwo.add("B");  pairThree.add("B"); pairThree.add("D");

        ArrayList pairFour = new ArrayList();  ArrayList pairFive = new ArrayList();
        pairFour.add("F"); pairFour.add("A");  pairFive.add("D"); pairFive.add("C");

        pairAl.add(pairOne); pairAl.add(pairTwo); pairAl.add(pairThree); pairAl.add(pairFour); pairAl.add(pairFive);
    }
    public static void buildGraph(ArrayList<String> projectList, ArrayList<ArrayList<String>> pairList){
        ArrayList<GraphNode> graphNodes = new ArrayList<>();
        for(String alph : projectList){
            graphNodes.add(new GraphNode(alph));
        }

        for(ArrayList<String> pair : pairList){

        }
    }

}
