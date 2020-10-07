package AbstractClass.MethodsRunningAParent;

public class AbstractSubClassTwo extends AbstractClass {
    @Override
    public String getMyDataOne() {
        System.out.println("MyClassTwo");
        return null;
    }

    @Override
    public void setMyDataOne(String myDataOne) {

    }

    @Override
    public String getMyDataTwo() {
        return null;
    }

    @Override
    public void setMyDataTwo(String myDataTwo) {

    }

    public void getOtherValue() {

    }
}
