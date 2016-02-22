public class Daemon {
    public static void main(String[] args) throws InterruptedException {
        Thread thread =  new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Hello!");
                }
            }
        });
        thread.setDaemon(true); // поток закроется, когда закроется main
//        thread.yield(); прекратить выпонение на один такт, после выполнения задачи потока
        thread.start();
//        System.out.println(Thread.currentThread().getName()); // напечатать имя текущего потока
        System.out.println("Bye.....");
    }
}
