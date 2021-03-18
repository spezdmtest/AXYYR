package Multithreading;

import java.util.concurrent.locks.ReentrantLock;

/*** Синхронизация статических методов***/
public class Main_4 {
    public static void main(String[] args) throws InterruptedException {
        MyThread.Resource.i = 5;
        MyThread myThread1 = new MyThread();
        myThread1.setName("one");
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println(MyThread.Resource.i);
    }

    static class MyThread extends Thread {
    Resource resource;

    @Override
    public void run() {
        Resource.channgeStaticI();
    }

    static class Resource {
         static int i;

      public synchronized static void channgeStaticI() {
         int i = Resource.i;
         if(Thread.currentThread().getName().equals("one")) {
             Thread.yield();
         }
         i++;
         Resource.i = i;
                }
            }
        }
    }
