package com.sean.demo06;

/*
 * 使用类的继承演示向上转型
 * */
public class Demo01Cat {
    public static void main(String[] args) {
        // 对象的向上转型，就是，父类引用指向子类对象，多态的写法
        Animal animal = new Cat();
        animal.eat();
        System.out.println(animal);
        System.out.println("============");
//        animal.catchMouse();//错误写法
        //向下转型，进行还原包动作
        Cat cat = (Cat) animal;
        cat.catchMouse();
        System.out.println(cat);

    }
}
