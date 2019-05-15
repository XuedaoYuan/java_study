public class Dog {
    String breed;
    int age;
    String color;
//    构造方法
    public Dog(){

    }
    public Dog(String breed){
        this.breed = breed;
    }
    void bark(){
        System.out.println("wang wang!");
    }
    public static void main(String[] args){
        Dog dog = new Dog("边牧");
//        dog.breed = "哈士奇";
        System.out.println(dog.breed);
    }


}
