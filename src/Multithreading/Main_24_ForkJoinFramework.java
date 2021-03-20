package Multithreading;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Main_24_ForkJoinFramework {
    static long numOfOperations = 10_000_000_000L;
    static int numOfThread = Runtime.getRuntime().availableProcessors();
    public static void main(String[] args) {
        System.out.println(numOfThread);
        System.out.println(new Date());
        ForkJoinPool pool = new ForkJoinPool();
//    long j = 0;
//    for(long i = 0; i <numOfOperations ; i++) {
//        j += i;
//    }
//    System.out.println(j);
        System.out.println(pool.invoke(new MyFork(0,numOfOperations)));
        System.out.println(new Date());
    }
    static class MyFork extends RecursiveTask<Long> {

        long from,to;

        public MyFork(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Long compute() {
            if ((to-from) <= numOfOperations/numOfThread) { //если операция разбита,
                //на достаточное колличество
                //частей то
                //выполняем операцию
                long j = 0;
                for (long i = 0; i < to; i++) {
                    j += i;
                }
                return j;
            }else {
                //то разбиваем на части поменьше
                long middle = (to + from)/2;
                MyFork firstHalf = new MyFork(from, middle);
                firstHalf.fork();
                MyFork secondHalf = new MyFork(middle + 1, to);
                long secondValue = secondHalf.compute();
                return firstHalf.join() + secondValue;
            }
        }
    }
}
