package chuanzhi0611_file;

import java.io.File;

public class DemoMain1 {

    public static void main(String[] args) {
        String separator = File.separator;
        System.out.println(separator);

        File file = new File("a.txt");
        System.out.println(file);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.length());


        show01();
    }

    private static void show01() {
    }
}
