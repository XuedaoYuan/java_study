package chuanzhi0614;

import java.io.*;

public class DemoMain1 {
    /*
     * BufferedOutputStream 字符缓冲输出流
     *   效率比单纯的字符流要高
     * Writer Reader 是字节流
     * */
    public static String path = "/Users/cloud/Desktop/frontEndTestCode/java_study_05_06/src/chuanzhi0614/b.txt";

    public static void main(String[] args) throws IOException {
        main2();
    }

    private static void main1() throws IOException {

        //
        FileOutputStream fos = new FileOutputStream(path);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write("写入的测试数据".getBytes());

        bos.close();
    }

    private static void main2() throws IOException {
        FileInputStream fis = new FileInputStream(path);
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len = 0;
        while ((len = bis.read()) != -1) {
            System.out.println(len);
        }
        bis.close();
    }
}
