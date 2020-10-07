package ChallengeProblems.ProducerConsumerProblem;

import java.util.ArrayList;

public class Consumer<T> {
    private DataStructure<T> ds;

    ArrayList al = new ArrayList();

    Consumer(DataStructure<T> ds) {
        this.ds = ds;
    }

    public T take() {
        T retVal;

        //Synchronized allows different threads to look at whatever variable is in relevance and ensure that there is no
        //Interference between threads
        synchronized (ds) {
            try {
                while (ds.size() == 0) {
                    //Causes the current thread to wait until another thread invokes the
                    //notify() method or the notifyAll method for this object.
                    ds.wait();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }

            retVal = ds.remove();

            //Wakes up all threads that are waiting on this object's monitor. A
            //thread waits on an object's monitor by calling one of the wait methods.
            ds.notifyAll();
        }

        return retVal;
    }
}
