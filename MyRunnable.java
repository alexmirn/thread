public class MyRunnable implements Runnable{
    private String phrase;

    public MyRunnable(String phrase) {
        this.phrase = phrase;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) System.out.println(phrase);
    }
}
