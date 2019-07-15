package Streams;



import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsTest {
    //https://www.baeldung.com/java-8-collectors

    //Collectors are dependent on the Stream.collect method

    public void toList(){
        List<String> x  = new ArrayList<>();
        x.add("qw");
        x.add("weww");
        x.add("rfgre");
        x.add("ghgr");
        x.add("er");
        x.add("efe");

        List<String> result =  x.stream().collect(Collectors.toList());
//        System.out.println(result);
    }
    public void toMap(){
        List<String> x  = new ArrayList<>();
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

    public void arrayToList(){
        String [] x = {"qwww","asc","sefsd","efe","efwe","awda","awdw"};
        List<String> r = Arrays.asList(x);
    }

    public void mapFunctionToElement(){
        //to have a function run for every element, one has to call .map
        String [] x = {"qwww","asc","sefsd","efe","efwe","awda","awdw"};
        Collection t = new ArrayList();
        t.addAll(Arrays.asList(x));
        t = (Collection) t.stream().map(element -> element.toString().toUpperCase()).collect(Collectors.toList());
        System.out.println(t);
    }

    public void partitioningBy(){
        String [] x = {"qwww","asc","sefsd","efe","efwe","awda","awdw"};
        Collection givenList = new ArrayList();
        givenList.addAll(Arrays.asList(x));
        Map<Boolean, List<String>> result = (Map<Boolean, List<String>>) givenList.stream()
                .collect(Collectors.partitioningBy((String elm) -> elm.length() > 2));
        System.out.println(result);
    }
}
