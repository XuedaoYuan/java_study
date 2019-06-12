package chuanzhi0604._0605.Demo2;

public class DemoMain {
    public static void main(String[] args) {
        Hero gareen = new Hero("盖伦", 20);

        Weapon weapon = new Weapon("ak-47");
        gareen.setWeapon(weapon);

        System.out.println(gareen.getWeapon().getName());
    }
}
