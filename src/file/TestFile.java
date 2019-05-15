package file;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        File f = new File("Home/LOL.exe");
        System.out.println("文件是否存在：" + f.exists());
        System.out.println("绝对lujing=" + f.getAbsolutePath());
    }
}
