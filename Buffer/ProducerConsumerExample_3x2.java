package Buffer;

public class ProducerConsumerExample_3x2 {
    public static void main(String[] args) {
        SingleElementBuffer buffer = new SingleElementBuffer();
        new Thread(new Producer(1, 300, buffer)).start();
        new Thread(new Producer(100, 500, buffer)).start();
        new Thread(new Producer(1000, 700, buffer)).start();

        new Thread(new Consumer(buffer)).start();
        new Thread(new Consumer(buffer)).start();
    }

}
