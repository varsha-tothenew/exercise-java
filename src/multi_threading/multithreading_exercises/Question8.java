package multi_threading.multithreading_exercises;
//8.Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Question8{

    public static void main(String[] args) {

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        try {
            executorService.scheduleWithFixedDelay(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000L);
                        System.out.println("ScheduleWithFixedDelay Scheduled Task to executed after fixed interval");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, 0, 1, TimeUnit.SECONDS);
            executorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000L);
                        System.out.println("ScheduleAtFixedRate Scheduled Task to executed after fixed interval");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, 0, 1, TimeUnit.SECONDS);

            executorService.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Task executed after 1 second");
                }
            }, 3, TimeUnit.SECONDS);
        } finally {
            executorService.shutdown();
        }

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        try {
            scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread 1 ");
                }
            }, 0, 1, TimeUnit.SECONDS);
            scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread 2");
                }
            }, 0, 1, TimeUnit.SECONDS);
            scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread 3 ");
                }
            }, 0, 1, TimeUnit.SECONDS);
        } finally {
            scheduledExecutorService.shutdown();
        }
    }
}
