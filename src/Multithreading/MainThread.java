package Multithreading;

public class MainThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName());
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            System.out.println("this is now thread");
            someMethod();
        }
        private void someMethod () {
            throw new RuntimeException();
        }
    }

}
