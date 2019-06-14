package chuanzhi0614.test;

import chuanzhi0614.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    /**
     * 测试开始前都会执行的方法， 用于一些重复的操作， 比如资源的申请
     */
    @Before
    public void init(){
        System.out.println("开始之前");
    }

    /**
     * 释放资源的方法 所有测试方法执行之后会执行的方法
     */
    @After
    public void close(){
        System.out.println("close");
    }

    /**
     * 测试add方法
     */
    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        int add = c.add(1, 2);
        System.out.println(add);
        //        断言
        Assert.assertEquals(3, add);
    }
}
