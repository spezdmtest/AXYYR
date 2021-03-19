package Multithreading;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main_20_CyclicBarrier{
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Run());
        new Sportsman(cyclicBarrier);
        new Sportsman(cyclicBarrier);
        new Sportsman(cyclicBarrier);
    }

    static class Run extends Thread {
        @Override
        public void run() {
            System.out.println("Run is began");
        }
    }
    static class Sportsman extends Thread {
        CyclicBarrier cyclicBarrier;

        public Sportsman(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
            start();
        }

        @Override
        public void run() {
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
