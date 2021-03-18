package Multithreading;
/*** DeadLock ***/
public class Main_8_DeadLock {
    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        resourceA.resourceB = resourceB;
        resourceB.resourceA = resourceA;
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.resourceA = resourceA;
        myThread2.resourceB = resourceB;
        myThread1.start();
        myThread2.start();
    }

 static class MyThread1 extends Thread {
        ResourceA resourceA;

        @Override
        public void run() {
            System.out.println(resourceA.getI());
        }
    }

 static class MyThread2 extends Thread {
        ResourceB resourceB;
        @Override
        public void run() {
            System.out.println(resourceB.getI());
        }
    }

  static class ResourceA {
        ResourceB resourceB;

        public synchronized int getI() {
            return resourceB.returnI();
        }

        public synchronized int returnI() {
            return 1;
        }
    }

  static class ResourceB {
        ResourceA resourceA;
        public synchronized int getI() {
            return resourceA.returnI();
        }
        public synchronized int returnI() {
            return 2;
        }
    }
}
