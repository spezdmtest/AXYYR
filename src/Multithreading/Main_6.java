package Multithreading;
import java.util.concurrent.atomic.AtomicInteger;
/*** атомарные переменные ***/
public class Main_6 {
    static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 10_000; j++) {
            new MyThread().start();
        }
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(1_000);
        System.out.println(atomicInteger.get());
    }
    static class MyThread extends Thread {
        @Override
        public void run() {
            atomicInteger.incrementAndGet();
        }
    }
}


