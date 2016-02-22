public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread0 = new Thread(new MyRunnable("Hello!"));
        Thread thread1 = new Thread(new MyRunnable("Bye!"));
        thread0.start();
        thread1.start();
        thread0.join(); // "Main" точно напечатается после "Hello!"
        System.out.println("Main");
    }
}
