package Task2;

import Task1.Main;

import java.util.Random;

public class Main2 implements Runnable {
    Random random = new Random();
    int num = random.nextInt(10);

    public void add() {
        for (int i = 0; i < num; i++) {
            synchronized (this) {
                System.out.println(Thread.currentThread());
                System.out.println("Hello " + i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Main2 m = new Main2();
        Thread t = new Thread(m);
        Thread t1 = new Thread(m);
        t.setPriority(5);
        t.start();
        t1.start();
        Thread.sleep(1000);
        System.out.println("World!");
    }

    @Override
    public void run() {
        add();
    }

}
