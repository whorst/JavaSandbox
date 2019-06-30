package CollectionsTest;

import java.util.*;

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
        //You can remove from a collection simply by using the remove keyword
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

    public void listComparableInterface(){
    /* CompareTo is a method a part of the Comparable Interface and returns positive integer, if the current object is
    greater than the specified object. negative integer, if the current object is less than the specified object.
    zero, if the current object is equal to the specified object.
    https://www.javatpoint.com/Comparable-interface-in-collection-framework
    */

    /* If the List contains objects that implement the Comparable interface (java.lang.Comparable), then the objects can
    * compare themselves to each other. In that case you can sort the List like this:
    * */

        MyComparableClass biggerClass = new MyComparableClass(500);
        MyComparableClass middleClass = new MyComparableClass(0);
        MyComparableClass smallerClass = new MyComparableClass(-500);

        //The CompareTo Method in MyComparableClass can be used for Collections.sort()
        List<MyComparableClass> MyComparableList = new ArrayList<MyComparableClass>();
        MyComparableList.add(middleClass);
        MyComparableList.add(smallerClass);
        MyComparableList.add(biggerClass);

        System.out.println(biggerClass.compareTo(smallerClass));

        Collections.sort(MyComparableList);
        System.out.println(MyComparableList.get(0).valueToBeCompared);
    }

    public void listComparator(){
        /*
        * If the objects in the Java List do not implement the Comparable interface, or if you want to sort the objects
        * in another order than their compare() implementation, then you need to use a Comparator implementation
        * */
         class Car{
            public String brand;
            public String numberPlate;
            public int noOfDoors;

            public Car(String brand, String numberPlate, int noOfDoors) {
                this.brand = brand;
                this.numberPlate = numberPlate;
                this.noOfDoors = noOfDoors;
            }
        }
        List<Car> list = new ArrayList<>();

        list.add(new Car("Volvo V40" , "XYZ 201845", 5));
        list.add(new Car("Citroen C1", "ABC 164521", 4));
        list.add(new Car("Dodge Ram" , "KLM 845990", 2));

        Comparator<Car> carBrandComparator = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.brand.compareTo(car2.brand);
            }
        };

        Collections.sort(list, carBrandComparator);
    }

}
