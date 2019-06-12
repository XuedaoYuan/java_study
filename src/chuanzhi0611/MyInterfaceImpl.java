package chuanzhi0611;

public class MyInterfaceImpl implements MyInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
