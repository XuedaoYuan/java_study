package xiancheng;

public class TestThread {
    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo("Thread1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Thread2");
        R2.start();
    }
}
