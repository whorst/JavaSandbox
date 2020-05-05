import AbstractClass.AbstractSubClass;
import ChallengeProblems.Graphs.*;
import ChallengeProblems.Recursion.*;
import ChallengeProblems.Recursion.Stairs;
import Interface.InterfaceImplementation;
import Generics.*;
import CollectionsTest.*;
import Lambdas.*;
import Streams.CollectorsTest;
import Streams.NonterminalStreams;
import Streams.TerminalStreams;

import java.util.ArrayList;

//http://tutorials.jenkov.com/java-functional-programming/streams.html

public class main {
    public static void main(String[] args) throws Exception {
//        JavaConcepts();
//        Does_Data_Added_To_ArrayList_In_Method_Persist_After_Method_Returns();
        ChallengeProblems();
    }

    public static void ChallengeProblems() throws Exception {
//        Stairs.stairs(5);
//        MagicIndex.findMid();
//        SubsetsOfASet.subSet();
//        AllPermutationsOfString.getPermutations("abcdef");
//        AllPermutationsOfStringWithDupes.getPermutations("aaabcd");
//        TowersOfHanoi.towersOfHanoi();
//        Parenthesis.allParens(7);
//        Coins.coins(25);
//        PaintFill.start();
//        RouteBetweenTwoNodes.startTheProgram();
//        MinimalTree.doTheThing();
//        ListOfDepths.doTheThing();
//        CheckBalanced.doTheThing();
//        IsValidBST.doTheThing();
        BuildOrder.doTheThing();
//        FirstCommonAncestor.doTheThing();
    }

    public static void JavaConcepts() throws InstantiationException, IllegalAccessException {
        abstractClassTest();
        interfaceTest();
        genericsTest();
        collectionsIteratorTest();
        collectionsIterableTest();
        collectionsTest();
        lambdaTest();
        nonterminalStreamTest();
        terminalStreamTest();
        StreamIteratorIteration();
        CollectorsTest();
    }
    public static void abstractClassTest(){
            AbstractSubClass asc = new AbstractSubClass();
            asc.abstractMethod();
        asc.nonAbstractSubMethod();
    }
    public static void interfaceTest(){
        InterfaceImplementation IntImp = new InterfaceImplementation();
        IntImp.myInterfaceMethod();
        IntImp.myOtherInterfaceMethod();
    }
    public static void genericsTest() throws IllegalAccessException, InstantiationException {
        Generic gen = new Generic();
        gen.typeInference();
        gen.genericMethods();
        gen.genericClasses();
    }
    public static void collectionsIteratorTest(){
        CollectionsIterator ci = new CollectionsIterator();
        ci.listIterator();
    }
    public static void collectionsIterableTest(){
        CollectionsIterable cib = new CollectionsIterable();
        cib.listIteraable();
    }
    public static void collectionsTest(){
        RegularCollections regCol = new RegularCollections();
//        regCol.addToCollection("Adding To Collection");
//        regCol.transferElementsFromOneCollectionToAnother();
        regCol.listComparableInterface();
//        regCol.listComparator();
    }
    public static void lambdaTest(){
        AnonymousInterfaces lambdas = new AnonymousInterfaces();
        lambdas.lambdaInterfaceOperations();
    }
    public static void nonterminalStreamTest(){
        NonterminalStreams stream = new NonterminalStreams();
//        stream.nonterminalChainedStreams();
//        stream.filteredStreams();
//        stream.distinctStreams();
//        stream.peekStreams();
        stream.limitStreams();
    }
    public static void terminalStreamTest() {
        TerminalStreams stream = new TerminalStreams();
//        stream.anyMatch();
        stream.allMatch();
    }
    public static void StreamIteratorIteration(){
        //Iteration with streams is slow if you're using primitives. Otherwise, very fast
        //Iterators are the way to go for iterating over primitives
        TimingStuff t = new TimingStuff();
        t.String_Stream_vs_Iterator_iteration();
        t.Object_Stream_vs_Iterator_iteration();
//        t.objectStreamIteration(t.createObjectList());
//        t.objectStreamIteration(t.createObjectList());
//        t.stringStreamIteration(t.createStringList());
    }
    public static void CollectorsTest(){

        CollectorsTest ct = new CollectorsTest();
        System.out.println(ct.findMapNumbers());
//        ct.partitioningBy();
//        ct.summarizingInteger();
        //        System.out.println(ct.findMostFrequentItem());
        //        ct.partitioningBy();
//        ct.summarizingInteger();
//        ct.summarizingObjectInteger();
//        ct.biggestObjectElementOfStream();


    }
    public static void Does_Data_Added_To_ArrayList_In_Method_Persist_After_Method_Returns(){
        ArrayList al = new ArrayList();
        al.add(1);
        System.out.println("Before Method call AL Size is " + al.size());
        BMethod(al);
        System.out.println("After Method call AL Size is " + al.size());
    }
    public static void BMethod(ArrayList al){
        al.add(1);
        al.add(2);
    }
}

