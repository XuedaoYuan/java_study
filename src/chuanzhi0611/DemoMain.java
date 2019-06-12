package chuanzhi0611;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoMain {
    public static void main(String[] args) /*throws ParseException*/ {
        MyInterfaceImpl mi = new MyInterfaceImpl();
        mi.method("xdyuan");

        MyInterfaceImpl2<String> mi2 = new MyInterfaceImpl2<>();
        mi2.method("hello");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse("20199-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }

}