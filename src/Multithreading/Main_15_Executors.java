package Multithreading;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.concurrent.*;

public class Main_15_Executors {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor(); //если один поток
        ExecutorService executorService1 = Executors.newFixedThreadPool(100); // при разработк
                                                        // понимаем что будет создаваться 100 потоков.
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new MyRunnable());
        System.out.println(service.submit(new MyCallable()).get());
        service.shutdown();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(1);
        }
    }

    static class MyCallable implements Callable {
        @Override
        public String call() throws Exception {
            return "2";
        }
    }
}
