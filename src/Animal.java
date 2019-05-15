public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println(this.name + " eating");
    }

    public static void main(String[] args) {
        Mouse m = new Mouse("米老鼠");
        m.eat();
    }
}

class Mouse extends Animal {
    public Mouse(String name){
        super(name);
    }
}
