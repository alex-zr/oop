package session4.problems;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SingleThread implements Runnable {
    private SomeClass someObject;
    private List<Long> concurrentLinkedQueue;
    public SingleThread(SomeClass someClass, List<Long> list) {
        super();
        this.someObject = someClass;
        this.concurrentLinkedQueue = list;
    }
    @Override
    public void run() {
        long x = someObject.volume.incrementAndGet();
        concurrentLinkedQueue.add(x);
        //System.out.print(/*Thread.currentThread().getName() + */" " + x);
    }
}
