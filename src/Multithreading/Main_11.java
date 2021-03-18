package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*** ReentrantLock - можно более гибко синхранизироваться ***/
public class Main_11 {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        resource.setI(5);
        resource.setJ(5);
        MyThread myThread1 = new MyThread();
        myThread1.setName("one");
        MyThread myThread2 = new MyThread();
        myThread1.setResource(resource);
        myThread2.setResource(resource);
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println(resource.getI());
        System.out.println(resource.getJ());
    }

    static class MyThread extends Thread {
        Resource resource;

        public void setResource(Resource resource) {

            this.resource = resource;
        }

        @Override
        public void run() {
            resource.channgeI();
            resource.channgeJ();
        }
    }
}

class Resource {
    private int i;
    private int j;
    Lock lock = new ReentrantLock();

    int getI() {
        return i;
    }

    synchronized void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    void channgeI() {
        lock.lock();
        int i = this.i;
        if (Thread.currentThread().getName().equals("one")) {
            Thread.yield();
        }
        i++;
        this.i = i;
    }
    void channgeJ() {
        int j = this.j;
        if (Thread.currentThread().getName().equals("one")) {
            Thread.yield();
        }
        j++;
        this.j = j;
        lock.unlock();
    }
}


