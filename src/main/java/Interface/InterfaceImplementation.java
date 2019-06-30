package Interface;

public class InterfaceImplementation implements InterfaceClass, MyOtherInterface{

    @Override
    public void myOtherInterfaceMethod(){
        System.out.println("This is implementing the other Interface Class");
    }

    @Override
    public void myInterfaceMethod() {
        System.out.println("This is implementing the Interface Class");
    }

    @Override
    public void mySecondInterfaceMethod() {
        System.out.println("This is implementing my second interface method");

    }
}
