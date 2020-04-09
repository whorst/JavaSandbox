import AbstractClass.AbstractSubClass;
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
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//        JavaConcepts();
        ChallengeProblems();
    }

    public static void ChallengeProblems() throws IllegalAccessException, InstantiationException {
//        Stairs.stairs(5);
//        MagicIndex.findMid();
//        SubsetsOfASet.subSet();
//        AllPermutationsOfString.getPermutations("abcdef");
//        AllPermutationsOfStringWithDupes.getPermutations("aaabcd");
//        TowersOfHanoi.towersOfHanoi();
//        Parenthesis.allParens(7);
        Coins.coins(25);
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
}

