public class BasicDataType {
    // 类变量
    static double d = 0.01;
    //    实例变量
    String name = "xdyuan";
    public static void main(String[] args) {
        char v = 'V';
        byte a = 100;
        System.out.println(a);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        float f = 2.4f;
        int i = (int) f;
        System.out.println(i);

        System.out.println(BasicDataType.d);
    }

}
