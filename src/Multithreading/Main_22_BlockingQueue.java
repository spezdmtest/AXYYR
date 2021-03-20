package Multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main_22_BlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new PriorityBlockingQueue<>();
        new Thread(() -> {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> queue.add("this is string")).start();
    }
}
