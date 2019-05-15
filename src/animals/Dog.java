package animals;

public class Dog implements Animal {
    public String type;

    public Dog(String type) {
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println(this.type + " is eating!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("哈士奇");
        dog.eat();
    }
}
