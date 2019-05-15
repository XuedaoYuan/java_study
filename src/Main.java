public class Main {
    public static void main(String[] args) {
        System.out.println("hello, world!");

        String name = "xdyuan";
        /*boolean ret = name instanceof String;
        System.out.println(ret);*/

        /*for (int i = 0, len = 10; i < len; i++) {
            System.out.println(i);
        }*/

        int[] arr = {1, 2, 3, 4};
        for (int x : arr) {
            System.out.println(x);
        }

//        switch ()

        Integer index = 10;
        System.out.println(Integer.valueOf(index));
        System.out.println("=========");
        Character c = new Character('A');
        System.out.println(c);
        String s = "xxxx\tbbbb";
        System.out.println(s);

        /*
         * String
         * */
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String s2 = new String(chars);
        System.out.println(s2);
        System.out.println("length = " + s2.length());
        System.out.printf("浮点数%f", 1.33f);
//        String.format("浮点数%f,证书%d", 1.33f, 22);
        System.out.println(s2.hashCode());


    }
}