package chuanzhi0612;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoMain3 {
    public static void main(String[] args) throws IOException {

       /* File file = new File("/Users/cloud/Desktop/frontEndTestCode/java_study_05_06/src/chuanzhi0612/b.txt");
        FileInputStream fis = new FileInputStream(file);
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.print((char)len);
        }
        fis.close();*/

        copyFile();
    }

    public static void copyFile() throws IOException {
        File file = new File("/Users/cloud/Desktop/frontEndTestCode/java_study_05_06/src/chuanzhi0612/3.jpeg");
        File file2 = new File("/Users/cloud/Desktop/frontEndTestCode/java_study_05_06/src/chuanzhi0612/4.jpeg");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file2);
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        fis.close();
        fos.close();
    }
}
