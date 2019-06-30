package Generics;

public class MyGenericClass<T> {

    private T myGenericAttribute;

    public void add(T gen){
        this.myGenericAttribute = gen;
    }

    public T get(){
        return myGenericAttribute;
    }
}
