package com.testcase;


import org.junit.*;

public class Demo02Junit4Test {

    @BeforeClass

    public static void beforeClass() {
        System.out.println("before class");
    }

    @Before
    public void before() {
        System.out.println("before");
    }

    @Test
    public void fun4() {
        System.out.println("Hello,test4");
    }

    @Test
    public void fun5() {
        System.out.println("Hello,test5");
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
