package chuanzhi0611;

public class Demo2Main {

    public static void main(String[] args) {

//        匿名内部类 实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新的线程");
            }
        }).start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "新的线程");
        }).start();

    }
}
