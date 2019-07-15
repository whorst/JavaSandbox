import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TimingStuff {

    public void Object_Stream_vs_Iterator_iteration (){
        Collection<FakeObject> myList = createObjectList();
        objectStreamIteration((List<FakeObject>) myList);
        objectIteratorIteration((List<FakeObject>) myList);
    }

    public void String_Stream_vs_Iterator_iteration () {
        Collection<String> myList = createStringList();
        stringStreamIteration((List<String>) myList);
        stringIteratorIteration((List<String>) myList);
    }

    public void objectStreamIteration(List<FakeObject> myList){
        System.out.println("\nObject Stream");
        List <FakeObject> copyMyArray = new ArrayList<>();
        copyMyArray.addAll(myList);

        Instant starts = Instant.now();
        copyMyArray.stream().forEach(
                element -> {
                    element.getNumber();
                }
        );
        Instant ends = Instant.now();
        System.out.println("With Stream Iteration "+ Duration.between(starts, ends));
    }

    private void objectIteratorIteration(List<FakeObject> myList){
        System.out.println("\nObject Iterator");
        List <FakeObject> copyMyArray = new ArrayList<>();
        copyMyArray.addAll(myList);

        Iterator it = copyMyArray.iterator();

        Instant starts = Instant.now();

        while (it.hasNext()){
            FakeObject length = (FakeObject) it.next();
            length.getNumber();
            it.next();
        }

        Instant ends = Instant.now();

        System.out.println("With Iterator Iteration "+ Duration.between(starts, ends));
    }

    public void stringStreamIteration(List<String> myList){
        System.out.println("\nString Stream");
        List <String> copyMyArray = new ArrayList<>();
        copyMyArray.addAll(myList);

        Instant starts = Instant.now();
        copyMyArray.stream().forEach(
                element -> {
                    element.length();
                }
        );
        Instant ends = Instant.now();
        System.out.println("With Stream Iteration "+ Duration.between(starts, ends));
    }

    private void stringIteratorIteration(List<String> myList){
        System.out.println("\nString Iterator");
        List <String> copyMyArray = new ArrayList<>();
        copyMyArray.addAll(myList);

        Iterator it = copyMyArray.iterator();

        Instant starts = Instant.now();

        while (it.hasNext()){
            String length = (String) it.next();
            length.length();
            it.next();
        }

        Instant ends = Instant.now();

        System.out.println("With Iterator Iteration "+ Duration.between(starts, ends));
    }

    public List createStringList(){
        ArrayList<String> retList = new ArrayList<String>();
        for(int i =0; i< 10000; i++){
            retList.add(String.valueOf(i));
        }
        return retList;
    }

    public List createObjectList(){
        ArrayList<FakeObject> retList = new ArrayList();
        for(int i =0; i< 10000; i++){
            retList.add(new FakeObject(String.valueOf(i)));
        }
        return retList;
    }



    private class FakeObject {
        private String number;
        FakeObject(String number){
             this.number = number;
        }

        public String getNumber() {
            return number;
        }
    }
}
