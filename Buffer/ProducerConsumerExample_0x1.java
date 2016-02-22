package Buffer;

import java.util.function.Consumer;

public class ProducerConsumerExample_0x1 {
    public static void main(String[] args) {
        SingleElementBuffer buffer = new SingleElementBuffer();
        new Thread(new Buffer.Consumer(buffer)).start();
    }

}
