package com.testcase;

/*
* Junit4常用注解
* 1. @BeforeClass 在所有用例执行前执行一次该方法
* 2. @Before 在每个用例执行前执行一次该方法
* 3. @AfterClass 在所有用例执行后执行一次该方法
* 4. @After 在每个用例执行后执行一次该方法
* 5. @Test 表示下面方法是一个测试用例
* 6. @Ignore
*       加到case上时，执行整个测试类时会忽略该测试用例，用例可以单独执行
*       加到class上时，会忽略整个测试类
*
* 在命令行用maven执行用例
* 需要进入有pom文件的目录执行 mvn clean test
* */

import org.junit.*;

public class Demo01Junit4Test {

    @BeforeClass

    public static void beforeClass() {
        System.out.println("before class");
    }

    @Before
    public void before() {
        System.out.println("before");
    }

    @Test
    public void fun1() {
        System.out.println("Hello,test1");
    }

    @Test
    public void fun2() {
        System.out.println("Hello,test2");
    }

    @Test
    @Ignore
    public void fun3() {
        System.out.println("Hello,test3");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
    }
}
