package Multithreading;

import java.util.concurrent.ThreadFactory;

public class Main_23_ThreadFactory {
    public static void main(String[] args) {
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setPriority(Thread.MAX_PRIORITY);
                return thread;
            }
        };
            threadFactory.newThread(new myRun()).start();

      }
      static class myRun implements Runnable {
          @Override
          public void run() {
              System.out.println(1);
          }
      }
   }

