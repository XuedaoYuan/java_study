package chuanzhi0604._0605.Demo3;

public class Hero {
    private String name;
    private Skill skill;

    public void attack() {
        System.out.println(name + "is using skill");
        skill.use();
        System.out.println("finish！！！！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
