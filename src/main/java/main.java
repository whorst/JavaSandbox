import AbstractClass.AbstractSubClass;
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
//        abstractClassTest();
//        interfaceTest();
//        genericsTest();
//        collectionsIteratorTest();
//        collectionsIterableTest();
//        collectionsTest();
//        lambdaTest();
//        nonterminalStreamTest();
//        terminalStreamTest();
//        StreamIteratorIteration();
//        CollectorsTest();



//        ArrayList<Integer> prime = new ArrayList();
//        prime.add(2);
//        prime.add(3);
//        int focusNumer = prime.get(1);
//
//
//        while(prime.size()<100){
//            focusNumer = focusNumer+1;
//            boolean isPrime = checkIfPrime(focusNumer, prime);
//            if (isPrime){
//                    prime.add(focusNumer);
//            }
//        }
//        System.out.println(prime);
//    }
//
//    public static boolean checkIfPrime(int number, ArrayList<Integer> prime){
//        int primeLength = prime.size();
//        int x = primeLength-1;
//        while(x>=0) {
//            if (number % prime.get(x)==0) {
//                return false;
//            }
//            x--;
//        }
//        return true;
    }
        private static void getNPrimes(int nPrimes) {
            int [] primeArray = {nPrimes};
            primeArray[0] = 2;
            primeArray[1] = 3;
            for( int primesFound = 2; primesFound <= nPrimes;){
                int focusNumber = primeArray[primesFound-1];
                int factors = 0;
                for(int i = primesFound-1; i>=1; i--){
                    if(focusNumber % primeArray[i] == 0){
                        factors+=1;
                    }
                if(factors ==0){
                    primesFound++;
                }
                }
            }
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
        ct.partitioningByTri();
        //        System.out.println(ct.findMostFrequentItem());
        //        ct.partitioningBy();
//        ct.summarizingInteger();
//        ct.summarizingObjectInteger();
//        ct.biggestObjectElementOfStream();


    }
}

