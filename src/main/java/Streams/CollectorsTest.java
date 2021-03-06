package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.summarizingInt;

public class CollectorsTest {
    //https://www.baeldung.com/java-8-collectors

    //Collectors are dependent on the Stream.collect method, Allows for repackaging/mutable fold operations to be
    // performed on data elements in a stream instance

    public static Map<Integer, Long> findMapNumbers() {

        //groupingBy is used for grouping objects by some property and storing results in a map
        //Function.identity takes in a value and returns a value
        //Collectors.counting counts the number of input elements, given a stream


        Map<Integer, Long> t = generateLotsOfNumbers().stream().parallel()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return t;
    }

    public static ArrayList<Integer> generateLotsOfNumbers(){
        Random r = new Random();
        ArrayList<Integer> x = new ArrayList();
        for (int i = 0; i< 10000; i++){
            x.add(r.nextInt(10));
        }
        return x;
    }

    public void toList() {
        List<String> x = new ArrayList<>();
        x.add("qw");
        x.add("weww");
        x.add("rfgre");
        x.add("ghgr");
        x.add("er");
        x.add("efe");

        List<String> result = x.stream().collect(Collectors.toList());
//        System.out.println(result);
    }

    public void toMap() {
        List<String> x = new ArrayList<>();
        x.add("qw");
        x.add("weww");
        x.add("rfgre");
        x.add("ghgr");
        x.add("er");
        x.add("efe");

        //Used to call a method by referring to it with the help of its class directly.

        Map<String, Integer> hm = x.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println(hm);
    }
    public void arrayToList() {
        String[] x = {"qwww", "asc", "sefsd", "efe", "efwe", "awda", "awdw"};
        List<String> r = Arrays.asList(x);
    }


    public void mapFunctionToElement() {
        //to have a function run for every element, one has to call .map
        String[] x = {"qwww", "asc", "sefsd", "efe", "efwe", "awda", "awdw"};
        Collection t = new ArrayList();
        t.addAll(Arrays.asList(x));
        t = (Collection) t.stream().map(element -> element.toString().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(t);
    }

    public void partitioningBy() {
        String[] x = {"qwww", "asc", "sefsd", "efe", "efwe", "awda", "awdw"};
        Collection<String> givenList = new ArrayList<String>();
        givenList.addAll(Arrays.asList(x));
        Map<Boolean, List<String>> result = (Map<Boolean, List<String>>) givenList.stream()
                .collect(Collectors.partitioningBy((String elm) -> elm.length() > 3));
        System.out.println(result);
    }
    public void partitioningByTri() {
        //This only works with booleans
        String[] x = {"qwww", "asc", "sefsd", "efe", "efwe", "awda", "awdw"};
        Collection<String> givenList = new ArrayList<String>();
        givenList.addAll(Arrays.asList(x));
        Map<Boolean, List<String>> result = (Map<Boolean, List<String>>) givenList.stream()
                .collect(Collectors.partitioningBy( elm -> Boolean.parseBoolean(getLetter(elm))));
        System.out.println(result);
    }

    public static String getLetter(String stringLetter){
        String firstLetter = stringLetter.substring(0);

        switch (firstLetter){
            case "a":
                return "a";
            case "s":
                return "s";
            case "e":
                return"e";

        }
        return "any";
    };


    public static void summarizingInteger() {
        //Will return meta data about a given list of integers
        IntSummaryStatistics result =  Stream.of(1, 3, 4, 3, 4, 3, 2, 3, 3, 3, 3, 3, 5, 5, 5, 5, 5, 5, 5, 5, 5)
                .collect(Collectors.toList()).stream().collect(summarizingInt(Integer::intValue));
        System.out.println(result.getMax());
        System.out.println(result.getAverage());
        System.out.println(result.getCount());
        System.out.println(result.getMin());
        System.out.println(result.getSum());
    }
    public static void summarizingObjectInteger() {
        Collection<FakeObject> fol = new ArrayList<FakeObject>();
        for(int i=0; i< 100; i++){
            fol.add(new FakeObject(i));
        }
        IntSummaryStatistics result = fol.stream().collect(Collectors.summarizingInt(FakeObject::getSpeed));
        System.out.println(result.getMax());
        System.out.println(result.getAverage());
        System.out.println(result.getCount());
        System.out.println(result.getMin());
        System.out.println(result.getSum());
    }

    public static void biggestObjectElementOfStream(){
        Collection<FakeObject> fol = new ArrayList<FakeObject>();
        for(int i=0; i< 400; i+=3){
            fol.add(new FakeObject(i));
        }
        FakeObject result =  fol.stream().max(Comparator.comparingInt(FakeObject::getSpeed)).get();
        System.out.println(result);
        //The .get removes the need for the result to be optional
    }
}