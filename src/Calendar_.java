import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1);
        c1.set(2019, 9, 12);
        c1.set(Calendar.DATE, 24);
        c1.set(Calendar.YEAR, 2022);

        System.out.println(c1.get(Calendar.YEAR) + "-" + c1.get(Calendar.MONTH) + "-" + c1.get(Calendar.DATE));
    }
}
