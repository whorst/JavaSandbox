package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

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

        Stream<String> stream1 = stringList.stream()
                .map((value) -> { return value.toLowerCase(); })
                .map((value) -> { return value.toUpperCase(); })
                .map((value) -> { return value.substring(0,3); });

        System.out.println(stream1);
    }
}
