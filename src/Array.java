import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int size = 5;
        double[] dbs = new double[size];
        dbs[0] = 1.22;
        dbs[1] = 1.22;
        dbs[2] = 1.22;
        dbs[3] = 1.22;
        dbs[4] = 1.22;
        double sum = 0;
        for (byte i = 0, len = (byte) dbs.length; i < len; i++) {
            sum += dbs[i];
        }
        System.out.println("sum = " + sum);
        sum = 0;
        for (double x : dbs) {
            sum += x;
        }
        System.out.println("sum = " + sum);

        long[] a = {1, 2, 3};
        long[] a2 = {1, 2, 3};
        boolean ret = Arrays.equals(a, a2);
        System.out.println("ret = " + ret);

        int[] ints = new int[10];
        // 填充数组
        Arrays.fill(ints, 10);
        for(int x : ints){
            System.out.println(x);
        }

        short[] sts = {1, 3, 2, 7, 6, 5};
        Arrays.sort(sts);
    }
}
