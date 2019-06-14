[TOC]

JRE java运行时库

JDK 开发工具包

J2EE 企业级技术规范，包含JMS Servlet JSP EJB JPA

tar *nix下的打包工具

jar： JAVA Archive 归档 编译生成的class文件 打包成jar

war：Web Application Archive java web 应用程序包



# JAVA

#### 源文件申明规则

- 一个源文件中只能有一个public类
- 一个源文件可以有多个非public类
- 源文件的名称应该和public类的类名保持一致。例如：源文件中public类的类
- 名是Employee，那么源文件应该命名为Employee.java。
- 如果一个类定义在某个包中，那么package语句应该在源文件的首行。
- 如果源文件包含import语句，那么应该放在package语句和类定义之间。如果没有package语句，那么import语句应该在源文件中最前面。
- import语句和package语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。



#### 基本数据类型

8种基本类型，6个数字类型（4个证书类型， 两个浮点型）一种字符类型 一种布尔型

1. byte

   8位， 有符号， 二进制补码表示的整数

   byte a = 100;

2. short

   16位

3. int

4. long

5. float

6. double

7. boolean

8. char



#### 类型自动转换

精度从低到高

从高到低必须强制转换  语法 byte b = (byte) 123; 但是可能会有精度损失



```java
char a = 'a';
int a1 = a; //a1 => 97  这是自动转换

int b = 123；
byte c = (byte)b; // 强制转换
```



#### 修饰符

##### 访问修饰符

- default（缺省）同一包内可见，不使用任何修饰符 用于类，接口，变量，方法
- private 同一类内可见 用于：变量， 方法， 不能修饰类
- public 对所有类可见， 用于：类， 接口， 变量， 方法
- protected 对同一包内的类和所有子类可见 用于 对象， 变量，方法



- 父类中声明为 public 的方法在子类中也必须为 public。
- 父类中声明为 protected 的方法在子类中要么声明为 protected，要么声明为 public，不能声明为 private。
- 父类中声明为 private 的方法，不能够被继承。

##### 非访问修饰符

- static 修饰类方法和类变量

  静态变量：

  独立于对象的静态变量， 无论一个类被实例化多少次，静态变量永远只有一份拷贝， 也叫做**类变量**，局部变量不能声明为static变量

  静态方法：

  独立于对象的静态方法，静态方法不能使用类的非静态变量， 从参数列表获取数据

  可以直接通过classname.var  classname.method

- final

  final 变量： 其实就是常量，只初始化一次，不能指向别的地址 

  ```
  final int val = 10;
  public static final BOXWIDTH = 6; //公开的静态常量
  static final String TITLE = "Manager" 
  ```

  final方法： 可以被子类继承， 但是不能被修改

  ```
  public class Test{
      public final void methodName(){
          
      }
  }
  ```

  final 类： 不能被继承， 没有类可以继承final类的任何特性

  ```
  public final class Test{
      
  }
  ```

  ​

- abstract

  抽象类：

  抽象类不能用来实例化对象，声明抽象类的唯一目的是为了将来对类进行扩充。

  不能同时被final修饰， 如果一个类包含抽象方法， 那么该类一定要声明为抽象类，否则就会产生编译错误

  ```
  abstract class Animal{
      private double price;
      pricate String model;
      public abstract void goFast(); //抽象方法
      
  }
  ```

  抽象方法：

  是一种没有任何实现的方法， 必须由子类继承实现

  不能声明成final和static， 

  继承抽象类的子类必须实现父类所有的抽象方法， 除非子类也是抽象类。

  包含抽象方法的类必须声明成抽象类，

  ```java
  public abstract class SuperClass {
      abstract void m();
  }

  class SubClass extends SuperClass{
      //实现抽象类的方法
      void m(){
          ....
      }
  }
  ```

  synchronized

  声明的方法同一时间只能被一个线程访问， 可以用于四个访问修饰符

  ```java
  public synchronized void showDetail(){
      ...
  }
  ```

  **transient** 

  修饰实例变量时，JVM跳过该特定的变量， 用来预处理类和变量的数据类型

  ```java
  public transient int limit = 55; //不会持久化
  public int b; //持久化
  ```

  **volatile**

  volatile 修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。

  #### Number类

  基本数据类型的抽象类， 就是Number类

  - Integer

    ```java
    Integer x = 10;
    x += 5; //==> 15
    ```

    ​

  - Long

  - Byte

  - Double

  - Float

  - Short

  #### Math类



#### StringBuffer StringBuilder

需要对字符串进行修改的类

StringBuilder不是线程安全的， 但是有速度优势，一般建议StringBuilder, 但是要求线程安全则必须使用StringBuffer



#### Arrays类 

提供的所有的静态方法都能很好的操作数组

- 给数组赋值：通过 fill 方法。
- 对数组排序：通过 sort 方法,按升序。
- 比较数组：通过 equals 方法比较数组中元素值是否相等。
- 查找数组元素：通过 binarySearch 方法能对排序好的数组进行二分查找法操作

#### Calendar 类

我们现在已经能够格式化并创建一个日期对象了，但是我们如何才能设置和获取日期数据的特定部分呢，比如说小时，日，或者分钟? 我们又如何在日期的这些部分加上或者减去值呢? 答案是使用Calendar 类。



Calendar类中用以下这些常量表示不同的意义，jdk内的很多类其实都是采用的这种思想

| Calendar.YEAR         | 年份                           |
| --------------------- | ------------------------------ |
| Calendar.MONTH        | 月份                           |
| Calendar.DATE         | 日期                           |
| Calendar.DAY_OF_MONTH | 日期，和上面的字段意义完全相同 |
| Calendar.HOUR         | 12小时制的小时                 |
| Calendar.HOUR_OF_DAY  | 24小时制的小时                 |
| Calendar.MINUTE       | 分钟                           |
| Calendar.SECOND       | 秒                             |
| Calendar.DAY_OF_WEEK  | 星期几                         |

```java
Calendar c = Calendar.getInstance();   //当前时间   
  System.out.println(c);                        
Calendar c1 = Calendar.getInstance();           
c1.set(2018, 8-1, 6); //设定特定日期                  
                                                
System.out.println(Calendar.YEAR);              
System.out.println(Calendar.MONTH);             
                                                
                                                
// 将c1对象的日期设置为10， 其他都会重新计算                      
c1.set(Calendar.DATE, 10);                      
                                                
c1.add(Calendar.DATE, 10); //表示c1原来的10天后的时间 -10就是10天前    
                                                
int year = c1.get(Calendar.YEAR);               
System.out.println(year);                       
int month = c1.get(Calendar.MONTH + 1;          
System.out.println(month);                      
int date = c1.get(Calendar.DATE);               
System.out.println(date);                       
```

#### Scanner类

处理用户输入和输出

```java
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        if (scan.hasNext()) {
            String str = scan.next();
            System.out.println(str);
        }

//        scan.close();

        /*
next() 与 nextLine() 区别
next():

1、一定要读取到有效字符后才可以结束输入。
2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
next() 不能得到带有空格的字符串。
nextLine()：

1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
2、可以获得空白。
        *
        * */

        double sum = 0;
        while(scan.hasNextDouble()){
            double x = scan.nextDouble();
            System.out.println(x);
            sum += x;

        }

        System.out.println("total = " + sum);


        scan.close();



    }
}

```

#### 异常

![image-20180808165101027](/var/folders/db/7574691s4_z_z2n06_w05h7w0000gn/T/abnerworks.Typora/image-20180808165101027.png)

非检查性异常 可以通过编译， 但是有异常会直接抛给控制台

检查性异常 Exception 不处理编译无法通过， 也是非运行时异常

运行时异常 RuntimeException 就是非检查性异常





果一个方法没有捕获一个检查性异常，那么该方法必须使用 throws 关键字来声明。throws 关键字放在方法签名的尾部。

也可以使用 throw 关键字抛出一个异常，无论它是新实例化的还是刚捕获到的。

```java
import java.io.*;
public class className
{
  public void deposit(double amount) throws RemoteException
  {
    // Method implementation
    throw new RemoteException();
  }
  //Remainder of class definition
}
```

一个方法可以声明抛出多个异常，多个异常之间用逗号隔开。

例如，下面的方法声明抛出 RemoteException 和 InsufficientFundsException：

```java
import java.io.*;
public class className
{
   public void withdraw(double amount) throws RemoteException,
                              InsufficientFundsException
   {
       // Method implementation
   }
   //Remainder of class definition
}
```

##### finally

```
try{
    
}catch(){
    
}finall{
    
}
```

#### throw throws

1、throws 出现在方法声明上， 而throws通常出现在方法内部

2、throws 表示出现异常的一种可能性，并不一定会发生，throw则是抛出了异常，执行throw则一定抛出了某个异常对象。

```java
//这个方法不处理异常， 通过throws抛出异常，调动方法的地方需要捕获异常
    /*
    * try{
    *   method2()
    * }catch(FileNotFoundException e){
    *   ...
    * }
    *
    *
    * */
    public static void method2() throws FileNotFoundException{
        File f = new File("../LOL.exe");
        new FileInputStream(f);
    }
```



可查异常： 需要强制捕获

非可查异常： 运行时异常， 错误（一般是内存溢出错误）

#### Throwable

Throwable是类，Exception和Error都继承了该类
所以在捕捉的时候，也可以使用Throwable进行捕捉
如图： 异常分Error和Exception
Exception里又分运行时异常和可查异常。

![image-20180906120251869](/var/folders/db/7574691s4_z_z2n06_w05h7w0000gn/T/abnerworks.Typora/image-20180906120251869.png)

#### 继承的特性

- 子类拥有父类非private的属性， 方法
- 子类可以拥有自己的属性和方法， 即子类可以对父类进行扩展
- 子类可以用自己的方式实现父类的方法
- Java的继承就是单继承，但是可以多重继承， 单继承就是一个子类只能继承一个父类，多重继承就是， 比如A继承B， B继承C， 
- 提高了类之间的耦合性，（继承的缺点）



##### extends  implements

所有的类都继承自`java.lang.Object`,



implements可以继承多个接口

```java
public interface A {
    public void eat();
    public void sleep();
}

public interface B {
    public void show();
}

public class C implements A,B{
    
}
```

##### super this 关键字 

super关键字实现对父类的访问

this 关键字指向自己的引用

##### final 关键字

声明的类不能被继承， 既是最终类， 修饰的方法不能被子类重写。

```java
final class {}

(public/private/default/protected) final void methodName(){}
```

final 也可以定义常量

##### 构造器

#### 重写Override  重载Overload

重载 >>>>重写

重写是子类对父类允许访问的方法的实现过程进行重新编写，返回值和形参都不能改变， 即**外壳不变，核心重写**。

重载是在一个类里面， 方法名字相同， 参数和返回值可以不相同，

最常用的就是构造器重载的

- 被重载的方法必须改变参数列表(参数个数或类型不一样)；
- 被重载的方法可以改变返回类型；
- 被重载的方法可以改变访问修饰符；
- 被重载的方法可以声明新的或更广的检查异常；
- 方法能够在同一个类中或者在一个子类中被重载。
- 无法以返回值类型作为重载函数的区分标准。

```java
class Dog2 extends Animal2{
    public void move(){
        System.out.println("Dog moved!");
    }
    public void bark(){
        System.out.println("Dog is barked!");
    }
    
    public int add(int a, int b){
        return a + b;
    }
//    重载add方法， 必须在一个类里面
    public float add(float a, float b){
        return a + b;
    }
}
```

#### 隐藏

子类重写父类的**类方法**； 就叫隐藏

#### 多态

就是同一个接口， 使用不同的实例而执行不同的结果。

必须条件： **继承 重写 父类引用指向子类的实例**

```java
public class Duotai {
    public static void main(String[] args) {
        Cat3 c = new Cat3();
        Dog3 d = new Dog3();
        show(c);
        show(d);
    }
    public static void show(Animal3 a){
//        a是父类的引用， 指向子类的实例
        a.eat();
        if(a instanceof Cat3){
            Cat3 c = (Cat3) a;
            c.work();
        }else if(a instanceof Dog3){
            Dog3 d = (Dog3) a;
            d.work();
        }
    }
}


abstract class Animal3{
    abstract void eat();
}

class Cat3 extends Animal3{
    public void eat(){
        System.out.println("Cat eat;");
    }
    public void work(){
        System.out.println("Cat work;");
    }
}

class Dog3 extends Animal3{
    public void eat(){
        System.out.println("Dog eat;");
    }
    public void work(){
        System.out.println("Dog work;");
    }
}
```



#### 封装

在面向对象程式设计方法中，封装（英语：Encapsulation）是指一种将抽象性函式接口的实现细节部份包装、隐藏起来的方法。

**封装可以被认为是一个保护屏障，防止该类的代码和数据被外部类定义的代码随机访问。**

要访问该类的代码和数据，必须通过严格的接口控制。

封装最主要的功能在于我们能修改自己的实现代码，而不用修改那些调用我们代码的程序片段。

适当的封装可以让程式码更容易理解与维护，也加强了程式码的安全性

##### 封装的优点

- 良好的封装能够减少耦合。
- 类内部的结构可以自由修改。
- 可以对成员变量进行更精确的控制。
- 隐藏信息，实现细节。

把属性设置成private， 然后定义属性的setter和getter开放。 以此来做到封装



#### 接口 interface

一个类通过继承接口的方式（**implements**）， 来实现继承接口的抽象方法。

类继承了接口， 就要实现接口的所有方法， 除非是抽象类。

接口无法实例化， 只能被类继承来实现。

声明：

```java
interface Person {
    public void eat();
    public void sleep();
    public String returnName();
}
```

接口都是隐式抽象的， 方法也是。 方法必须是public 公开的。

实现：

```java
public class Xdyuan implements Person {
    private String name;
    public Xdyuan(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println("Eat");
    }

    public void sleep(){
        System.out.println("Sleep");
    }
    public String returnName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Xdyuan xd = new Xdyuan("Yuanxue Dao");

        xd.eat();
        xd.sleep();
        String name = xd.returnName();
        System.out.println(name);
    }
}

```

##### 接口的继承（多继承）

接口可以继承其他的接口

```java
interface A {
    public void m1();
}

interface B extends A {
    public void m2();
}
//继承接口B的类必须实现B 和 A 接口的全部方法

//多继承
interface C extends A, B; 
```

##### 标记接口

没有包含任何方法的接口， 用于表明一个类属于一个特定的类型， 建立一个公共的父接口，向一个类添加数据类型。

接口默认方法 default 

#### 包（package）

- 1、把功能相似或相关的类或接口组织在同一个包中，方便类的查找和使用。
- 2、如同文件夹一样，包也采用了树形目录的存储方式。同一个包中的类名字是不同的，不同的包中的类的名字是可以相同的，当同时调用两个不同包中相同类名的类时，应该加上包名加以区别。因此，包可以避免名字冲突。
- 3、包也限定了访问权限，拥有包访问权限的类才能访问某个包中的类。

Java 使用包（package）这种机制是为了防止命名冲突，访问控制，提供搜索和定位类（class）、接口、枚举（enumerations）和注释（annotation）等。

java.lang 打包基础的类

java.io 包含输入输出功能的函数





#### 数据结构

- 枚举（Enumeration）
- 位集合（BitSet）
- 向量（Vector）
- 栈（Stack）
- 字典（Dictionary）弃用
- 哈希表（Hashtable）基本弃用
- 属性（Properties）
- 集合 Collection


##### Vector实现了一个动态数组 同步访问



集合框架

Collection ： List Set Queue

Map: key value



ArrayList 是一个**数组队列，相当于动态数组**。它由数组实现，随机访问效率高，随机插入、随机删除效率低。
　　LinkedList 是一个**双向链表**。它也可以被当作堆栈、队列或双端队列进行操作。LinkedList随机访问效率低，但随机插入、随机删除效率低。
　　Vector 是**矢量队列，和ArrayList一样，它也是一个动态数组，由数组实现**。但是ArrayList是**非线程安全**的，而Vector是**线程安全**的。
　　Stack 是**栈，它继承于Vector**。它的特性是：先进后出(FILO, First In Last Out)。



(01) 对于需要快速插入，删除元素，应该使用LinkedList。
(02) 对于需要快速随机访问元素，应该使用ArrayList。
(03) 对于“**单线程环境**” 或者 “**多线程环境，但List仅仅只会被单个线程操作**”，此时应该使用非同步的类(如ArrayList)。
       对于“**多线程环境**，且List可能同时被多个线程操作”，此时，应该使用同步的类(如Vector)。



LinkedList是链表 访问慢， 插入删除快

ArrayList是连续的地址集合 访问快， 插入删除慢



HashSet 大堆数据有更高的查找效率

HashCode 哈希码 由对象导出的整数值， 其值就是对象的内存地址, 但是String的散列码是对内容的计算， 所以下面是一样的散列码

```java
        String str = "hello";
        int hash = 0;
        for(int i = 0; i<str.length(); i++){
            hash = 31 * hash + str.charAt(i);
        }
        System.out.println(hash);

        String s2 = "hello";
        System.out.println(s2.hashCode());
```

Java的默认的散列单元的大小全部都是2的幂，初始值为16， 假如16条链表中的75%链有数据时， 则认为加载因子达到默认的0.75, HashSet开始重新散列，也就是将原来的散列结构全部抛开，重新开辟一个散列单元为32的散列结果，并重新计算各个数据的存储位置。以此类推。



HashSet 插入性能好， LinkedHashSet 迭代性能好，TreeSet 排序状态。



#### 泛型 generics

编译是类型安全检查机制， 允许程序员在编译时检测到非法的类型。

**本质就是参数化类型， 也就是说操作的数据类型被指定为一个参数**



##### 泛型方法

- 所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前（在下面例子中的<E>）。
- 每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
- 类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
- 泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，不能是原始类型（像int,double,char的等）。



##### 有界的参数类型

限制那些允许被传递到一个类型参数的类型**种类**范围。

要声明一个有界的类型参数，首先列出类型参数的名称，后跟extends关键字，最后紧跟它的上界。

##### 泛型方法

```java
public class GenericMethodTest {

    //有界的参数类型
    public static <T extends  Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
    public static < E > void printArray(E[] inputArray){
        for(E ele : inputArray){
            System.out.printf("%s ", ele);
        }
        System.out.println();
    }
    //泛型
    public static void main(String[] args) {
        Integer[] intArr = {1,2,3,4};
        printArray(intArr);

        Double[] douArr = {1.1, 1.2, 1.3};
        printArray(douArr);

        System.out.println("max = " + maximum(1, 2, 3));
        System.out.println("max = " + maximum(1.1, 2.1, 3.2));
    }
}

```



##### 泛型类

```java
public class GenericClass<T> {
    //泛型类
    private T t;
    public void setT(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
    public static void main(String[] args) {
        GenericClass<Integer> intGeneric = new GenericClass<Integer>();
        intGeneric.setT(new Integer(10));
        System.out.println(intGeneric.get());

        GenericClass<String> gs = new GenericClass<String>();
        gs.setT("Hello");
        System.out.println(gs.get());
    }
}

```

##### 泛型通配符？

这东西不好用

#### 序列化

请注意，一个类的对象要想序列化成功，必须满足两个条件：

1.该类必须实现 java.io.Serializable 对象。

2.该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的。



#### Java网络编程

`java.net`



#### 多线程

##### 线程的生命周四

![image-20180820142741657](/var/folders/db/7574691s4_z_z2n06_w05h7w0000gn/T/abnerworks.Typora/image-20180820142741657.png)

##### 线程的优先级

优先级是一个整数，取值范围`Thread.MIN_PRIORITY(1)~Thread.MAX_PRIORITY(10)`， 默认`Thread.NORM_PRIORITY(5)`

##### 线程的创建方式

###### 1 通过实现Runnable接口来创建线程

```java
class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("createing " + threadName);

    }

    public void run(){
        System.out.println("running " + threadName);
        try {
            for(int i = 0; i< 4; i++){
                System.out.println(threadName + " i = " + i);
                Thread.sleep(50);
            }
        }catch(InterruptedException e){
            System.out.println("Thread "+ threadName + " interrupted!");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
    public void start(){
        System.out.println("Starting " + threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
public class ThreadClass {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("T1");
        r1.start();

        RunnableDemo r2 = new RunnableDemo("T2");
        r2.start();
    }

}

```

###### 2 通过继承Thread来创建线程

```java
class ThreadDemo extends Thread {
   private Thread t;
   private String threadName;
   
   ThreadDemo( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // 让线程睡眠一会
            Thread.sleep(50);
         }
      }catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}
 
public class TestThread {
 
   public static void main(String args[]) {
      ThreadDemo T1 = new ThreadDemo( "Thread-1");
      T1.start();
      
      ThreadDemo T2 = new ThreadDemo( "Thread-2");
      T2.start();
   }   
}
```

###### 3 通过Callable和Future 创建线程





#### 创建线程的3种方式

##### 继承Thread

```java
public class ThreadTest extends Thread{
    public String tName;
    public ThreadTest(String name){
        this.tName = name;
    }

    public void run(){
        int index = 0;
        while(index < 10){
            System.out.println(this.tName + " " + index);
            index++;
        }
    }

    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest("thread1");
        ThreadTest t2 = new ThreadTest("thread2");
        t1.start();
        t2.start();
    }
}

```

#####  继承Runnable接口， 实现run方法实现线程

```
public class RunnabelTest implements Runnable{

    public String name;
    public RunnabelTest(String name){
        this.name = name;
    }

    public void run(){
        int index = 0;
        while(index < 10){
            index++;
            System.out.println(this.name + " " + index);
        }
    }

    public static void main(String[] args) {
        RunnabelTest t1 = new RunnabelTest("t1");
        RunnabelTest t2 = new RunnabelTest("t2");
        new Thread(t1).start();
        new Thread(t2).start();
    }
}
```

##### 匿名类

```
 //匿名类
        Thread T1 = new Thread(){
            public void run(){
                int index = 0;
                while (index < 10){
                    index ++;
                    System.out.println(index + "---------");
                }
            }
        };
        T1.start();

        Thread T2 = new Thread(){
            public void run(){
                int index = 0;
                while (index < 10){
                    index ++;
                    System.out.println(index + "===========");
                }
            }
        };
        T2.start();
```

#### 线程的方法

1. sleep 水面

2. join

   ```

           //代码执行到这里，一直是main线程在运行
           try {
               //t1线程加入到main线程中来，只有t1线程运行结束，主线程才会继续往下走
               t1.join();
           } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
           }
   ```

   ​

3. 设置优先级， 优先级越高获取CPU资源可能越多

   ```
    t1.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
   ```

4. 临时暂停， 可以让其他的线程获取资源

   `Thread.yield();`

5. 守护线程

   当一个进程里面都是守护线程的时候， 进程就会结束， 守护线程一般会被通常用来做日志和性能统计工作。

   ```
    t1.setDaemon(true);
    t1.start();
   ```



#### synchronized

如果一个类， 方法都是有synchronized修饰的， 就叫**线程安全的类**

线程安全的类 HashTable StringBuffer Vector

线程不安全的类 HashMap StringBuilder ArrayList

通过Collections.synchronizedList(arrayList) 可以转换为线程安全的类

#### Lock

```
package Thread;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public static String now() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    public static void log(String msg) {
        System.out.printf("%s %s %s %n", now(), Thread.currentThread().getName(), msg);
    }

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Thread t1 = new Thread() {
            public void run() {
                try {
                    log("线程启动");
                    log("试图占有lock");
                    lock.lock();
                    log("占有lock");
                    log("进行5秒的业务操作");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    log("释放对象lock");
                    lock.unlock();
                }
            }
        };
        t1.setName("t1");
        t1.start();

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }



        Thread t2 = new Thread() {
            public void run() {
                try {
                    log("线程启动");
                    log("试图占有lock");
                    lock.lock();
                    log("占有lock");
                    log("进行5秒的业务操作");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    log("释放对象lock");
                    lock.unlock();
                }
            }
        };
        t2.setName("t2");
        t2.start();
    }
}

```

##### trylock

会在指定时间范围内 **试图占用**，可能占用不成功。 unlock的时候需要判断是否占用成功

## Maven

构建和管理Java相关的工具

pom.xml维护当前项目使用的jar包

Java代码放在 `src/main/java`下面

测试代码放在 `src/test/java`下面

维护一套jar包 共享



final 方法不能覆盖重写



## 单例

```java
package charactor;

public class GiantDragon {

    private int hp = 5000;
//    私有化构造函数， 使其无法在外部实例化
    private GiantDragon(){

    }
    private static GiantDragon instance = new GiantDragon();

    //对外开放实例
    public static GiantDragon getInstance() {
        return instance;
    }

    public int getHp() {
        return hp;
    }
}

```

#### 

判断两个引用是否指向同一个对象

```

        Hero h1 = new Hero("盖伦");
        Hero h2 = new Hero("嘉文");
        Hero h3 = h1;
        System.out.println(h1.equals(h2));

        System.out.println(h1 == h3);
```

## IO

### 流

就是一系列的数据。

输入流和输出流



##### 字节流

```
File f = new File("/Users/cloud/Desktop/frontEndTestCode/java_study2/src/file/lol.txt");
            //创建基于文件的输入流 通过这个输入流可以读取硬盘的数据到JVM， 读取到内存中
fis = new FileInputStream(f);
            //以字节流的形式读取文件内容
byte[] all = new byte[(int) f.length()];
            // 读取
fis.read(all);
for (byte b : all) {
	System.out.println(b);
}
```

##### 字符流

```
File f = new File("/Users/cloud/Desktop/frontEndTestCode/java_study2/src/file/lol.txt");
        try (FileReader fr = new FileReader(f)) {
            char[] all = new char[(int) f.length()];
            fr.read(all);
            for (char c : all) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
```

##### 缓存流

以介质是硬盘为例，字节流和字符流的弊端： 
在每一次读写的时候，都会访问硬盘。 如果读写的频率比较高的时候，其性能表现不佳。 

为了解决以上弊端，采用缓存流。 
缓存流在读取的时候，会一次性读较多的数据到缓存中，以后每一次的读取，都是在缓存中访问，直到缓存中的数据读取完毕，再到硬盘中读取。 

就好比吃饭，不用缓存就是每吃一口都到锅里去铲。用缓存就是先把饭盛到碗里，碗里的吃完了，再到锅里去铲 

缓存流在写入数据的时候，会先把数据写入到缓存区，直到缓存区达到一定的量，才把这些数据，一起写入到硬盘中去。按照这种操作模式，就不会像字节流，字符流那样每写一个字节都访问硬盘，从而减少了IO操作

```
File f = new File("/src/file/buffer.txt");
		//缓存流读取
        //缓存流必须创建在一个存在的流的基础上
        try(FileReader fr = new FileReader(f);BufferedReader br = new BufferedReader(fr)){

            while (true){
                String line = br.readLine();
                if(null == line){
                    break;
                }
                System.out.println(line);
            }

        }catch(IOException e){
            e.printStackTrace();
        }

        //缓存流写入
        File f2 = new File("/Users/cloud/Desktop/frontEndTestCode/java_study2/src/file/buffer2.txt");
        //缓存流 必须建立在一个存在的流之上
        try(FileWriter fw = new FileWriter(f2); PrintWriter pw = new PrintWriter(f2)){
            pw.println("cao qing is a silly boy!");
            //flush 强制把缓存中的数据写入硬盘， 无论缓存是否满了
            pw.flush();
            pw.println("the second line!");
            pw.println("the third line!");
        }catch (IOException e){
            e.printStackTrace();
        }
```

##### 数据流

**DataInputStream 数据输入流**

**DataOutputStream 数据输出流**

要用DataInputStream 读取一个文件，这个文件必须是由DataOutputStream 写出的，否则会出现EOFException，因为DataOutputStream 在写出的时候会做一些特殊标记，只有DataInputStream 才能成功的读取

```
   private static void read() {
        File f =new File("d:/lol.txt");
        try (
                FileInputStream fis  = new FileInputStream(f);
                DataInputStream dis =new DataInputStream(fis);
        ){
            boolean b= dis.readBoolean();
            int i = dis.readInt();
            String str = dis.readUTF();
             
            System.out.println("读取到布尔值:"+b);
            System.out.println("读取到整数:"+i);
            System.out.println("读取到字符串:"+str);
 
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
 
    private static void write() {
        File f =new File("d:/lol.txt");
        try (
                FileOutputStream fos  = new FileOutputStream(f);
                DataOutputStream dos =new DataOutputStream(fos);
        ){
            dos.writeBoolean(true);
            dos.writeInt(300);
            dos.writeUTF("123 this is gareen");
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
```

##### 对象流

序列化，该对象所对应的类，必须是实现Serializable接口

```
  File f = new File("/Users/cloud/Desktop/frontEndTestCode/java_study2/src/file/stream/man.json");
        try (
                //创建对象输出流
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                //创建对象输入流
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);

                ) {

            oos.writeObject(m);
            Man m2 = (Man) ois.readObject();
            System.out.println(m2.name + m2.age);

        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
```

![image-20180907115240729](/var/folders/db/7574691s4_z_z2n06_w05h7w0000gn/T/abnerworks.Typora/image-20180907115240729.png)





### 集合框架 ---- 容器

数组创建之后就是固定的长度， 不可以修改

`ArrayList` 容器的容量会随着内容的增加， 自动增长

##### 遍历

```java
  //for 循环遍历
        List<Person> ps2 = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            ps2.add(new Person("name" + i));
        }
        System.out.println("=======for循环遍历=======");
        for(int i = 0, size = ps2.size(); i < size; i++){
            Person p = ps2.get(i);
            System.out.println(p.name);
        }

        System.out.println("=======迭代器遍历========");
        Iterator<Person> It = ps2.iterator();
        while(It.hasNext()){
            Person p = It.next();
            System.out.println(p.name);
        }
        System.out.println("=======增强型for循环========");
        for(Person p : ps2){
            System.out.println(p.name);
        }
```

##### collections是容器的工具类， 类似于Arrays是数组的工具类

HashSet 无序

LinkedHashSet 按照插入顺序

TreeSet 从小到大排序

##### 比较器

```

  Random r =new Random();
        List<Hero> heros = new ArrayList<Hero>();
            
        for (int i = 0; i < 10; i++) {
            //通过随机值实例化hero的hp和damage
            heros.add(new Hero("hero "+ i, r.nextInt(100), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
            
        //直接调用sort会出现编译错误，因为Hero有各种属性
        //到底按照哪种属性进行比较，Collections也不知道，不确定，所以没法排
        //Collections.sort(heros);
            
        //引入Comparator，指定比较的算法
        Comparator<Hero> c = new Comparator<Hero>() {
            @Override
            public int compare(Hero h1, Hero h2) {
                //按照hp进行排序
                if(h1.hp>=h2.hp)
                    return 1;  //正数表示h1比h2要大
                else
                    return -1;
            }
        };
        Collections.sort(heros,c);
        System.out.println("按照血量排序后的集合：");
        System.out.println(heros);
```

## 原子性操作

不可中断的操作

## JDBC (Java database connection)

#### 事务

```java

            // 有事务的前提下
            // 在事务中的多个操作，要么都成功，要么都失败
  
            c.setAutoCommit(false);
  
            // 加血的SQL
            String sql1 = "update hero set hp = hp +1 where id = 22";
            s.execute(sql1);
  
            // 减血的SQL
            // 不小心写错写成了 updata(而非update)
  
            String sql2 = "updata hero set hp = hp -1 where id = 22";
            s.execute(sql2);
  
            // 手动提交
            c.commit();
```

### 类对象

提供类本身的信息，比如属性和方法等。

一个类只会有一个类对象。



### DAO

Data access object 数据访问对象

### 注解

1. @Override 用在方法上，表示这个方法重写了父类的方法，如toString()。
   如果父类没有这个方法，那么就无法编译通过，如例所示，在fromString()方法上加上@Override 注解，就会失败，因为Hero类的父类Object，并没有fromString方法

2. @Deprecated 表示这个方法已经过期，不建议开发者使用。(暗示在将来某个不确定的版本，就有可能会取消掉)

   如例所示，开地图这个方法hackMap，被注解为过期，在调用的时候，就会受到提示

3. @SuppressWarnings Suppress英文的意思是抑制的意思，这个注解的用处是忽略警告信息。
   比如大家使用集合的时候，有时候为了偷懒，会不写泛型。

   @SuppressWarnings 有常见的值，分别对应如下意思
   1.deprecation：使用了不赞成使用的类或方法时的警告(使用@Deprecated使得编译器产生的警告)；
   2.unchecked：执行了未检查的转换时的警告，例如当使用集合时没有用泛型 (Generics) 来指定集合保存的类型; 关闭编译器警告
   3.fallthrough：当 Switch 程序块直接通往下一种情况而没有 Break 时的警告;
   4.path：在类路径、源文件路径等中有不存在的路径时的警告;
   5.serial：当在可序列化的类上缺少 serialVersionUID 定义时的警告;
   6.finally：任何 finally 子句不能正常完成时的警告;
   7.rawtypes 泛型类型未指明
   8.unused 引用定义了，但是没有被使用
   9.all：关于以上所有情况的警告。打sd阿萨德

4. ​

   @SafeVarargs 这是1.7 之后新加入的基本注解. 如例所示，当使用[可变数量的参数](http://how2j.cn/k/class-object/class-object-overload/291.html#step705)的时候，而参数的类型又是泛型T的话，就会出现警告。 这个时候，就使用@SafeVarargs来去掉这个警告
   @SafeVarargs注解只能用在参数长度可变的方法或构造方法上，且方法必须声明为static或final，否则会出现编译错误。一个方法使用@SafeVarargs注解的前提是，开发人员必须确保这个方法的实现中对泛型类型参数的处理不会引发类型安全问题。

5. 4

6. 6



## log4j 日志系统

### log4j.properties配置文件

```
log4j.rootLogger=debug, stdout, R

log4j.appender.stdout=org.apache.log4j.ConsoleAppender
log4j.appender.stdout.layout=org.apache.log4j.PatternLayout

# Pattern to output the caller's file name and line number.
log4j.appender.stdout.layout.ConversionPattern=%5p [%t] (%F:%L) - %m%n

log4j.appender.R=org.apache.log4j.RollingFileAppender
log4j.appender.R.File=example.log

log4j.appender.R.MaxFileSize=100KB
# Keep one backup file
log4j.appender.R.MaxBackupIndex=5

log4j.appender.R.layout=org.apache.log4j.PatternLayout
log4j.appender.R.layout.ConversionPattern=%p %t %c - %m%n
```

### 使用log4j

```
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog {
    static Logger logger = Logger.getLogger(TestLog.class);

    public static void main(String[] args) throws InterruptedException{
//        BasicConfigurator.configure(); //默认配置
        PropertyConfigurator.configure("/Users/cloud/Desktop/frontEndTestCode/java_log4j/src/log4j.properties");
        //TRACE DEBUG INFO WARN ERROR FATAL
//        logger.setLevel(Level.TRACE);
        for (int i = 0; i < 5000; i++) {
            logger.trace("跟踪信息");
            logger.debug("调试信息");
            logger.info("输出信息");
            logger.warn("警告信息");
            logger.error("错误信息");
            logger.fatal("致命信息");
        }

    }
}

        
        
```





## Mybatis

```

        //根据配置文件mybatis-config.xml 得到 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //根据sqlSessionFactory 获取session
        SqlSession session=sqlSessionFactory.openSession();
         
//        List<Category> cs=session.selectList("listCategory");
        //查询
       /* List<Category> cs=session.selectList("list5");
        for (Category c : cs) {
            System.out.println(c.getName());
        }*/

        //查询
        /*List<Product> ps = session.selectList("selectAll");
        for(Product p : ps){
            System.out.println(p.getName() + ":::" + p.getPrice());
        }*/

        //新增
     /*   Category cate = new Category();
        cate.setName("Add_name");
        session.insert("addCategory", cate);

       */

        //删除
        /*Category c = new Category();
        c.setId(4);
        session.delete("deleteCategory", c);*/

        //获取
        Category c = session.selectOne("getCategory", 3);
        System.out.println(c.getName());

        //修改
        c.setName("修改了id=3的name");
        session.update("updateCategory", c);


        listAll(session);

        session.commit();
        session.close();



        /*
1. 应用程序找Mybatis要数据
2. mybatis从数据库中找来数据
    2.1 通过mybatis-config.xml 定位哪个数据库
    2.2 通过Category.xml执行对应的select语句
    2.3 基于Category.xml把返回的数据库记录封装在Category对象中
    2.4 把多个Category对象装在一个Category集合中
3. 返回一个Category集合
        *
        * */
```

## 部署SpringBoot

### jar

```
mvn install
上传jar包到服务器
java -jar xxxx.jar
```



## 反射

将类的各个组成部分封装为其他的对象

​	1、可以在程序的运行过程中操作这些对象

​	2、解耦