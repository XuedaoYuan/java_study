package xiancheng;

public class Hero {
    public String name;
    public int hp;
    public int damage;

    public synchronized void revover() {
        hp += 1;
        this.notify();
    }

    public synchronized void hurt() {
        //  血量等于1就等待。 暂时释放资源
        if (hp == 1) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hp -= 1;
    }

    public void attackHero(Hero h) {
        hp -= damage;
        if (h.isDead()) {
            System.out.println(h.name + " 死了");
        }
    }

    public boolean isDead() {
        return hp <= 0;
    }
}
