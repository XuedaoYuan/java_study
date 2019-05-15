public class StringBufferBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("xdyuan");
        sb.append(".com");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.insert(5,"YXD");
        System.out.println(sb);
    }
}
