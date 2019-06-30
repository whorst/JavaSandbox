package CollectionsTest;

import java.util.*;

public class CollectionsIterator {

    /*
    http://tutorials.jenkov.com/java-collections/iterator.html
    * The Iterator is used to traverse a collection of objects, one at a time
    *
    * */

    public void listIterator(){
        List<String> myList = new ArrayList();
        myList.add("A1");
        myList.add("A2");
        myList.add("A3");
        myList.add("A4");
        myList.add("A5");
        myList.add("A6");
        myList.add("A7");

        //The first step is to obtain the iterator. The order in which the elements contained in a Java
        //Iterator are traversed depends on the object that supplies the Iterator.
        Iterator it = myList.iterator();
        //Some collections do not allow you to modify the collection while you are iterating it via an Iterator.
        //The Java Iterator interface has a remove() method which lets you remove the element just returned by next() from the underlying collection.
        while(it.hasNext()){
            String value = (String) it.next();
            System.out.println(value);
        }
    }
}
