package chuanzhi0604._0605;

public class Body {
    public class Heart{
        public void beat(){
            System.out.println("beat beat beat");
            System.out.println("我的name = " + name);
        }
    }

    public void methodBody(){
        Heart heart = new Heart();
        heart.beat();
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
