package Buffer;

public class ThreadUtils {
    public static void sleep(long sleepTime) {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }

}
