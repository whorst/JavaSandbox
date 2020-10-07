package ChallengeProblems.ProducerConsumerProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DataStructure<T> {

    Queue<T> queue = new LinkedList<T>();

    public boolean add(T elem) {
        return queue.add(elem);
    }

    public T remove() {
        return queue.remove();
    }

    public int size() {
        return queue.size();
    }

}
