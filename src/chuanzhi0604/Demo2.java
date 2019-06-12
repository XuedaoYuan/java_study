package chuanzhi0604;

public class Demo2 implements MyInterface {
    private String name;
    private int age;
    private final Boolean sex = true;

    public Demo2() {
    }

    public Demo2(String name) {
        this.name = name;
    }

    public Demo2(int age) {
        this.age = age;
    }

    public Demo2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }
}
