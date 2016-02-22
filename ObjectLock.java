public class ObjectLock {
    public static void main(String[] args) throws InterruptedException {
        final Object lock = new Object();
                new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run started");
                synchronized (lock) {
                    System.out.println("Run, I am in...");
                    while (true);
                }
            }
        }).start();
        System.out.println("Main thread sleep");
        Thread.sleep(1000);
        System.out.println("Main thread awake");
        synchronized (lock) {
            System.out.println("Main, I`m in"); // строка не выведется, т.к. synchronized вызвали 2 раза
        }
    }
}
