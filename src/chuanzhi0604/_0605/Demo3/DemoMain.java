package chuanzhi0604._0605.Demo3;

import java.util.List;

public class DemoMain {
    public static void main(String[] args) {

        Hero h = new Hero();
        h.setName("盖伦");
        h.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("hen ha hen ha!!");
            }
        });

        h.attack();


    }
}
