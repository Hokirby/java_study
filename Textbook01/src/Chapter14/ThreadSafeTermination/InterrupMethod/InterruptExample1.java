package Chapter14.ThreadSafeTermination.InterrupMethod;

public class InterruptExample1 {
    public static void main(String[] args) {
        Thread thread = new PrintThread1();
        thread.start();

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        thread.interrupt();
    }
}
