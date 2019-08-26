package chuanzhi0617.ssrc;

import java.lang.reflect.Method;

@Pro(className = "chuanzhi0617.ssrc.Demo1", methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        /**
         * 注解解析
         */

        // 获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;

        // 获取上边的注解对象
        // 其实就是在内存里生成了该类注解接口的子类实例对象
        Pro pro = reflectTestClass.getAnnotation(Pro.class);

        // 现在可以调用方法获取返回值了
        String className = pro.className();
        String methodName = pro.methodName();
        System.out.println(className + "---" + methodName);

        Class<?> demo1Class = Class.forName(className);
        Object demo1 = demo1Class.newInstance();
        Method show = demo1Class.getMethod("show");
        show.invoke(demo1);

    }
}
