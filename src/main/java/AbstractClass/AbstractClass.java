package AbstractClass;

//http://tutorials.jenkov.com/java/abstract-classes.html
public abstract class AbstractClass {
    /*
    * A Java abstract class is a class which cannot be instantiated, meaning you cannot create new instances of an
    * abstract class. The purpose of an abstract class is to function as a base for subclasses. An abstract class is
    * a base class
    * https://www.techopedia.com/definition/26896/base-class
    * */

    /*
    An abstract method has no implementation. It just has a method signature. Just like methods in a Java interface.
    Sub-classes must implement all abstract methods
    * */
    public abstract void abstractMethod();

    /*It can also have non abstract methods*/
    public void nonAbstractMethod(){
        System.out.println("This is my non abstract method");
    }

    /*The only time a subclass of an abstract class is not forced to implement all abstract methods of its superclass,
    is if the subclass is also an abstract class.*/
}
