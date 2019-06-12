package chuanzhi0612;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoMain4 {
    /*
     * 字符流 java.io.Reader
     * 以字符的形式读取文件
     * */
    public static String path = "/Users/cloud/Desktop/frontEndTestCode/java_study_05_06/src/chuanzhi0612/b.txt";

    public static void main(String[] args) throws IOException {
//        frMain();
        fwMain();
    }

    public static void frMain() throws IOException {

        FileReader fr = new FileReader(path);
        /*int len = 0;
        while((len = fr.read()) != -1){
            System.out.print((char)len);
        }*/

        int len = 0;
        char[] cs = new char[1024];
        while ((len = fr.read(cs)) != -1) {
            System.out.println(new String(cs, 0, len));
        }

        fr.close();
    }

    public static void fwMain() throws IOException {
        FileWriter fw = new FileWriter(path, true);
        fw.write("hello, world");
        fw.flush(); // 刷新内存缓冲区的内容到硬盘

        fw.write("xxxx");
        fw.close();
    }
}
