package session3;

public class ThreadEx {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 200; i++) {
                System.out.println(getName());
                try {
                    wait();
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class RunEx extends FileEx implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 200; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    return;
                }
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        MyThread thread = new MyThread();
//        thread.start();
        Runnable runnable = new RunEx();
        Thread runThread = new Thread(runnable);
        runThread.start();

        runThread.stop();

        runThread.interrupt();

        runThread.notify();

        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(100);
        }

        runThread.join();

    }
}
