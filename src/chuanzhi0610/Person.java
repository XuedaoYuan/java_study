package chuanzhi0610;

public class Person<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    /*
     * 泛型方法
     * */
    public <E> void methos01(E e){
        System.out.println(e);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                '}';
    }
}
