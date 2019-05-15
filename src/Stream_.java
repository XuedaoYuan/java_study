import java.io.*;

public class Stream_ {
    public static void main(String[] args) throws IOException {
       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        String str;
        do{
            str = br.readLine();
            System.out.println(str);
        }while(!str.equals("end"));*/


       /* File f = new File("../file/index.js");
        InputStream is2 = new FileInputStream(f);*/

        /*byte[] bWrites = {1, 2, 3, 5, 4, 9, 7};
        OutputStream os = new FileOutputStream("test.txt");
        for(byte x : bWrites){
            os.write(x);
        }
        os.close();*/

       /* InputStream is = new FileInputStream("test.txt");
        int size = is.available();
        for (int i = 0; i < size; i++) {
            System.out.println(is.read() + " ");
        }
        is.close();*/

       /* File f = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(f);

        // 写入流
        OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF-8");
        writer.append("中文输入");
        writer.append("\r\n");
        writer.append("Enflis");
        writer.close();
        fos.close();

        FileInputStream fis = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fis, "UTF-8");

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
        }
        System.out.println(sb.toString());

        reader.close();
        fis.close();*/

       String dirName = "/tmp/user/java/bin";
       File f = new File(dirName);
       // 创建目录和子目录
       f.mkdirs();


    }
}
