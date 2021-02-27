package Task2;

import java.util.Random;

public class Main1 extends Thread {

    public void add() {
        Random random = new Random();
        int num = random.nextInt(10);
        for (int i = 0; i < num; i++) {
            synchronized (this) {
                System.out.println(Thread.currentThread());
                System.out.println("Hello World " + i);
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Main1();
        t.start();
    }

    @Override
    public void run() {
        add();
    }
}
