package AbstractClass.MethodsRunningAParent;

public class AbstractSubClassOne extends AbstractClass{
    @Override
    public String getMyDataOne() {
        System.out.println("Class One");
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
}
