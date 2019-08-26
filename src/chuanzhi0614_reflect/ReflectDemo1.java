package chuanzhi0614_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo1 {

    public static void main(String[] args) throws Exception {

        /**
         * 获取类对象的三种方式
         *
         * Class pClass1=Class.forName(className);
         * Class pClass2=Hero.class;
         * Class pClass3=new Hero().getClass();
         */


        Class personClass = Person.class;

        /**
         * getFields() 获取所有public修饰的成员变量
         * getField() 获取指定的成员变量
         *      1、设置值 set
         *      2、获取值 get
         */
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Field a = personClass.getField("a");
        System.out.println(a);
        System.out.println("==============");
        Person p = new Person();
//        p.a = "aaaaa";
        // 设置值
        a.set(p, "aaaaa");
        Object o = a.get(p);
        System.out.println(o); // "aaaaa"


        System.out.println("+========");
        /**
         * getDeclaredFields 获取所有的成员变量
         * getDeclaredField 获取单个成员变量
         */
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("===========");
        Field name = personClass.getDeclaredField("name");
        // 忽略私有属性的安全检查
        name.setAccessible(true);//  暴力反射
        name.set(p, "xdyuan");
        Object o1 = name.get(p);
        System.out.println(o1);


        /**
         * 获取构造函数 getConstructor
         * 根据参数获取不同的构造函数
         */
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        Object person2 = constructor.newInstance("张三", 22);
        System.out.println(person2);

        // 空参形式可以参考下面
        Object person3 = personClass.newInstance();
        System.out.println(person3);

        System.out.println("======");
        /**
         * 获取方法 getMethod
         * 获取所有的方法 getMethods 包括继承的方法
         */

        Method eat_method = personClass.getMethod("eat", String.class);
        // 获取方法名称
        String name1 = eat_method.getName();
        System.out.println(name1);
        // 执行方法
        eat_method.invoke(person3, "apple");


        /**
         * 获取类名 getName
         */
        String classname = personClass.getName();
        System.out.println(classname);



    }
}
