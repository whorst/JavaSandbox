import AbstractClass.AbstractSubClass;
import Interface.InterfaceImplementation;
import Generics.*;
import CollectionsTest.*;
import Lambdas.*;
import Streams.NonterminalStreams;
import Streams.TerminalStreams;

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
        terminalStreamTest();
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
}