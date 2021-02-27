package Task1;

import java.util.concurrent.Executors;

public class ExecutorService {
    public static void main(String[] args) throws InterruptedException {
        java.util.concurrent.ExecutorService executorService = Executors.newFixedThreadPool(5);

        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            counter += i;
            Main m = new Main(counter);
            executorService.submit(m);
        }

        executorService.shutdown();
        Thread.sleep(2000);
        if (executorService.isTerminated()) {
            System.out.println("Executor Service has been finished.");
        }
    }
}
