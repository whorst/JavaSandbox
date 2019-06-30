package AbstractClass;

public class AbstractSubClass extends AbstractClass {
    @Override
    public void abstractMethod() {
        System.out.println("My Sub Abstract Class");
    }
    public void nonAbstractSubMethod() {
        this.nonAbstractMethod();
    }
}
