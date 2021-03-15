package Multithreading;

public class MainRunnable {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
   static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }


    }
}
