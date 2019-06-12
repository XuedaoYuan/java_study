package chuanzhi0604;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("xxx");
        list.add("yyy");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        char[] chars = {'h', 'e'};
        String s = new String(chars);
        System.out.println(s);
    }
}
