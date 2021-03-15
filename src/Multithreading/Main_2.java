package Multithreading;
/*** жизненный цикл потоков ***/
public class Main_2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        // Thread.sleep(1000);//состояние спит 1 секунду
        myThread.setPriority(1); // устанавливаем приаритет для потока ( от 0 до 10), например берем
                                // например берем максимальный
        // Thread.yield(); // передает другому потому выполнение, сам падет в Runnable
        myThread.join();
        System.out.println("thread main");
    }
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("thread 0");
        }
    }
}
