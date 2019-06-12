package chuanzhi0604._0605;

public class MyClass {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();

        System.out.println("==========");

        // 直接创建内部类对象
        Body.Heart heart = new Body().new Heart();
        heart.beat();

        System.out.println("======");

        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();

    }
}
