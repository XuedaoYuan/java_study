package chuanzhi0604;

public interface MyInterface {
    public void methodA();

    public void methodB();

    public default void methodC() {
        System.out.println("默认方法");
    }
}
