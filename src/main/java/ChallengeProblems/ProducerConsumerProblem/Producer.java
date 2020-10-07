package ChallengeProblems.ProducerConsumerProblem;

public class Producer<T> {

    DataStructure ds;

    Producer(DataStructure ds) {
        this.ds = ds;
    }

    //https://gist.github.com/yithar7153/bf3e6bc2b94a884eb004f8ee28d39051
    public void put(T elem) {

        synchronized (ds) {
            try {
                while (ds.size() == 10) {
                    //Causes the current thread to wait until another thread invokes the
                    //notify() method or the notifyAll method for this object.
                    ds.wait();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();

                return;
            }
            ds.add(elem);

            //Wakes up all threads that are waiting on this object's monitor. A
            //thread waits on an object's monitor by calling one of the
            //{@code wait} methods.
            ds.notifyAll();
        }
    }

}
