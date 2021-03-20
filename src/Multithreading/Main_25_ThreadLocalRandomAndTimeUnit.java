package Multithreading;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Main_25_ThreadLocalRandomAndTimeUnit {
    public static void main(String[] args) throws InterruptedException {
     //   System.out.println(Math.random()); // в многопоточных приложениях не используется
     //   System.out.println(ThreadLocalRandom.current().nextInt()); // а этот класс используется
         System.out.println(TimeUnit.DAYS.toSeconds(14));
    }
}
