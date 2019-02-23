import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 4.Try shutdown() and shutdownNow() and observe the difference.
// 5.Use isShutDown() and isTerminate() with ExecutorService.

public class Question4n5{

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1"); 
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2"); 
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(3000L);
                        System.out.println("Thread 3");
                    } catch (InterruptedException e) {
                       // e.printStackTrace();
                      System.out.println("sleep interrupted due to shutdown now");
                    }
       
                }
            });
        } finally {
            executorService.shutdownNow();
        }

        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
        System.out.println("End");
    }
}
