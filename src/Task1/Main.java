package Task1;

public class Main extends Thread {
    private int counter;

    public Main(int counter) {
        this.counter = counter;
    }

    public void put() {
        System.out.println(Thread.currentThread() + " start");
        System.out.println(counter);
        System.out.println(Thread.currentThread() + " end");
    }

    @Override
    public void run() {
        put();
    }
}
