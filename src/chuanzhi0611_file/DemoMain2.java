package chuanzhi0611_file;

import java.io.File;
import java.io.IOException;

public class DemoMain2 {

    public static void main(String[] args) {
      /*  File f1 = new File("/Users/cloud/Desktop/frontEndTestCode/java_study_05_06/src/chuanzhi0611_file/xdyuan.md");
        try {
            boolean newFile = f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        show02();
    }

    public static void show01() {
        File f = new File("xinjianwneben");
        f.mkdir();

        f.delete();
    }

    public static void show02() {
        File f = new File("/Users/cloud/Desktop/frontEndTestCode/java_study_05_06/src");
        if (f.exists()) {
//            String[] list = f.list();
            File[] files = f.listFiles();
            for (File file : files) {
//                System.out.println(s);
                System.out.println(file.getAbsolutePath());

            }
        }

    }
}
