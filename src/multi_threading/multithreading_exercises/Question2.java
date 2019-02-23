//2.Use sleep and join methods with thread.

public class Question2{

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000L);
                    System.out.println("Running 1st Thread");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000L);
                    System.out.println("Running 2nd Thread");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        //it will wait for the completion of thread1 and thread2 and then execute statement following it
        System.out.println("Ended....");
    }
}