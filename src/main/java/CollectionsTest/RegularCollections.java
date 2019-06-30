package CollectionsTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

//http://tutorials.jenkov.com/java-collections/collection.html


/*
* The Java Collection interface represents the operations possible on a generic collection,
* like on a List, Set, Stack, Queue and Deque. For instance, methods to access the elements
 * based on their index are available in the Java Collection interface.*/

public class RegularCollections {
    public void addToCollection(Object elementToAdd){
        //You can add to a collection simply by using the add keyword
        Collection myCollection = new ArrayList();
        myCollection.add(elementToAdd);
        System.out.println(((ArrayList) myCollection).get(0));

    }

    public void removeFromCollection(Object elementToRemove){
        //You can add to a collection simply by using the add keyword
        Collection myCollection = new ArrayList();
        myCollection.add(elementToRemove);
        myCollection.remove(elementToRemove);

    }

    public void transferElementsFromOneCollectionToAnother(){
        //Elements from one collection can be all added to another collection,
        //even if the data structures are different

        Collection myCollection = new ArrayList();
        Collection myOtherCollection = new HashSet();
        myCollection.add("1");
        myCollection.add("1");
        myCollection.add("2");
        myCollection.add("3");
        myCollection.add("4");

        myOtherCollection.addAll(myCollection);
        System.out.println(myOtherCollection);

    }

}
