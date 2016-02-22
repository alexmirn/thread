import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static final int N = 10_000_000;
    public static int counter = 0;
//    public volatile static int counter = 0; // volatile не помогает
//    public static AtomicInteger counter = new AtomicInteger(); // помогает и операции в потоках выполняются друг за другом
  public static synchronized void inc() { // тоже помогает, внутри метода выполняется не более одного потока
      counter++;
  }

    public static void main(String[] args) throws InterruptedException {
        Thread t0 =  new Thread(new Runnable() {
            @Override
            public void run() {
//                for (int i = 0; i < N; i++ ) counter++;
//                for (int i = 0; i < N; i++ ) counter.incrementAndGet();
                for (int i = 0; i < N; i++) inc();
            }
        });
        t0.start();
        Thread t1 =  new Thread(new Runnable() {
            @Override
            public void run() {
//                for (int i = 0; i < N; i++ ) counter++;
//                for (int i = 0; i < N; i++ ) counter.incrementAndGet();
                for (int i = 0; i < N; i++) inc();
            }
        });
        t1.start();

        t0.join();
        t1.join();
        System.out.println(counter);
    }
}
