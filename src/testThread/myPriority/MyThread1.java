package testThread.myPriority;

import java.util.Random;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                new Random().nextInt();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("¡ï¡ï¡ï¡ï¡ï Thread 1 use time = " + (end - start));
    }

}
