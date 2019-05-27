package charactor;

public class Hero {
    static String copyRight;
    static {
        System.out.println("初始化copyRight");
        copyRight = "版权由Riot Games公司所有";
    }
    public String name;
    public int hp;
    public Hero(){

    }

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString() {
        return name;
    }

    // 下面的同步效果一致
    public synchronized void recover() {
        this.hp += 1;
    }

    public void hurt() {
        synchronized (this) {
            this.hp -= 1;
        }

    }

    public boolean isDead() {
        return this.hp <= 0;
    }

}
