package session4.problems;

public class Test extends Thread {
    boolean keepRunning = true;

    @Override
    public String toString() {
        return "Test{" +
                "keepRunning=" + keepRunning +
                '}';
    }

    public void run() {
        while (keepRunning) {
            //if (!keepRunning) return;
            //System.out.println(keepRunning);
        }
        System.out.println("Thread terminated.");
    }
    public static void main(String[] args) throws InterruptedException {
        Test testObj = new Test();
        testObj.start();
        Thread.sleep(1000);
        testObj.keepRunning = false;
        System.out.println("keepRunning set to false.");
    }
}
