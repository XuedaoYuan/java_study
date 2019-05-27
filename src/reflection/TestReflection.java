package reflection;

import charactor.Hero;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class TestReflection {

    public static void main(String[] args) {
        String className = "charactor.Hero";
        try {
            // 获取类对象会导致静态属性被初始化，而且只会执行一次，只有Hero.class不会导致静态属性初始化
            Class pClass1 = Class.forName(className);
            Class pClass2 = Hero.class;
            Class pClass3 = new Hero().getClass();
            System.out.println(pClass1 == pClass2);
            System.out.println(pClass1 == pClass3);

            // 通过反射机制创建一个对象
            /*try {
                Constructor c = pClass2.getConstructor();
                Hero h = (Hero) c.newInstance();
                h.name = "xxx";
                System.out.println(h);
            } catch (Exception e) {
                e.printStackTrace();
            }*/

            // 利用反射机制修改对象属性值
            /*
            * getField和getDeclaredField的区别
这两个方法都是用于获取字段
getField 只能获取public的，包括从父类继承来的字段。
getDeclaredField 可以获取本类所有的字段，包括private的，但是不能获取继承来的字段。 (注： 这里只能获取到private的字段，但并不能访问该private字段的值,除非加上setAccessible(true))
            * */
            Hero h = new Hero("gareen");
            System.out.println(h);
            try{
                Field f1 = h.getClass().getDeclaredField("name");
                f1.set(h, "timo");
                System.out.println(h);
            }catch(Exception e){
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}