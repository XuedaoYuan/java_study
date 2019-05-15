interface Xdyuan {
    public static final String name="xdyuan";
    public void run();
}
public class Interface_ implements Xdyuan {
//    接口包含类要实现的方法

    @Override
    public void run() {
        System.out.println("running！");
    }

    public static void main(String[] args) {
        Interface_ i = new Interface_();
        i.run();
    }
}
