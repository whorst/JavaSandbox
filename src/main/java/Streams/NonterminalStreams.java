package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//http://tutorials.jenkov.com/java-functional-programming/streams.html

public class NonterminalStreams {

    /*The non-terminal stream operations of the Java Stream API are operations that transform or filter the elements in
    the stream. When you add a non-terminal operation to a stream, you get a new stream back as result.
    The new stream represents the stream of elements resulting from the original stream with the non-terminal operation
    applied.*/

    public void obtainStream() {
        List<String> items = new ArrayList<String>();

        items.add("one");
        items.add("two");
        items.add("three");

        Stream<String> stream = items.stream();
    }

    public void nonterminalChainedStreams() {
        List<String> stringList = new ArrayList<String>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        List<String> stream1 = stringList.stream()
                .map((value) -> { return value.toLowerCase(); })
                .map((value) -> { return value.toUpperCase(); })
                .map((value) -> { return value.substring(0,3); })
                .collect(Collectors.toList());

        System.out.println(stream1);
    }

    public void filteredStreams() {
        //Will filter the list of items given a certain criteria
        List<String> stringList = new ArrayList<String>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");
        stringList.add("four");
        stringList.add("Five");

        List<String> longStringsStream = stringList.stream().filter((value) -> {
            return value.length() <= 3;
        }).collect(Collectors.toList());

        System.out.println(longStringsStream);
    }

    public void distinctStreams() {
        //Will get rid of duplicate values within a list
        List<String> stringList = new ArrayList<String>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");

        Stream<String> stream = stringList.stream();

        List<String> distinctStrings = stream
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctStrings);
    }

    public void limitStreams() {
        List<String> stringList = new ArrayList<String>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");

        Stream<String> stream = stringList.stream();
        stream
                .limit(2)
                .forEach( element -> { System.out.println(element); });
    }

    public void peekStreams() {
        List<String> stringList = new ArrayList<String>();

        stringList.add("abc");
        stringList.add("def");

        Stream<String> stream = stringList.stream();

        Stream<String> streamPeeked = stream.peek((value) -> {
            System.out.println("value");
        });
    }
}
