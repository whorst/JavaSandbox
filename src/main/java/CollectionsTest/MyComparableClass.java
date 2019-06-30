package CollectionsTest;

public class MyComparableClass implements Comparable<MyComparableClass> {

    int valueToBeCompared;

    public MyComparableClass(int init) {
        this.valueToBeCompared = init;
    }

    @Override
    public int compareTo(MyComparableClass o) {
        if(this.valueToBeCompared > o.valueToBeCompared){
            return 1;
        }
        else if(this.valueToBeCompared < o.valueToBeCompared){
            return -1;
        }
        return 0;
    }
}
