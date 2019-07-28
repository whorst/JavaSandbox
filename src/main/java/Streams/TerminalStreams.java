package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* The terminal operations of the Java Stream interface typically return a single value. Once the terminal operation is
* invoked on a Stream, the iteration of the Stream and any of the chained streams will get started.
*
* A terminal operation typically does not return a new Stream instance.
* */

public class TerminalStreams {

    public void anyMatch() {
        //Will match any option that starts with the value specified
        List<String> stringList = new ArrayList<String>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> stream = stringList.stream();

        boolean anyMatch = stream.anyMatch((value) -> { return value.startsWith("One"); });
        System.out.println(anyMatch);
    }

    public void allMatch() {
        List<String> stringList = new ArrayList<String>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> stream = stringList.stream();

        boolean allMatch = stream.allMatch((value) -> { return value.startsWith("One"); });
        System.out.println(allMatch);
    }

    public void collect() {
        //Will return a collection given a stream
        List<String> stringList = new ArrayList<String>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> stream = stringList.stream();

        List<String> stringsAsUppercaseList = stream
                .map(value -> value.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(stringsAsUppercaseList);
    }

    public void toArray() {
        List<String> stringList = new ArrayList<String>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> stream = stringList.stream();

        Object[] objects = stream.toArray();
    }
}
