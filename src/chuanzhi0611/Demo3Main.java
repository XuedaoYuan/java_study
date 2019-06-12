package chuanzhi0611;

public class Demo3Main {
    public static void main(String[] args) {


        // Lambda表达式
        method(() -> {
            System.out.println("吃饭了");
        });

        // 匿名表达式的样子
        method(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了2");
            }
        });
    }

    public static void method(Cook cook) {
        cook.makeFood();
    }
}
