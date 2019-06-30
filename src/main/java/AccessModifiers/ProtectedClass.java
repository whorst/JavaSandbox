package AccessModifiers;

public class ProtectedClass {
    protected long time = 0;
}


class ClockReader extends ProtectedClass {
    /*The protected access modifier provides the same access as the default access modifier, with the addition that
    subclasses can access protected methods and member variables (fields) of the superclass. This is true even if the
    subclass is not located in the same package as the superclass.*/

    public long readTime(){
        return this.time;
    }
}