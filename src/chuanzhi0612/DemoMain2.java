package chuanzhi0612;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoMain2 {
    public static void main(String[] args) throws IOException {
        // 追加内容
        FileOutputStream fos = new FileOutputStream(new File("/Users/cloud/Desktop/frontEndTestCode/java_study_05_06/src/chuanzhi0612/a.txt"), true);
        fos.write(98);
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\n".getBytes());
        }
        fos.close();
    }
}
