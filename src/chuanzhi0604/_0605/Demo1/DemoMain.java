package chuanzhi0604._0605.Demo1;

public class DemoMain {
    public static void main(String[] args) {
//        匿名内部类
        /*
        * 使用唯一的一次
        * */
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名类实现了方法");
            }
        };

        obj.method();
    }
}
