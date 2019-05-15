import java.util.regex.*;

public class Regex_ {
    public int getSum(int a, int b){
        return a + b;
    }
    // 方法的重载
    public double getSum(double a, double b){
        return a + b;
    }
    public static void main(String[] args) {
        String content = "asdas_xdyuan_ssss";
        String pattern = ".*xdyuan.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println(isMatch);

        String line = "this is a test for 3000 times!";
        pattern = "(\\D+)(\\d+)(.*)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if(m.find()){
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));

        }else {
            System.out.println("No Matched!");
        }
    }
}
