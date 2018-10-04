package Lab03;

public class Main {
    public static void main(String[] args) {
        Item item = new Item();
        Producer producer = new Producer(item);
        Consumer consumer = new Consumer(item);

        Thread pThread = new Thread(producer);
        Thread cThread = new Thread(consumer);

        pThread.start();
        cThread.start();
    }
}
