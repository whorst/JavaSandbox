package Interface;


//http://tutorials.jenkov.com/java/interfaces.html
public interface InterfaceClass {

    /*
    * a Java interface can only contain method signatures and fields. A Java interface cannot
    * contain an implementation of the methods, only the signature (name, parameters and exceptions)
    * of the method.*/

    /*A class that implements an interface must implement all the methods declared in the interface. The
     methods must have the exact same signature (name + parameters) as declared in the interface.
     The class does not need to implement (declare) the variables of an interface. Only the methods.*/

    /*All variables and methods in an interface are public*/

    /*There can be multi level interfaces*/


    public String myInterfaceVar = "My Interface Variable";

    public void myInterfaceMethod();
    public void mySecondInterfaceMethod();

}

