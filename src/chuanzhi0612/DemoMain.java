package chuanzhi0612;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class DemoMain {
    /*
     * FileOutputStream 字节输出流  用书内存的数据到硬盘
     * jvm -> os -> 系统方法
     * */
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/cloud/Desktop/frontEndTestCode/java_study_05_06/src/chuanzhi0612/a.txt");
        fos.write(97);
        byte[] b = {65, 66, 67, 68};
        fos.write(b);

       /* String str = "12345";
        int len = str.length();
        byte[] c = new byte[len];
        for (int i = 0; i < len; i++) {
            char _c = str.charAt(i);
            c[i] = (byte)_c;
        }
        fos.write(c);*/

        String str = "你好";
        byte[] bytes = str.getBytes(); // [-28, -67, -96, -27, -91, -67]
        System.out.println(Arrays.toString(bytes));
        fos.write(bytes);

        fos.close();
    }
}
