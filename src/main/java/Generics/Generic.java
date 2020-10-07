package Generics;

import java.util.ArrayList;

public class Generic <T>{

    public void typeInference(){

        //The Diamond Operator <> is used to infer type
        /*
        * the Java compiler will assume that the class instantiated is to have
        * the same type as the variable it is assigned to. That means String because
        * the List variable has String set as its type.*/
        ArrayList <String> stringTypeInference = new ArrayList();
        ArrayList objectInstances = new ArrayList();


        stringTypeInference.add("Hello World");
        stringTypeInference.add("12");

        //Not using generics means you can add any object to the array, at the cost of having to cast
        //array accessing or using the Object Keyword
        objectInstances.add("Hello World");
        objectInstances.add(1);
        objectInstances.add(1.234);
        objectInstances.add(true);

        Object one = objectInstances.get(0);
        Object two = objectInstances.get(1);
        Object three = objectInstances.get(2);
        Object four = objectInstances.get(3);

        String oneCasted = (String) objectInstances.get(0);
        Integer twoCasted = (Integer) objectInstances.get(1);
        Double threeCasted = (Double) objectInstances.get(2);
        Boolean fourCasted = (Boolean) objectInstances.get(3);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);

        System.out.println(oneCasted);
        System.out.println(twoCasted);
        System.out.println(threeCasted);
        System.out.println(fourCasted);
    }

    public void genericMethods() throws InstantiationException, IllegalAccessException {
        //http://tutorials.jenkov.com/java-generics/class-objects-as-type-literals.html
        String string  = getInstance(String.class); //Creates an instance of a string class
        MyPojoClass myClass = getInstance(MyPojoClass.class); //Creates an instance of MyPojoClass class

    }
    public static <T> T getInstance(Class<T> theClass)
            throws IllegalAccessException, InstantiationException {
        return theClass.newInstance();//Creates a new instance of a class
    }


    public void genericClasses(){
        /*
        * A generic class declaration looks like a non-generic class declaration,
        * except that the class name is followed by a type parameter section.
        * https://www.tutorialspoint.com/java/java_generics.htm
        * */
        MyGenericClass <String> genericStringObject = new MyGenericClass<>();
        genericStringObject.add("Hello World");
        System.out.println(genericStringObject.get());

        MyGenericClass <Integer> genericIntObject = new MyGenericClass<>();
        genericIntObject.add(1);
        System.out.println(genericStringObject.get());
    }
}
