package chuanzhi0611;

public class MyInterfaceImpl2<E> implements MyInterface<E> {
    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
