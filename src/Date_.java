import java.text.SimpleDateFormat;
import java.util.Date;

//import java.lang.Thread;
public class Date_ {
    public static void main(String[] args) {
        Date d = new Date();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
        d = new Date();

      /*  long time = d.getTime();
        System.out.println(time);
        d.setTime(time);
        System.out.println(d.toString());*/

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(ft.format(d));

        System.out.println(System.currentTimeMillis());
    }
}
