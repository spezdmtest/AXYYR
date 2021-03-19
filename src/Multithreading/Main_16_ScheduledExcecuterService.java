package Multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main_16_ScheduledExcecuterService {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(new myThread(),3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
    static class myThread extends Thread {
        @Override
        public void run() {
            System.out.println(1);
        }
    }
}
