package Task3;

import java.util.Random;

public class Main implements Runnable {

    public void add() throws InterruptedException {
        Random random = new Random();
        int num = random.nextInt(5);
        for (int i = 0; i < num; i++) {
            Thread.sleep(5000);
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        Thread t = new Thread(m);
        t.start();
    }

    @Override
    public void run() {
        try {
            add();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
