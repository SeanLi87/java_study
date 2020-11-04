package com.suitedemo;

import com.testcase.BuyTest;
import com.testcase.LoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/*
* 测试套件示例：
* @RunWith(Suite.class)
* @Suite.Suite({
* junit1.class,
* junit2.class})
* public class XXX(){}
* */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        //以下测试类将会顺序执行
        LoginTest.class,
        BuyTest.class

})

public class SuiteTest {
}
