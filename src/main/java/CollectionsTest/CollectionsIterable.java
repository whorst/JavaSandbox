package CollectionsTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsIterable {
    //http://tutorials.jenkov.com/java-collections/iterable.html
    /*
    * A Collections subclass which implements an iterable can use the Java for each loop. It does not have an
    * iteration state or assignment privileges https://stackoverflow.com/a/6863299.
    * */

    public void listIteraable(){
        List<String> myList = new ArrayList();
        myList.add("A1");
        myList.add("A2");
        myList.add("A3");
        myList.add("A4");
        myList.add("A5");
        myList.add("A6");
        myList.add("A7");


        /*The reason the for-each loop is slower is, that each iteration will call the List iterator() method,
         which will create a new Iterator object. Creating a new object thousands, perhaps even millions of
          times per second does have a small performance penalty compared to just iterating the List using a
          standard for-loop.*/
        for (String s : myList){
            System.out.println(s.toString());
        }

    }
}
