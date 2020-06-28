package com.sean.demo02;
/*
* 创建对象的标准格式：
*   类名称 对象名 = new 类名称();
* 匿名对象就是只有左边的: new 类名称();
* 注意事项：匿名对象只能使用唯一的一次，如果下次需要再次使用，则需要重新new
* 使用建议：如果确定对象只需要使用一次，那么就可以使用匿名对象
* */
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "小明";
        one.show();
        new Person().name = "小王";
        new Person().show();//为null
    }
}
