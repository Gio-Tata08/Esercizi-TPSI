public class Main {
    public static void main(String[] args) {
        Buffered buffer = new Buffered();
        Producer producer = new Producer(buffer);
        producer.start();
        Consumer consumer = new Consumer(buffer);
        consumer.start();
    }
}