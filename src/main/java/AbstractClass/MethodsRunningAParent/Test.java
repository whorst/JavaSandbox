package AbstractClass.MethodsRunningAParent;

public class Test {
    public static void testParent(){
        AbstractSubClassOne abso = new AbstractSubClassOne();
        AbstractSubClassTwo abst = new AbstractSubClassTwo();
        doAnOperation(abso);
        doAnOperation(abst);
    }

    public static void doAnOperation(AbstractClass thisClass){
        System.out.println(thisClass.getMyDataOne());
    }

}
