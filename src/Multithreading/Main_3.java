package Multithreading;
/*** Синхронизация ***/
public class Main_3 {
    public static void main(String[] args) throws InterruptedException {
        MyThread.Resource resource = new MyThread.Resource();
        resource.setI(5);
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
    }

static class MyThread extends Thread {
    Resource resource;
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.channgeI();
    }
  static class Resource {
     private int i;

      public int getI() {
          return i;
      }

      public synchronized void setI(int i) {
          this.i = i;
      }

      public void channgeI() {
       //   System.out.println(this.i);
         synchronized (this) {
         int i = this.i;
         if(Thread.currentThread().getName().equals("one")) {
             Thread.yield();
         }
         i++;
         this.i=i;
                     }
                }
            }
        }
    }
